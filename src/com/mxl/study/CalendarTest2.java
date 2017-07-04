package com.mxl.study;

import java.util.Scanner;

public class CalendarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请依次输入重量、包数、价格，并以-分隔：");
		String strIn = scan.nextLine();
		Scanner sc = new Scanner(strIn);
		sc.useDelimiter("-");
		// 设置分隔符
		int num = sc.nextInt();
		int bag = sc.nextInt();
		float price = sc.nextFloat();
		double total = price * num * bag;
		System.out.println("销售总额为：" + total);
	}
}
