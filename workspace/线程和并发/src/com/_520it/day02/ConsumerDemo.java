package com._520it.day02;


//Runnable实现类--->消费类--创建线程去消费
public class ConsumerDemo implements Runnable{
	private MiddleDemo m;
	
	ConsumerDemo(MiddleDemo m){
		this.m = m;
	}
	
	//消费者线程
	public void run() {
		for (int i = 0; i < 200; i++) {
			m.consumption();
		}
	}

}
