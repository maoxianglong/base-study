package com.mxl.study;

import java.util.Scanner;

public class CalendarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����������������������۸񣬲���-�ָ���");
		String strIn = scan.nextLine();
		Scanner sc = new Scanner(strIn);
		sc.useDelimiter("-");
		// ���÷ָ���
		int num = sc.nextInt();
		int bag = sc.nextInt();
		float price = sc.nextFloat();
		double total = price * num * bag;
		System.out.println("�����ܶ�Ϊ��" + total);
	}
}
