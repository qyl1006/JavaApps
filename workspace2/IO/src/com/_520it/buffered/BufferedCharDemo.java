package com._520it.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 练习字符输入输出缓存包装流的IO操作
 */
public class BufferedCharDemo {
	public static void main(String[] args) throws Exception {
		//创建字符输出缓存包装流的对象
		BufferedWriter out = new BufferedWriter(new FileWriter("File/stream.txt"));
		
		//输出字符IO操作
		out.write("我欲成仙");
		out.newLine();
		out.write("快乐齐天");
		
		//关闭资源
		out.close();
		
		//创建字符输入缓存包装流的对象
		BufferedReader in = new BufferedReader(new FileReader("File/stream.txt"));
		
		//输入IO操作
		String len = null;
		while((len = in.readLine()) != null){
			System.out.println(len);
		}
		
		//关闭资源
		in.close();
		
		System.out.println(System.getProperties());
	}
}
