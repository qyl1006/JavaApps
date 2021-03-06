package com._520it.day01._file_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//演示练习 字节输入流的 使用
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//创建源
		File f = new File("File/test.txt");
		
		//创建IO流对象
		InputStream in = new FileInputStream(f);
		
		//具体IO的操作
//		int i = in.read();
//		System.out.println(i);
		
		byte[] bye = new byte[1];
//		System.out.println(Arrays.toString(bye));
//		int len = in.read(bye);
//		System.out.println(len);
//		String str = new String(bye);
//		System.out.println(Arrays.toString(bye));
//		System.out.println(str);
		int len = -1;
		while((len = in.read(bye)) != -1){
//			System.out.println(bye[0]);
			String str = new String(bye,0 , len);
			System.out.println(str);
		}
		
		//关闭资源
		in.close();
		
		
	}
}
