package com.mxl.singleton;

public class SingletonTest {

	private static SingletonTest singletonTest;
	
	private SingletonTest(){
		
	}
	
	public synchronized static SingletonTest getInstance(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
			if (singletonTest == null) {
				singletonTest = new SingletonTest();
			}
		
		return singletonTest;
		
	}
	
	public static void main(String[] args) {
		
//		SingletonTest s1 , s2 ,s3;
//		
//		s1 = SingletonTest.getInstance();
//		s2 = SingletonTest.getInstance();
//		s3 = SingletonTest.getInstance();
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println(SingletonTest.getInstance().hashCode());
			}
		} , "t1");
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println(SingletonTest.getInstance().hashCode());
			}
		} , "t2");
		
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				System.out.println(SingletonTest.getInstance().hashCode());
			}
		} , "t3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
