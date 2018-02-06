package com.mxl.enumtest;

import java.util.Enumeration;

public class EnumTest {

	class MyData {

		public String[] data;

		// ������
		MyData() {
			data = new String[4];
			data[0] = "zero";
			data[1] = "one";
			data[2] = "two";
			data[3] = "three";
		}

		// ����һ��enumeration�����ʹ�ó���
		Enumeration getEnum() {
			return new MyEnumeration(0, data.length, data);
		}

	}

	class MyEnumeration implements Enumeration {
		int count; // ������
		int length; // �洢������ĳ���
		Object[] dataArray; // �洢�������������

		// ������
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

		//�ڲ����ʵ����
		Enumeration enumeration = enumTest.new MyData().getEnum();

		//Enumeration�ı���
		while (enumeration.hasMoreElements()) {
			String s = (String) enumeration.nextElement();
			System.out.println(s);
		}

	}
}
