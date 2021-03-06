package com._520it.day01._01_file;

import java.io.File;
import java.io.IOException;

/*
 * 练习File的方法-->File类中方法-文件操作:

 */
public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/Qyuelin/Desktop/java_test/123.java");
		System.out.println(f.isFile());
		
		test1(f);
	}

	private static void test1(File f) throws IOException {
//		boolean isFile() :是否是文件
		System.out.println(f.isFile());
//		
//		static File createTempFile(String prefix, String suffix) :创建临时文件
		File.createTempFile("12345temo", ".tqq1ext", new File("C:/Users/Qyuelin/Desktop/java_test"));
		
//		boolean delete() :删除文件
	//	f.delete();
//		void deleteOnExit() :在JVM停止时删除文件
		
//		boolean exists():判断文件是否存在
//		boolean createNewFile() :创建新的文件
		System.out.println(f.exists());
		if(!f.exists()){
			f.createNewFile();
		}
		System.out.println(f.exists());
//		boolean renameTo(File dest) :重新修改名称
//		f.renameTo(new File("C:/Users/Qyuelin/Desktop/java_test/12345.java")); //重命名操作, 传入的路径和f一样, 若f有文件,就重命名
		
		
		System.out.println(File.listRoots().toString());

	}
}
