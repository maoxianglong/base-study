package com.mxl.enumtest;

import java.util.Enumeration;

public class EnumTest {

	class MyData {

		public String[] data;

		// 构造器
		MyData() {
			data = new String[4];
			data[0] = "zero";
			data[1] = "one";
			data[2] = "two";
			data[3] = "three";
		}

		// 返回一个enumeration对象给使用程序
		Enumeration getEnum() {
			return new MyEnumeration(0, data.length, data);
		}

	}

	class MyEnumeration implements Enumeration {
		int count; // 计数器
		int length; // 存储的数组的长度
		Object[] dataArray; // 存储数据数组的引用

		// 构造器
		public MyEnumeration(int count, int length, Object[] dataArray) {
			this.count = count;
			this.length = length;
			this.dataArray = dataArray;
		}

		public boolean hasMoreElements() {
			return (count < length);
		}

		public Object nextElement() {
			return dataArray[count++];
		}
	}

	public static void main(String[] args) {

		EnumTest enumTest = new EnumTest();

		//内部类的实例化
		Enumeration enumeration = enumTest.new MyData().getEnum();

		//Enumeration的遍历
		while (enumeration.hasMoreElements()) {
			String s = (String) enumeration.nextElement();
			System.out.println(s);
		}

	}
}
