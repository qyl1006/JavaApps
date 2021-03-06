package com._520it.day01._01_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/*
 * 练习记录File常用方法
 */
public class CommonMethodDemo {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Users/Qyuelin/Desktop/java_test");
		
		// 1) String getAbsolutePath() 获取绝对路径
		String str = dir.getAbsolutePath();
		System.out.println(str); //C:/Users/Qyuelin/Desktop/java_test 
		
		//2)String getName() 获取文件名称
		System.out.println(dir.getName());  //java_test
		
		//3) String getParent()  获取上级目录路径
		System.out.println(dir.getParent()); //C:/Users/Qyuelin/Desktop
		
		// 4) boolean isFile() 是否是文件
		System.out.println(dir.isFile()); // false  -- 当前路径是个目录
		
		// 5) boolean createNewFile() 创建新的文件
		System.out.println(dir.createNewFile());  //false 当前文件已存在
		
		// 6) boolean exists() 判断文件是否存在
		System.out.println(dir.exists()); //true
		
		//7) boolean renameTo(File dest)  重命名 重新修改名称 用处很多
		System.out.println(new File("C:/123/123.txt").renameTo(new File("C:/123/1234.txt"))); //true
		
		//8) boolean isDirectory() 判断是否目录
		System.out.println(new File("C:/123/1234.txt").isDirectory()); //false 文件txt不是目录
		
		//9) boolean mkdirs() 创建当前目录和上级目录  
		System.out.println(new File("C:/123/1234/12345/123456").mkdirs());//true ->C:\123\1234\12345\123456
		
		// 10)File[] listFiles() 列出所有文件对象 -->listFiles(FilenameFilter)-->这个也常用 文件过滤器吧
		System.out.println(Arrays.toString(new File("C:/123/").listFiles())); //[C:\123\1234, C:\123\1234.txt] 
		
		
		
	}
}
