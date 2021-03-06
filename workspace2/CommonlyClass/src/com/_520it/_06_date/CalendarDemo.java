package com._520it._06_date;

import java.util.Calendar;


public class CalendarDemo {
	public static void main(String[] args) {
		//创建Calendar对象
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow);
		
		System.out.println("年: " + rightNow.get(Calendar.YEAR));
		System.out.println("月: " + (rightNow.get(Calendar.MONTH)+ 1));
		System.out.println("日: " + rightNow.get(Calendar.DAY_OF_MONTH));
		System.out.println("时: " + rightNow.get(Calendar.HOUR_OF_DAY));
		System.out.println("分: " + rightNow.get(Calendar.MINUTE));
		System.out.println("秒: " + rightNow.get(Calendar.SECOND));
		
		// add() 根据日历的规则，为给定的日历字段添加或减去指定的时间量
		System.out.println("===================================");
		System.out.println(rightNow.getTime().toLocaleString());
		rightNow.add(Calendar.DAY_OF_MONTH, -15);
		System.out.println(rightNow.getTime().toLocaleString());
		
	}
}
