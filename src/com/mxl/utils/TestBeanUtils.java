<<<<<<< HEAD
package com.mxl.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class TestBeanUtils {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		
		SourceData sourceDate = new SourceData("ï¿½Ü²ï¿½" , "caocao@163.com" , new Date(0).toString());
		
		TargetData targetData = new TargetData();
		
		//springï¿½Ðµï¿½BeanUtils
//		org.springframework.beans.BeanUtils.copyProperties(sourceDate, targetData);
		
		System.out.println("spring BeanUtils : " + targetData.toString());
		
		//apacheï¿½Ðµï¿½BeanUtils
//		org.apache.commons.beanutils.BeanUtils.copyProperties(targetData, sourceDate);
//		
//		System.out.println("apache BeanUtils : " + targetData.toString());
	}
	
}
=======
//package com.mxl.utils;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.Date;
//
//public class TestBeanUtils {
//
//	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
//
//		SourceData sourceDate = new SourceData("²Ü²Ù" , "caocao@163.com" , new Date(0).toString());
//
//		TargetData targetData = new TargetData();
//
//		//springÖÐµÄBeanUtils
//		org.springframework.beans.BeanUtils.copyProperties(sourceDate, targetData);
//
//		System.out.println("spring BeanUtils : " + targetData.toString());
//
//		//apacheÖÐµÄBeanUtils
////		org.apache.commons.beanutils.BeanUtils.copyProperties(targetData, sourceDate);
////
////		System.out.println("apache BeanUtils : " + targetData.toString());
//	}
//
//}
>>>>>>> origin/master
