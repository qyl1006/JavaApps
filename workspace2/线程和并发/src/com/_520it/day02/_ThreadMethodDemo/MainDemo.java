package com._520it.day02._ThreadMethodDemo;

//演示 后台线程
public class MainDemo {
	public static void main(String[] args) {
		//测试 main主方法是否是后台线程
		boolean b = Thread.currentThread().isDaemon();
		System.out.println(b);  //false--->主线程
		
		String s = Thread.currentThread().getName();  //获取当前线程的名称
		System.out.println(s);
		
		//Thread.currentThread().setDaemon(true);//报错-->原因线程在运行时期不能设置它是否为后台线程
		
		int i = Thread.currentThread().getPriority(); //获取线程优先级
		System.out.println("主线程的优先级:" + i);
		
		Thread.currentThread().setPriority(5);
		System.out.println(Thread.currentThread().getPriority());
		
	}
}

