package com.mxl.lock;

public class ReetrantLock {

    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while (isLocked){
            System.out.println("I'm waitting...");
            wait();
        }
        isLocked = true;
    }

    public synchronized void unLock(){
        notify();
        isLocked = false;
    }

}
