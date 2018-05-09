package com.mxl.countdownlatch;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CountDownLatchTest01 implements Runnable{

    private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5));
    private static int count = 2;
    private static int data = 0;
    private static final CountDownLatch latch = new CountDownLatch(count);

    private static synchronized void operate() throws InterruptedException {
        System.out.println("线程名字："+Thread.currentThread().getName());
//        int i = 0;
        for (int j = 0; j < 10; j++){
            data++;
        }
        System.out.println(data);
        Thread.sleep(1000);
    }


    @Override
    public void run() {

        try {
            operate();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatchTest01 c1 = new CountDownLatchTest01();
        for (int i = 0; i < count; i++) {
            //锁是跟着对象的，一直new对象，锁也是多把。
            threadPool.execute(new CountDownLatchTest01());
//            threadPool.execute(c1);
        }
        latch.await();
        System.err.println("等待线程被唤醒！");
        threadPool.shutdown();
    }
}
