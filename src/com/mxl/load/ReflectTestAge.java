package com.mxl.load;

import java.util.logging.Logger;

public class ReflectTestAge {

	private static final int _1MB = 1024*1024;
	
	public static void testAllocation(){
		byte[] allocation1 , allocation2 , allocation3 , allocation4;
		allocation1 = new byte[_1MB/4];
		allocation2 = new byte[4 * _1MB];
		allocation3 = new byte[4 * _1MB];
		allocation3 = null;
		allocation4 = new byte[4 * _1MB];
	}
	
	public static void main(String[] args) {
		ReflectTestAge.testAllocation();
	}
	
}
