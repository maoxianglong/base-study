package com.mxl.jihe.part;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList extends Thread{
	
	private static List<String> list = new ArrayList<String>();
	
	public void addCount() throws InterruptedException{
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println("当前线程 : " + Thread.currentThread().getName());
		System.out.println("大小 : " + list.size());
	}
	
	@Override
	public void run() {
		try {
			addCount();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		TestArrayList t1 = new TestArrayList();
		t1.setName("t1");
		
		TestArrayList t2 = new TestArrayList();
		t2.setName("t2");
		
		t1.start();
		t2.start();
		
//		
//		Thread thread01 = new Thread();
//		thread01.setName("Thread01");
//		Thread thread02 = new Thread();
//		thread02.setName("Thread02");
//		
//		thread01.start();
//		
//		thread02.start();
		
	}
	
}
