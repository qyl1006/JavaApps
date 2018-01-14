package com._520it.day02._ThreadMethodDemo;
//演示联合线程
//总结: 线程的join方法表示一个线程等待另一个线程完成后才执行。join方法被调用之后，线程对象处于阻塞状态。

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread j = new Join();
		for (int i = 0; i < 200; i++) {
			System.out.println("main主线程运行中:" + i);
			if(i == 0){
				j.start();
			}
			if(i == 50){
				j.join();
			}
		}
	}
}

class Join extends Thread{
	public void run(){
		for (int i = 0; i < 200; i++) {
			System.out.println("我要先运行,我带头" + i);
		}
	}
}