package com._520it.day02;

//Runnable实现类---生产类--创建线程去生产
public class ProducerDemo implements Runnable {
	private MiddleDemo m;
	
	//通过构造器来调用Middle的对象(共享资源类)-----构造器的用法吧----学习了
	ProducerDemo(MiddleDemo m){
		this.m = m;
	}
	
	//一个线程--->调用Middle类的生产方法
	public void run() {
		for (int i = 0; i < 4; i ++){
			if (i % 2 == 0){
				m.production("凤姐", "女");
			}
				m.production("春哥哥", "男");
			
				System.out.println("我没有睡觉--生产者测试-循环结束" + (i + 1));
		}
	}
	

}
