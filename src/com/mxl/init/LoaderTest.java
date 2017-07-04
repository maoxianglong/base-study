package com.mxl.init;

public class LoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		System.out.println("classLoad : " + classLoader);
		
		classLoader.loadClass("com.mxl.init.InitTest");
		
		//ʹ��Class.forName���������ִ�г�ʼ����
		Class.forName("com.mxl.init.InitTest");
		
		//ʹ��������������಻��ִ�г�ʼ����
		Class.forName("com.mxl.init.InitTest" , false , classLoader);
		
	}
	
}
