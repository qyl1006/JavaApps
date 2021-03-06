package com._520it._06_date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		// 1)创建Date对象
		Date time = new Date();
		System.out.println(time);
		
		//2) 传入时间 创建对象-----试试当前系统时间
		Date time3 = new Date(System.currentTimeMillis());
		System.out.println("传入参数创建Date对象: " + time3.toLocaleString());
		System.out.println("试试" + new Date(9999999999999L).toLocaleString());
		
		
		//当前时间转换成long
		long time2 = time.getTime();
		System.out.println(time2);
		
		//打印形式cn风格时间格式
		System.out.println(new Date().toLocaleString());
		System.out.println(new Date().toString());
	}
}
