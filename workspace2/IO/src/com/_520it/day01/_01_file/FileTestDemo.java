package com._520it.day01._01_file;

import java.io.File;

public class FileTestDemo {
	public static void main(String[] args) {
		String dir = "D:/123/";
		File f = new File(dir, "12345.txt");
		System.out.println(f.getParent());
		
		
		//------------------
		//��ȡ��ǰ��Ŀ·��
		String value = System.getProperty("user.dir");
		System.out.println(value);
	}
}