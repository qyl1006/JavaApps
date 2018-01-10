package day17.char_sequence;

import java.util.Arrays;

/*
 * 练习:
 * 1) String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		String练习-获取以hello开头的文件名的的后缀名
	2) String练习-把单词首字母大写

	总结: 都是调用一些现成的方法组合使用
 */
public class StringExDemo {
	public static void main(String[] args) {
		// 1)
		 String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		 String[] str = fileNames.split(";");
		 System.out.println(Arrays.toString(str));
		 for(String name : str){
			 if (name.startsWith("hello")) {
				System.out.println(name.substring(name.lastIndexOf('.')));
			}
		 }
		 
		//	2)
		 String s = "afgqAGDAK";
		 String ss = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		 System.out.println(ss);
	}
}
