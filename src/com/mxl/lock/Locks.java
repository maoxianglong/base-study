package com.mxl.lock;

public class Locks {

    private volatile boolean isLock;

    private static final Locks locks = new Locks();

    public synchronized void lock(){

        while (isLock){
            System.out.println("This thread name comming : " + Thread.currentThread().getName());
        }

        System.out.println("This thread get lock : " + Thread.currentThread().getName());
        isLock = true;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                locks.lock();
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                locks.lock();
            }
        },"t2");

        t1.start();
        t2.start();

    }

}
