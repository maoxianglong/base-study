package com.mxl.sychron;

public class SaleTickeTest {
	
	private int count = 10; 
	
	public synchronized void run(){
		if (count > 0) {
			count--;
			System.out.println(Thread.currentThread().getName() + " ---- " + count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		final SaleTickeTest saleTickeTest = new SaleTickeTest();
		
//		Thread t1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				saleTickeTest.run();
//			}
//		} ,"t1");
//		
//		Thread t2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				saleTickeTest.run();
//			}
//		} ,"t2");
//		
//		Thread t3 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				saleTickeTest.run();
//			}
//		} ,"t3");
		
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					saleTickeTest.run();
				}
			} ,new Integer(i).toString());
			t.start();
		}
		
	}
}
