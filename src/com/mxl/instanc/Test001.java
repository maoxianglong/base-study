package com.mxl.instanc;

public class Test001 {

	public static void main(String[] args) {
		Point point = new Point();
		ColorPoint cP = new ColorPoint();
		Point point2 = new ColorPoint();
		
		System.out.println(point instanceof ColorPoint);//fasle
		System.out.println(cP instanceof Point);//true
		System.out.println(point2 instanceof ColorPoint);//true
		System.out.println(point2 instanceof Point);//true
		
		/**
		 * 子类可以是超类的实例
		 * 超类不可以是子类的实例
		 */
	}
	
}
