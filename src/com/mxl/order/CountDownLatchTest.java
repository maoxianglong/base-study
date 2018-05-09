package com.mxl.order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


/**
 *
 * @author MXL 2018年5月8日
 *
 */
public class CountDownLatchTest implements Runnable{

    final AtomicInteger number = new AtomicInteger();  
    volatile boolean bol = false;  
    static 	Random rm = new Random();
  
    @Override  
    public void run() {
        
        System.out.println(number.getAndIncrement());  
        List<String> list  =new ArrayList<String>();
        synchronized (this) {  
            try {  
            	System.out.println("当前线程ID为："+Thread.currentThread().getId());
                if (!bol) {  
                    System.out.println(bol);  
                    bol = true;  
                    Thread.sleep(3000);
                }  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
            String ss = generateBusinessNo();
            list.add(ss);
            String str = "随机数"+ss;
            System.out.println(str);
            System.out.println("并发数量为" + number.intValue()+ "时间为:"+System.currentTimeMillis());  
        }  
  
    }  
  
    public static void main(String[] args) {

        //使用线程池启动CountDownLatch
        ExecutorService pool = Executors.newCachedThreadPool();
        CountDownLatchTest test = new CountDownLatchTest();
        //500并发，实际没这么大
        for (int i=0;i<500;i++) {  
            pool.execute(test);  
        }

    }  

	private static synchronized  String getFixLenthString(int strLength) {

        Random rm = new Random();
		// 获得随机数
		double pross = (1 + rm.nextDouble()) * Math.pow(10, strLength);
		// 将获得的获得随机数转化为字符串
		String fixLenthString = String.valueOf(pross);
		// 返回固定的长度的随机数
		return fixLenthString.substring(1, strLength + 1);

	}
	
    public static String currentDateString(String pattern) {

        if (pattern == null)
            pattern = "yyyyMMddHHmmss";
        return (new SimpleDateFormat(pattern).format(new Date()));

    }

    /**
     * 这里模拟订单生成规则，时间戳+两位随机数
     * 正常订单包含的不止是这些，这里只做模拟
     * @return
     */
    public static synchronized String generateBusinessNo() {
        String currentDateTime = currentDateString("yyyyMMddHHmmssSSS");
        System.out.println(currentDateTime);
        String no =  currentDateTime +(int)(Math.random()*100);
        System.out.println(no);
//		LoggerUtils.debug(OrderNumberUtil.class, "getFixLenthString orderNo="+no);
        return no;
    }

}  