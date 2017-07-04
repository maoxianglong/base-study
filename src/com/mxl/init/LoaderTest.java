package com.mxl.init;

public class LoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		System.out.println("classLoad : " + classLoader);
		
		classLoader.loadClass("com.mxl.init.InitTest");
		
		//使用Class.forName来加载类会执行初始化块
		Class.forName("com.mxl.init.InitTest");
		
		//使用类加载器加载类不会执行初始化块
		Class.forName("com.mxl.init.InitTest" , false , classLoader);
		
	}
	
}
