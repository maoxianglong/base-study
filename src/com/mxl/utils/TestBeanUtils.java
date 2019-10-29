package com.mxl.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class TestBeanUtils {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		
		SourceData sourceDate = new SourceData("�ܲ�" , "caocao@163.com" , new Date(0).toString());
		
		TargetData targetData = new TargetData();
		
		//spring�е�BeanUtils
//		org.springframework.beans.BeanUtils.copyProperties(sourceDate, targetData);
		
		System.out.println("spring BeanUtils : " + targetData.toString());
		
		//apache�е�BeanUtils
//		org.apache.commons.beanutils.BeanUtils.copyProperties(targetData, sourceDate);
//		
//		System.out.println("apache BeanUtils : " + targetData.toString());
	}
	
}
//package com.mxl.utils;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.Date;
//
//public class TestBeanUtils {
//
//	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
//
//		SourceData sourceDate = new SourceData("�ܲ�" , "caocao@163.com" , new Date(0).toString());
//
//		TargetData targetData = new TargetData();
//
//		//spring�е�BeanUtils
//		org.springframework.beans.BeanUtils.copyProperties(sourceDate, targetData);
//
//		System.out.println("spring BeanUtils : " + targetData.toString());
//
//		//apache�е�BeanUtils
////		org.apache.commons.beanutils.BeanUtils.copyProperties(targetData, sourceDate);
////
////		System.out.println("apache BeanUtils : " + targetData.toString());
//	}
//
//}

