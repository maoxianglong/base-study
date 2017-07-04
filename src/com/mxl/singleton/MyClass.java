package com.mxl.singleton;

public class MyClass {
	
	private String Name;
	
	private static Object o = new Object();
	private static MyClass Instance = null;
	
	private MyClass(){
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Name = "test case";
	}
	
	public static MyClass getInstance(){
		if (Instance == null) {
			synchronized (o) {
				if (Instance == null) {
					Instance = new MyClass();
				}
			}
		}
		return Instance;
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				MyClass m1 = MyClass.getInstance();
				System.out.println(m1.hashCode());
			}
		} ,"t1");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				MyClass m2 = MyClass.getInstance();
				System.out.println(m2.hashCode());
			}
		} ,"t2");
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				MyClass m3 = MyClass.getInstance();
				System.out.println(m3.hashCode());
			}
		} ,"t3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
