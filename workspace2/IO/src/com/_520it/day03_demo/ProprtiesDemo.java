package com._520it.day03_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

//练习使用Properties类加载资源文件.properties   --> key-value结构
public class ProprtiesDemo {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		InputStream in = new FileInputStream("File/db.properties");
		
		p.load(in);
		System.out.println(p);    //{passworld=123456, username=admin}
		System.out.println(p.getProperty("username") + ", " +  p.getProperty("passworld"));  //admin, 123456
	}
}
