package com.mxl.thread;

public class ThreadTest03 {
	
	private static int num = 0;
	
	private synchronized void add(){
		for (int i = 0; i < 1000; i++) {
			num++;
			System.out.println(Thread.currentThread().getName() + ":" + num);
		}
	}
	
	public static void main(String[] args) {
		final ThreadTest03 t = new ThreadTest03();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				t.add();
			}
		} ,"t1");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				t.add();
			}
		} ,"t2");
		
		t1.start();
		t2.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + num);
		
	}

}
