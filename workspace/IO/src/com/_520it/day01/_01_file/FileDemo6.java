package com._520it.day01._01_file;

import java.io.File;
/*
 * 批量删除文件名称
 */

public class FileDemo6 {
	public static void main(String[] args) {
		File dir = new File("C:/Users/Qyuelin/Desktop/java_test");
		System.out.println(dir.getName());
		File[] fs = dir.listFiles();
		
		//要删除的部分
		String delete = "小码哥教育-Java学院-任小龙老师-";
		for(File name : fs){
			System.out.println(name.getName());
			if(name.getName().contains(delete)){
				String str = name.getName().replace(delete, "");
				boolean b = name.renameTo(new File(dir, str));
				System.out.println(b);
				System.out.println("测试");
			}
			System.out.println("测试1");
		}
	}
}
