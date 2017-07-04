package com.mxl.sychron;

public class SychronizedTest {
	
	private static int num = 0;
	
	public static void run(String tag){
		if (tag.equals("a")) {
			num = 100;
			System.out.println(tag + " update num = " + num);
		}else {
			num = 200;
			System.out.println(tag + " update num = " + num);
		}
		
		System.out.println(tag + " final update num = " + num);
	}
	
	public static void main(String[] args) {
		final SychronizedTest s1 = new SychronizedTest();
		final SychronizedTest s2 = new SychronizedTest();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				SychronizedTest.run("a");
			}
		} ,"t1");
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				SychronizedTest.run("b");
			}
		} ,"t2");
		
		t1.start();
		t2.start();
	}

}
