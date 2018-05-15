package com.mxl.thread;

public class ThreadTest08 implements Runnable{


    //volatile关键字能够让变量在多个线程之间可见，即变量的赋值都是去主内存中获取数据。
    //public boolean stop = false;
    public volatile boolean stop = false;

    @Override
    public void run() {

        /**
         * 即使t2把stop置为true，t1依然会阻塞在while循环中。
         */
        System.out.println("Thread name : " + Thread.currentThread().getName());
        if (Thread.currentThread().getName().equals("t2")) stop = true;

        while(!stop){

        }
//        stop = true;
        System.out.println("stop : " + stop);
    }

    public static void main(String[] args) {
        final ThreadTest08 threadTest08 = new ThreadTest08();

        Thread t1 = new Thread(threadTest08,"t1");
        Thread t2 = new Thread(threadTest08,"t2");

        t1.start();
        t2.start();
    }
}
