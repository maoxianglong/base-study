package com.mxl.polymorphic.impl;

import com.mxl.polymorphic.parent.Strategy;

public class ConcreteStrategyA extends Strategy {

	@Override
	public void AlgorithmInterface() {
		System.out.println("算法A的实现");
	}

}
