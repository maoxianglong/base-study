package com.mxl.utils;

public class Child extends Father {

	static{
		System.out.println("child static...");
	}
	
	private int n = 20;
	
	{
		x = 30;
	}
	
	public Child(){
		this("the other contrust");
		System.out.println("child constructor body : " + n);
	}
	
	public Child(String s){
		System.out.println(s);
	}
	
	public void age(){
		System.out.println("age = " + n);
	}
	
	public void printX(){
		System.out.println("x = " + x);
	}
	
//	public static void main(String[] args) {
//		new Child().printX();
//	}
	
//	public static void main(String[] args) {
//		String a = "a";
//		String b = "b";
//		String ab = "ab";
//		String abc = "a" + "b";
//		
//		System.out.println(ab == abc);
//		
//		System.out.println(ab == a+b);
//		
//	}
}
