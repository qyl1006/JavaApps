package com._520it._06_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;



public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		
		//格式化 --->Date类型对象--------->String类型  String format(Date date) 

		Date d = new Date();
		
		DateFormat time = DateFormat.getInstance();//默认 SHORT风格
		String str = time.format(d);               //17-12-28 下午4:22
		System.out.println(str);
		
		System.out.println("------------------------------------");
		time = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);  //LONG风格
		System.out.println(time.format(d));										  //2017年12月28日 下午04时22分04秒
		
		time = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);//MEDIUM风格
		System.out.println(time.format(d));	                                        //2017-12-28 16:24:09
		
		time = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);//FULL风格
		str = time.format(d);
		System.out.println(str);	  									//2017年12月28日 星期四 下午04时26分04秒 CST
		
		//解析  String类型时间---->Date类型时间   Date parse(String source)  
		System.out.println("========================================");
		Date d2 = time.parse(str);  //FULL风格   解析 同一风格才能解析
		System.out.println(d2);
		
	}
}
