package com.mxl.thread;

public class ThreadTest06 {

    protected long count = 0;

    protected static ThreadTest06 threadTest06 = new ThreadTest06();

    public void add(long value){
        this.count = this.count + value;
        System.out.println("count : " + count);
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest06.add(2);
            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadTest06.add(3);
            }
        },"t2");

        t2.start();
        t1.start();

    }

}
