package com._520it.day01._01_file;

import java.io.File;


//ϵͳƽ̨�ķָ���
public class FileDemo {
	public static void main(String[] args) {
		String str = File.pathSeparator;
		System.out.println(str);
		char c = File.pathSeparatorChar;
		System.out.println(c);
		
		
		String str2 = File.separator;
		char c2 = File.separatorChar;
		System.out.println(str2);
		System.out.println(c2);
		System.out.println("===============");
		
		//����File����
		File f = new File("C/abc/123.test");
		System.out.println(f);
		
		File f2 = new File("C/abc/123", "anb.txt");
		System.out.println(f2);
		
		File parent = new File("C/abc/123");
		File f3 = new File(parent, "123.txt");
		System.out.println(f3);
		
	}
}
