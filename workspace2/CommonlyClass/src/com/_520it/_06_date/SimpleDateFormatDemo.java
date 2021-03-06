package com._520it._06_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		String pattern = "yyy-MM-dd EE a HH:mm:ss"; //自定义日期时间风格
		SimpleDateFormat time = new SimpleDateFormat(); //默认SHORT风格 可自定义
		time.applyPattern(pattern); //申请风格  也可以直接扔给构造器方法去
		
		String str = time.format(new Date());//格式化
		System.out.println(str);
		
		//解析 注意使用什么风格格式化的,必须使用相同风格解析回去
		Date d = time.parse(str);
		System.out.println(d);
		
		//测试  此时的str字符串是自定义风格  现在创建一个默认风格的SimpleDateFormat对象,尝试使用它解析str,应该会报错!
		SimpleDateFormat time2 = new SimpleDateFormat();//默认风格
		Date d2 = time2.parse(str);		////运行报错:异常 
		System.out.println("测试不同风格直接解析:" + d2); 
	}

}
