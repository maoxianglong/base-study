package com.mxl.thread;

public class ThreadTest05 {

//    private static final Object o = new Object();
    private final Object o = new Object();

    //将启动线程的对象变为同一个静态对象
    private static final ThreadTest05 thread01 = new ThreadTest05();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                new ThreadTest05().show();
                //使用上面定义的静态对象调用互斥代码快，下面两个线程也一样
                thread01.show();
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                new ThreadTest05().show();
                thread01.show();
            }
        }, "t2");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
//                new ThreadTest05().show();
                thread01.show();
            }
        }, "t3");

        t1.start();
        t2.start();
        t3.start();

    }

    public void show() {
        synchronized (o){
            try {
                System.out.println(Thread.currentThread().getName() + "开始休眠");
                Thread.sleep(3000);
                System.out.println("休眠完成" + Thread.currentThread().getName() + "Thread is running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
