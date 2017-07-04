package com.mxl.thread;

public class ThreadTest04 {
	
	private static int count = 10;
	
	public synchronized void sale(){
		for (int i = 0; i < count; i++) {
			if (count >= 0) {
				count--;
				System.out.println(Thread.currentThread().getName() + "Âô³öµÚ" + count +"ÕÅ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		final ThreadTest04 t = new ThreadTest04();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				t.sale();
			}
		} ,"t1");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				t.sale();
			}
		} ,"t2");
		
		t1.start();
		t2.start();
	}
	
}
