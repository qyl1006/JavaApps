package com._520it._04_char_sequence;

import java.awt.print.Printable;
import java.util.Arrays;

public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * 1):String的创建和转换
				String(char[] value):把char数组转换为字符串
				char[] toCharArray():把字符串转换为char数组
				byte[] getBytes():把字符串转换为byte数组
				String(byte[] bytes):把byte数组转换为字符串			
		 * */
		// 1)String(char[] value):把char数组转换为字符串  PS字符串本质上就是char数组
		char[] cs = new char[]{'1', '2', '3', '4'};
		String s = new String(cs);     // 使用String构造器
		System.out.println(s);
	
		// 2) char[] toCharArray():把字符串转换为char数组
		String s2 = "ABCD";
		char[] cs2 = s2.toCharArray();    //String对象调用
		System.out.println(cs2);
		
		// 3) byte[] getBytes():把字符串转换为byte数组
		String s3 = "abcdefg";
		byte[] b3 = s3.getBytes();       //String对象调用
		System.out.println(Arrays.toString(b3));
		
		// 4) String(byte[] bytes):把byte数组转换为字符串
		String s4 = new String(b3);       // 使用String构造器
		System.out.println(s4);
		
	}
}
