package com._520it.day01._file_input_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//练习 Java1.7及之后的资源自动关闭特性
public class CloseResources2 {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		// 1) 创建源 和目标对象
		String inStr = "File/test.txt";
		String outStr = "File/copy.txt";
		try (// 2) 创建IO流对象  (输入 输出 管道)
				InputStream in = new FileInputStream(inStr); //输入
				OutputStream out = new FileOutputStream(outStr); //输出)
		) {
			//3) 具体的IO操作
			byte[] bye = new byte[5];
			int len = -1;

			//输入-----> 这个while可以看看源码就知道read()返回的规则
			while ((len = in.read(bye)) != -1) {
				out.write(bye, 0, len); //边输入边输出

			}
		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
