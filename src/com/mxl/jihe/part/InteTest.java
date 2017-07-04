package com.mxl.jihe.part;

public class InteTest {
	
	public static void main(String[] args) {
		
		new InteTest().test02();
		
	}

	private void test01() {
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = "a" + "bc";
		String s6 = "a";
		String s7 = "bc";
		String s5 = s6 + "bc";
		String s8 = s6 + s7;
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);//true
		System.out.println(s1 == s5);//false
		System.out.println(s1 == s8);//false
		System.out.println("--------------");
		//intern()方法返回的总是String Pool里面的对象,而new的字符串对象是存放在Head中的
		System.out.println(s1 == s1.intern());//true
		System.out.println(s1 == s3.intern());//true
		System.out.println(s1 == s5.intern());//true
		System.out.println("--------------");
		System.out.println(s3.intern() == s5.intern());//true
		
	}
	

	public void test02(){
		Integer t1 = 100;
		Integer t2 = 100;
		
		Integer t3 = new Integer(100);
		
		Integer t4 = t3;
		
		System.out.println(t1 == t2);//true
		System.out.println(t1 == t3);//false
		System.out.println(t1 == t4);//false
		
	}
	
}
