package com.mxl.polymorphic.impl;

import com.mxl.polymorphic.parent.Operate;

public class AddOperate extends Operate {

	@Override
	public double getResult() {
		double result = 0;
		
		this.setNumberA(1);
		this.setNumberB(5);
		
		result = this.getNumberA() + this.getNumberB();
		
		return result;
	}
	
	public static void main(String[] args) {
		Operate operate = new AddOperate();
		System.out.println(operate.getResult());
	}
}
