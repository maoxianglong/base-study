package com.mxl.thread;

public class ThreadTest02 {
	
	private static String str = null;
	
	public static void setValue(String value){
		synchronized (ThreadTest02.class) {
			str = value;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" +str);
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ThreadTest02.setValue("A");
			}
		} ,"t1");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ThreadTest02.setValue("B");
			}
		} ,"t2");
		
		t1.start();
		t2.start();
		
	}

}
