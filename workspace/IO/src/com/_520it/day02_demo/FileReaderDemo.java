package com._520it.day02_demo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/*
 * 练习 文件字符IO输入操作
 */
public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		//1 创建源对象
		File dir = new File("File/test.txt");
		
		//2 创建IO流对象--->字符输入流对象
		Reader in = new FileReader(dir);
		
		//3 具体IO操作-->字符输入Reand
		char[] cbuf = new char[1024];  //----->字符-->char    字节-->byte   两者不一样
		int len = -1;
		while((len = in.read(cbuf)) != -1){
			System.out.println(new String(cbuf,0 , len));
		}
		
		//4 关闭资源
		in.close();
	}
}
