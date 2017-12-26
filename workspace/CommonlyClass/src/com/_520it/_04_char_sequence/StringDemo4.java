package com._520it._04_char_sequence;

public class StringDemo4 {
	public static void main(String[] args) {
		/*
		 * 4):字符串比较判断
				boolean equals(Object anObject) 将此字符串与指定的对象比较。 
				boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写
				boolean contentEquals(CharSequence cs) 将此字符串与指定的 CharSequence 比较
		 * */
		
		
		// 1) boolean equals(Object anObject) 将此字符串与指定的对象比较  比较的是最终内存存储的值
		String s1 = new String("ab");
		String ss2 = s1 + "cd";
		String ss1 = "ab" + "cd";
		System.out.println(ss2.equals(ss1));
		
		// 2) boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写
		String s2 = "ABcd";
		String s22 = "abcd";
		System.out.println(s2.equalsIgnoreCase(s2));  //true
		System.out.println(s2.equals(ss2));           //false 不区分大小写
		
		// 3) boolean contentEquals(CharSequence cs) 将此字符串与指定的 CharSequence 比较
		String s3 = "ABCDE";
		String s33 = "ABCDE";
		System.out.println(s3.contentEquals(s33));  //true  等价于第一个 equals  
		
		
		
	}
}
