package com._520it.day01_02_process;

import java.io.IOException;


//创建进程---->演示用代码打开系统的记事本
public class ProcessDemo {
	public static void main(String[] args) throws IOException {
		//1)用Runtime类的exec方法
		Runtime.getRuntime().exec("notepad");
		
		//2) 用ProcessBuilder类中start()方法调用
		ProcessBuilder p = new ProcessBuilder("notepad");
		p.start( );
	}
}
