package com.mxl.thread;

public class ThreadLocalTest {

	private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
	
	public void setValue(String value){
		threadLocal.set(value);
	}
	
	public String getValue(){
		return threadLocal.get();
	}
	
	public static void main(String[] args) {
		final ThreadLocalTest test = new ThreadLocalTest();
		
		Thread thread01 = new Thread(new Runnable() {
			@Override
			public void run() {
				test.setValue("AAA");
				System.out.println(Thread.currentThread().getName() + " : " + test.getValue());
			}
		} , "t1");
		
		Thread thread02 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : " + test.getValue());
			}
		} , "t2");
		
		thread01.start();
		thread02.start();
	}
	
}
