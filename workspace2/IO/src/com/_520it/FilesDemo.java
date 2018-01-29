package com._520it;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDemo {
	public static void main(String[] args) throws Exception{
//		Files.copy(Paths.get("File/copy.txt"), new FileOutputStream("File/test.txt"));
		System.out.println("1");
		
		InputStream in = new FileInputStream("File/copy.txt");
		Files.copy(in, Paths.get("123.txt"));  //报错? 不懂为什么?
		System.out.println("2");
	}
}
