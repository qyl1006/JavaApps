package com._520it.day02_demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 字节输出流--- IO练习
public class FileWriterDemo {
	public static void main(String[] args) throws Exception {
		// 1) 创建目标对象
		File writer = new File("File/write.txt");
		
		// 2) 创建字节输出流对象
		Writer write = new FileWriter(writer);
		
		// 3)具体IO操作-- 写数据到指定目录文件中
		write.write("ABCDEF--test文件01");
		write.write("\n");
		write.write("ABCDEF--test文件02");
		
		//4) 关闭资源
		write.close();
	}
}
