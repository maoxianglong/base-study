package com.mxl.inner;

public class OuterClass {
	
	private String s1;
	
	private int num = 1;
	
	class innerClass{
		
		public innerClass() {
			s1 = "hello";
			num = 2;
		}
		
		public void display() {
			System.out.println("Hello World");
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass outerClass = new OuterClass();
		OuterClass.innerClass iClass = outerClass.new innerClass();
		iClass.display();
		System.out.println(outerClass.s1);
		System.out.println(outerClass.num);
		
	}
	
}
