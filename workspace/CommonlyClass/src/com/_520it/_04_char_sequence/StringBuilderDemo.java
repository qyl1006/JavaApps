package com._520it._04_char_sequence;

public class StringBuilderDemo {
	public static void main(String[] args) {
		
		//演示StringBuilder的方法
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(16);
		sb.append("az").append("qq" + 1 + 1);  //append追加 Object 参数的字符串表示形式
		sb.reverse();      //反转操作
		StringBuilder sb3 = new StringBuilder("qq");
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
}
