package com.mxl.study;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//获取格式化日期的工具类
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		//获取到当前日历对象
		Calendar calendar = Calendar.getInstance();
		Date now = calendar.getTime();
		System.out.println("当前日期为 : " + sdf.format(now));
		//对当前的日历时间加10天
		calendar.add(Calendar.DATE,10);
		//获取当前的Date对象
		Date tenDaysDate = calendar.getTime();
		//使用工具类格式化日期
		String formatDate = sdf.format(tenDaysDate);
		System.out.println("10天后为 : " + formatDate);
	}

}
