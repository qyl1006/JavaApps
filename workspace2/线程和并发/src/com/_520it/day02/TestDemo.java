package com._520it.day02;


public class TestDemo {
	public static void main(String[] args) {
		//测试调用wait()睡眠方法后线程是否停止
		Runnable r = new Test();
		new Thread(r).start();
	}

}

class Test implements Runnable{

	public void run() {
		this.test();
	}
	
	synchronized public void test(){
		
		try {
			System.out.println("线程睡眠前");
			this.wait();
			System.out.println("线程睡眠后");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
