package com._520it.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 练习 BufferedOutputStream--缓存流---1字节输出---2 字节输入
 */
public class BufferedByteStreamDemo {
	public static void main(String[] args) throws Exception {
		//创建字节输出缓存流对象
		BufferedOutputStream outBuffered = new BufferedOutputStream(new FileOutputStream("File/stream.txt"));
		
		//字节输出IO操作
		outBuffered.write("Helo World!\ntest".getBytes());
		
		//关闭资源
		outBuffered.close();
		
		// 创建字节输入缓存流对象
		BufferedInputStream inBuffered = new BufferedInputStream(new FileInputStream("File/stream.txt"));
		
		//字节输入IO操作
		byte[] b = new byte[1024];
		int len = -1;
		while((len = inBuffered.read(b)) != -1){
			System.out.println(new String(b, 0, len));
		}
	}
}
