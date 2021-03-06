package com._520it.day01._file_input_stream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//演示 字节输出流 的使用
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//输出操作
		//创建目标对象
		String file = "File/test.txt";
		
		//创建IO流对象
		Writer out = new OutputStreamWriter(new FileOutputStream(file));
		
		//具体的IO操作
		out.write("我欲成仙\n快乐齐天\n字节流转字符流".toCharArray());
		//关闭资源
		out.close();
	}
}
