package com._520it._04_char_sequence;

public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * 1):String的创建和转换
				String(char[] value):把char数组转换为字符串
				char[] toCharArray():把字符串转换为char数组
				byte[] getBytes():把字符串转换为byte数组
				String(byte[] bytes):把byte数组转换为字符串			
		 * */
		// 1)String(char[] value):把char数组转换为字符串
		char[] cs = new char[]{'1', '2', '3', '4'};
		String s = new String(cs);
		System.out.println(s);
	}
}
