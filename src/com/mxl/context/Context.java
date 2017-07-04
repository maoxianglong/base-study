package com.mxl.context;

import com.mxl.polymorphic.parent.Strategy;

public class Context {

	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void ContextInterface(){
		strategy.AlgorithmInterface();
	}
}
