package com.mxl.thread;

import java.util.concurrent.*;

public class ThreadTest09 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Task task = new Task();

        FutureTask<String> futureTask = new FutureTask<String>(task);

        executorService.submit(futureTask);

//        System.out.println(futureTask.get());

        if (futureTask.isDone()){
            System.out.println("futureTask已经执行完成了");
            String result = futureTask.get();
            System.out.println(result);
        }else {
            System.out.println("futureTask还未执行完成，继续等待结果");
        }



    }
}

class Task implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("执行call方法");
        return "task01 is running...";
    }
}