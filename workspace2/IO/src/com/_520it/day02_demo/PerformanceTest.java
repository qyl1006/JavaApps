package com._520it.day02_demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 测试文件字节节点流与包装流的性能耗时对比--->1) 一个字节一个字节读取拷贝拷贝对比   2)定义一个1024缓存池来读取拷贝对比
 */
public class PerformanceTest {
	public static void main(String[] args) throws Exception {
		//测试 1-01
		//		test1_01(); //128872 ms
		//		test1_02(); //902 ms

		test2_01(); //209 ms
//		test2_02(); //82 ms
	}

	private static void test1_01() throws Exception {
		//创建源 / 目标文件
		File source = new File("File/09.TCP和UDP协议概述.avi");
		File target = new File("File/copyTest");

		//创建字节输入流对象 字节输出流对象
		InputStream in = new FileInputStream(source); //输入
		OutputStream out = new FileOutputStream(new File(target,
				source.getName())); //输出
		long time = System.currentTimeMillis();

		//文件拷贝操作 --边输入边输出--一个字节一个字节拷贝
		//		byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read()) != -1) {
			out.write(len);
		}
		System.out.println(System.currentTimeMillis() - time);

		//关闭资源
		in.close();
		out.close();
	}

	private static void test1_02() throws Exception {
		//创建源 / 目标文件
		File source = new File("File/09.TCP和UDP协议概述.avi");
		File target = new File("File/copyTest");

		//创建字节输入流对象 字节输出流对象--包装流
		InputStream in = new BufferedInputStream(new FileInputStream(source)); //输入
		OutputStream out = new BufferedOutputStream(new FileOutputStream(
				new File(target, source.getName()))); //输出
		long time = System.currentTimeMillis();

		//文件拷贝操作 --边输入边输出--一个字节一个字节拷贝
		//				byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read()) != -1) {
			out.write(len);
		}
		System.out.println(System.currentTimeMillis() - time);

		//关闭资源
		in.close();
		out.close();
	}

	private static void test2_01() throws Exception {
		//创建源 / 目标文件
		File source = new File("File/09.TCP和UDP协议概述.avi");
		File target = new File("File/copyTest");

		//创建字节输入流对象 字节输出流对象
		InputStream in = new FileInputStream(source); //输入
		OutputStream out = new FileOutputStream(new File(target,source.getName())); //输出
		long time = System.currentTimeMillis();

		//文件拷贝操作 --边输入边输出--一个字节一个字节拷贝
		byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read(b)) != -1) {
			out.write(b, 0, len);
		}
		System.out.println(System.currentTimeMillis() - time);

		//关闭资源
		in.close();
		out.close();
	}

	private static void test2_02() throws Exception {
		//创建源 / 目标文件
		File source = new File("File/09.TCP和UDP协议概述.avi");
		File target = new File("File/copyTest");

		//创建字节输入流对象 字节输出流对象--包装流
		InputStream in = new BufferedInputStream(new FileInputStream(source)); //输入
		OutputStream out = new BufferedOutputStream(new FileOutputStream(new File(target, source.getName()))); //输出
		long time = System.currentTimeMillis();

		//文件拷贝操作 --边输入边输出--一个字节一个字节拷贝
		byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read(b)) != -1) {
			out.write(b, 0, len);
		}
		System.out.println(System.currentTimeMillis() - time);

		//关闭资源
		in.close();
		out.close();
	}
}
