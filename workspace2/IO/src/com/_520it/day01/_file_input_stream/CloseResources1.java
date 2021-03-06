package com._520it.day01._file_input_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//演示 练习 传统关闭资源的方式
public class CloseResources1 {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		InputStream in = null;
		OutputStream out = null;

		try {// 1) 创建源 和目标对象
			String inStr = "File/test.txt";
			String outStr = "File/copy.txt";

			// 2) 创建IO流对象  (输入 输出 管道)
			in = new FileInputStream(inStr); //输入
			out = new FileOutputStream(outStr); //输出

			//3) 具体的IO操作
			byte[] bye = new byte[5];
			int len = -1;

			//输入-----> 这个while可以看看源码就知道read()返回的规则
			while ((len = in.read(bye)) != -1) {
				out.write(bye, 0, len); //边输入边输出
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//关闭资源
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
