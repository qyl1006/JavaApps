package com._520it.day01._file_input_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//演示 字节输出流 的使用
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//输出操作
		//创建目标对象
		String file = "File/test.txt";
		
		//创建IO流对象
		FileOutputStream out = new FileOutputStream(file, true);
		
		//具体的IO操作
		out.write("0123456789".getBytes(), 3, 5);
		
		//关闭资源
		out.close();
	}
}
