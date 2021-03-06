package com._520it._04_char_sequence;

public class StringDemo6_2 {
	public static void main(String[] args) {
		/*
		 * 需求: String fileNames = "abc.java;hello.txt;hello.java;hello.class";
					获取以hello开头的文件名的的后缀名
		 * */
		String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		
		// 1) 使用 split(String regex)方法拆分成各个文件名,单独组成一个字符串
		String[] fileStr = fileNames.split(";");
		for (String i : fileStr) {
			//System.out.println(i);
			//调用方法startsWith()来测试字符串是否以指定"hello"前缀开始,来筛选
			if (i.startsWith("hello")) {
				System.out.println(i);
				
				//调用方法lastIndexOf来查找"."最后出现的索引值
				int index = i.lastIndexOf(".");
				System.out.println(index);
				//调用方法substring()来截取最后出现"."后面的字符串
				String suffixName = i.substring(index);
				System.out.println(suffixName);
			}
			
		}
	}
}
