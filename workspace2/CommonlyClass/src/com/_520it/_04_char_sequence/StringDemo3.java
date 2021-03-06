package com._520it._04_char_sequence;

public class StringDemo3 {
	public static void main(String[] args) {
		/*2):获取字符串信息
				int length() 返回此字符串的长度 
				char charAt(int index) 返回指定索引处的 char 值 
				int indexOf(String str)返回指定子字符串在此字符串中第一次出现处的索引。 
				int lastIndexOf(String str)返回指定子字符串在此字符串中最右边出现处的索引 
		 * */
		
		//  1) int length() 返回此字符串的长度
		System.out.println("abcd12啊".length()); //7
		String s1 = new String("asd12啊");
		System.out.println(s1.length());  //6
		
		// 2) char charAt(int index) 返回指定索引处的 char 值
		String s2 = "A B C ";
		char c2 = s2.charAt(1);  // 空格也是一个字符char
		System.out.println(c2);
		//System.out.println(s2.charAt(12));  //报错 索引越界
		
		//  3)  int indexOf(String str)返回指定子字符串在此字符串中第一次出现处的索引。
		//  4)  int lastIndexOf(String str)返回指定子字符串在此字符串中最右边出现处的索引 
		String s3 = "AABSAABABAVAA";
		System.out.println(s3.indexOf("BA")); //第一次出现的索引
		System.out.println(s3.lastIndexOf("BA"));  //最后一次出现的索引
		
		
		
		
	}

}
