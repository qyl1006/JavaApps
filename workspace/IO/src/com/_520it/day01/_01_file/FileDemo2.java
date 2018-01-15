package com._520it.day01._01_file;

import java.io.File;

/*
 *练习File的方法 -->获取File路径和检测状态:

 */
public class FileDemo2 {
	public static void main(String[] args) {
		//创建File对象 
		File f = new File("C:/Users/Qyuelin/Desktop/cmd常见命令.txt");  
//		System.out.println(f);
//		test1(f);
		test2(f);
	}

	private static void test2(File f) {
//		检测File状态的方法:
//			boolean canExecute() :判断是否是可执行文件
		System.out.println(f.canExecute());                    //true
//			boolean canRead() :判断该文件是否可读
		System.out.println(f.canRead());
//			boolean canWrite():判断该文件是否可写
		System.out.println(f.canWrite());
//			boolean isHidden():判断该文件是否是隐藏文件
		System.out.println(f.isHidden());
//			long lastModified():判断该文件的最后修改时间
		System.out.println(new java.util.Date(f.lastModified()).toLocaleString());
//			long length():获取该文件的长度大小(单位字节
		System.out.println(f.length());
	}

	private static void test1(File f) {
//		操作File路径和名称:
//			File getAbsoluteFile() :获取绝对路径
		System.out.println(f.getAbsoluteFile());
//			String getAbsolutePath():获取绝对路径
		System.out.println(f.getAbsolutePath());
//			String getPath() :获取文件路径
		System.out.println(f.getPath()); 
//			String getName() :获取文件名称
		System.out.println(f.getName());  					//cmd常见命令.txt
//			File getParentFile():获取上级目录文件
		System.out.println(f.getParentFile());       //C:\Users\Qyuelin\Desktop
//			String getParent() :获取上级目录路径
		System.out.println(f.getParent());               //C:\Users\Qyuelin\Desktop

	}
}
