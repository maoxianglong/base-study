package com.mxl.work.queue;

//import com.toutiao.sync.collect.CollectTask;
//import com.toutiao.sync.collect.TaskFactory;
//import com.toutiao.sync.utils.JsonUtils;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang3.exception.ExceptionUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @author chenliang 消息触发器服务 负责有事件时触发的业务
 */
public class WorkQueueService {
//    private static final Logger logger = LoggerFactory.getLogger(WorkQueueService.class);

    private final String[] TASK_TYPE = new String[] { "browseThread"};

    private Map<String, ConcurrentLinkedQueue<CollectTask>> workQueueMap = new HashMap<>();
    
    public WorkQueueService() {
        for (final String type : TASK_TYPE)
            workQueueMap.put(type, new ConcurrentLinkedQueue<CollectTask>());
    }
    
    public String status() {
        Map<String, Object> map = new HashMap<>();
        for (final String taskType : TASK_TYPE) {
            map.put(taskType , estimateCount(taskType));
        }
        
//        return JsonUtils.jacksonFormat(map);
        return null;
    }

    public int estimateCount(final String type) {
        return workQueueMap.get(type).size();
    }

    public void addTarget(final String type, final String target) {
        workQueueMap.get(type).add(TaskFactory.makeTask(target, type, Instant.now().toEpochMilli()));
    }

//    @NotNull
    public List<CollectTask> fetchTask(final String type, int limit) {
        List<CollectTask> retList = new ArrayList<CollectTask>(workQueueMap.get(type).size());
        Set<String> taskAlreadyAdded = new HashSet<>();

        CollectTask ct = workQueueMap.get(type).poll();
        long now = Instant.now().getEpochSecond();
        int expiredCount = 0;

        while (ct != null) {
            final String target = ct.getTarget();
            long taskReqTime  = ct.getTimestamp();
            if ((now - taskReqTime) > 60 * 60 * 24) {
                expiredCount++;
//                logger.warn("[EXPIRED] {} [{}] {} {}", type, target, taskReqTime, now - taskReqTime);
                limit++;
                ct = workQueueMap.get(type).poll();
                continue;
            }

            if (!taskAlreadyAdded.contains(target)) {
                retList.add(ct);
                taskAlreadyAdded.add(target);
            }

            if (--limit <= 0)
                break;

            ct = workQueueMap.get(type).poll();
        }
        
        if (expiredCount > 0) {
//            logger.warn("[FOUND-EXPIRED] {} {}/{}", type, expiredCount, retList.size());
        }

        return retList;
    }

    public void concurrentExecute(final String type, List<CollectTask> taskList, Consumer<CollectTask> consumer) {
        if (taskList.isEmpty())
            return;

        int size = taskList.size();
        ExecutorService executor = Executors.newFixedThreadPool(30);
//        taskList.forEach(task -> executor.execute(() -> consumer.accept(task)));
        executor.execute(() -> consumer.accept(null));
//        executor.shutdown();

        try {
            boolean ok = executor.awaitTermination(3, TimeUnit.MINUTES);
            if (ok)
//                logger.info("concurrentExecute end try-updated type:{} size:{}", type, size);
                System.out.println("concurrentExecute end try-updated type" + type + "size:" + size);
            else
//                logger.warn("concurrentExecute end try-updated type:{} size:{}, got timeout", type, size);
                System.err.println("concurrentExecute end try-updated type" + type + "size:" + size);
        } catch (Exception e) {
//            logger.error("{}", StringUtils.left(ExceptionUtils.getStackTrace(e), 64));
        }

    }

    public void concurrentExecuteTasks(final String type, List<CollectTask> taskList, Consumer<List<CollectTask>> consumer) {
        if (taskList.isEmpty())
            return;

        int size = taskList.size();
        ExecutorService executor = Executors.newFixedThreadPool(30);
//        taskList.forEach(task -> executor.execute(() -> consumer.accept(task)));
        executor.execute(() -> consumer.accept(taskList));
        executor.shutdown();

        try {
            boolean ok = executor.awaitTermination(3, TimeUnit.MINUTES);
            if (ok)
//                logger.info("concurrentExecute end try-updated type:{} size:{}", type, size);
                System.out.println("concurrentExecute end try-updated type:"+ type +" size:" + size);
            else
//                logger.warn("concurrentExecute end try-updated type:{} size:{}, got timeout", type, size);
                System.err.println("concurrentExecute end try-updated type:"+ type +" size:" + size);

        } catch (Exception e) {
//            logger.error("{}", StringUtils.left(ExceptionUtils.getStackTrace(e), 64));
        }

    }
}
