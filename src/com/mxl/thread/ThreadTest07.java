package com.mxl.thread;

public class ThreadTest07 implements Runnable{

    private int i = 10;

    public void add(){
//        int i = 10;
        i++;
        System.out.println("i : " + i);
    }

    public static void main(String[] args) {
        final ThreadTest07 threadTest07 = new ThreadTest07();

        Thread t1 = new Thread(threadTest07);

        Thread t2 = new Thread(threadTest07);

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        add();
    }
}
