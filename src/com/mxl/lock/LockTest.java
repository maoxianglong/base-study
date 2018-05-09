package com.mxl.lock;

public class LockTest {

    ReetrantLock lock = new ReetrantLock();

    public void inner() throws InterruptedException {
        lock.lock();
        System.out.println("inner method...");
        outer();
        lock.unLock();
    }

    public void outer() throws InterruptedException {
        lock.lock();
        System.out.println("outer method...");
        lock.unLock();
    }

    public static void main(String[] args) {

        LockTest lockTest = new LockTest();
        lockTest.test();

    }

    public void test(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    inner();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }

}
