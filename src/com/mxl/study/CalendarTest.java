package com.mxl.study;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ȡ��ʽ�����ڵĹ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		//��ȡ����ǰ��������
		Calendar calendar = Calendar.getInstance();
		Date now = calendar.getTime();
		System.out.println("��ǰ����Ϊ : " + sdf.format(now));
		//�Ե�ǰ������ʱ���10��
		calendar.add(Calendar.DATE,10);
		//��ȡ��ǰ��Date����
		Date tenDaysDate = calendar.getTime();
		//ʹ�ù������ʽ������
		String formatDate = sdf.format(tenDaysDate);
		System.out.println("10���Ϊ : " + formatDate);
	}

}
