package com.mxl.test;
import java.util.concurrent.CountDownLatch;
public class Play {
    private static int threadNum = 100;
    private static CountDownLatch cdl = new CountDownLatch(threadNum);
    private static int count =0;

    private static void inc()throws Exception{
        Thread.sleep(100);
        count++;
    }

    public static void main(String[] args) {
        try {
            for(int i=0;i<threadNum;i++){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            inc();
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
                            cdl.countDown();
                        }
                    }
                }).start();
            }
            cdl.await();
            System.out.println(cdl.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count="+ Play.count);
    }
}