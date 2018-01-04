package com._520it.day02;

//线程通信  

public class ThreadCommunicationTest {
	public static void main(String[] args) {
		
		//测试  两个线程
		//创建Runnable对象
		MiddleDemo m = new MiddleDemo();
		new Thread(new ProducerDemo(m)).start();
		new Thread(new ConsumerDemo(m)).start();
		
	}
}
