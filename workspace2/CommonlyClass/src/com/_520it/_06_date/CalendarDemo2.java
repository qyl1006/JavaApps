package com._520it._06_date;

import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String[] args) {
		//测试
		Calendar c = Calendar.getInstance();
		c.setTime(new java.util.Date());
		
		//日期加1 时 分秒设置成0
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		java.util.Date d2 = c.getTime();
		
		c.add(Calendar.DAY_OF_MONTH, -7);
		java.util.Date d1 = c.getTime();
		
		System.out.println("开始时间 "+ d1.toLocaleString());
		System.out.println("当前时间: " + d2.toLocaleString());
	}
	/*
	//定义个方法,用于判断某个时间点是否在过去n天中,是返回true 否返回false
	 * 
	 * PS : 如果测试的话  那么怎么才能得到 某个日期时间 的Date  ??
	 * 
	public static boolean judgmentTime(int num, Date date){
		Calendar c = Calendar.getInstance();
		c.setTime(new java.util.Date());
		*/
	}

