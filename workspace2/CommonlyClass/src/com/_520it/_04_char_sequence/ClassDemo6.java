package com._520it._04_char_sequence;

public class ClassDemo6 {
	public static void main(String[] args) {
		
		//尝试 split()方法  根据给定正则表达式的匹配拆分此字符串  返回字符串组
		String s = "abc.txt;123.java;fdsffs.class";
		String[] s2 = s.split(";");  // 拆分
		System.out.println(s2);
		for (String i : s2) {
			System.out.println(i);
		}
		
		
		// 尝试startWith()方法 测试此字符串从指定索引开始的子字符串是否以指定前缀开始。返回boolean
		System.out.println(s.startsWith("abc."));  //它是指前缀 索引0开始(默认0)
		
		//尝试lastIndexOf(String str)返回指定子字符串在此字符串中最右边出现处的索引。将最右边的空字符串 "" 视为出现在索引值 this.length() 处。返回的索引是
		System.out.println(s.lastIndexOf("."));
		
		//尝试 substring(int beginIndex返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾
		String newStr = s.substring(23);
		System.out.println(newStr);
	}
}
