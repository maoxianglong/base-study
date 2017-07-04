package com.mxl.polymorphic.impl;

import com.mxl.polymorphic.parent.Strategy;

public class ConcreteStrategyB extends Strategy{

	@Override
	public void AlgorithmInterface() {
		System.out.println("算法B的实现");
	}

}
