package com.mxl.gc;

public class GcTest {

	public Object object = null;
	
	public static void main(String[] args) {
		
		GcTest gcTest1 = new GcTest();
		GcTest gcTest2 = new GcTest();
		
		gcTest1.object = gcTest1;
		gcTest2.object = gcTest2;
		
		gcTest1 = null;
		gcTest2 = null;
	}
}
