package com.mxl.context;

public class AutoBoxing {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		
		long sum = 0L;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(time2 - time1);
	}
	
}
