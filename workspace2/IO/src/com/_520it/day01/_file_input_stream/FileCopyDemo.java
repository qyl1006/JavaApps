package com._520it.day01._file_input_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/*
 * 需求: 利用字节输入输出流来完成.txt文件的拷贝操作
 */
public class FileCopyDemo {
	public static void main(String[] args) throws Exception {
		// 1) 创建源 和目标对象
		String inStr = "File/test.txt";
		String outStr = "File/copy.txt";
		
		// 2) 创建IO流对象  (输入 输出 管道)
		InputStream in = new FileInputStream(inStr); //输入
		OutputStream out = new FileOutputStream(outStr); //输出
		
		//3) 具体的IO操作
		byte[] bye = new byte[5];
		int len = -1;
		
		//输入-----> 这个while可以看看源码就知道read()返回的规则
		while((len = in.read(bye)) != -1){
			out.write(bye, 0, len);  //边输入边输出
		}
		
		//关闭资源
		in.close();
		out.close();
	}
}
