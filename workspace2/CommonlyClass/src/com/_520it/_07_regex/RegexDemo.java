package com._520it._07_regex;

//正则表达式  注意:java中 一根 '/' 表示转义  两根' //'才表示反斜线  /
public class RegexDemo {
	public static void main(String[] args) {
		//验证手机号码
		String phoneNumber = "13377129877";
		String regex = "^1[3|4|5|7|8][0-9]{9}$";
		System.out.println(phoneNumber.matches(regex));
		
		//验证Email地址
		String email = "yuelin123A@gmail.cn";
		String regex2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"; 
		System.out.println(email.matches(regex2));
		
		//只能输入汉字
		String input = "栈帧岁数大的方式";
		String regex3 = "^[\u4e00-\u9fa5]{0,}$";
		System.out.println(input.matches(regex3));
		
		
	}
}
