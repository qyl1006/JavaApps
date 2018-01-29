package com._520it.day02;

//线程通信  
//总结: wait和notify方法,只能被同步监听锁对象来调用,否则报错IllegalMonitorStateException
//		注意lock锁的放置位置,

public class ThreadCommunicationTest {
	public static void main(String[] args) {
		
		//测试  两个线程
		//创建Runnable对象
		MiddleDemo m = new MiddleDemo();
		new Thread(new ProducerDemo(m)).start();
		new Thread(new ConsumerDemo(m)).start();
		
	}
}
