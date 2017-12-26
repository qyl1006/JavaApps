package com._520it._04_char_sequence;

public class StrinngDemo1 {
	public static void main(String[] args) {
		/*
		String str1 = "ABC";
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		*/
		// String面试题  注意内存图 常量池(运行常量池)   (编译常量池'不研究')
		String str1 = "ABCD";
		String str2 = "A" + "B" + "C" + "D";
		String str3 = "AB" + "CD";
		String str4 = new String("ABCD");
		String temp = "AB";
		String temp2 = "ABCD";
		String str5 = temp + "CD";
		String str6 = getXx() + "CD";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		
		System.out.println(str1 == str5);  //地址值不同
		System.out.println(str1 == str6);
		System.out.println("=======================");
		System.out.println("str5哈希码: " + str5.hashCode());
		System.out.println("str1哈希码: " + str1.hashCode());
		System.out.println(str1.equals(str5)); 
		
	}
	private static String getXx() {
		return "AB";
	}

}
