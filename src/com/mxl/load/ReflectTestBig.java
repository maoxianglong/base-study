package com.mxl.load;

import java.util.logging.Logger;

public class ReflectTestBig {

	private static final int _1MB = 1024*1024;
	
	public static void testAllocation(){
		byte[] allocation2 , allocation3 , allocation4;
//		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		allocation4 = new byte[6 * _1MB];
	}
	
	public static void main(String[] args) {
		ReflectTestBig.testAllocation();
	}
	
}
