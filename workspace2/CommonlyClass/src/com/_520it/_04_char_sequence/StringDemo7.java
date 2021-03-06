package com._520it._04_char_sequence;

public class StringDemo7 {
	public static void main(String[] args) {
		/*
		 * 需求: 把首字母大写,其它小写
		 * */
		String str = "sCHooL";
		
		/*思路: 1)先截取str的第一个字符---大写操作
				2)在截取str的第一个字符之后的所有字符-----小写操作
				3)把1) 与  2) 两个截取的字符串 + 起来
		*/
		
		// 1) 先截取str的第一个字符---大写操作
		String initials =str.substring(0, 1).toUpperCase();
		System.out.println(initials);
		
		//2)  在截取str的第一个字符之后的所有字符-----小写操作
		String other = str.substring(1).toLowerCase();
		System.out.println(other);
		
		//3) 把1) 与  2) 两个截取的字符串 + 起来
		String word = initials + other;
		System.out.println(word);
	}
}
