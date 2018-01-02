package com._520it.day02;

//线程通信  

public class ThreadCommunicationDemo {
	public static void main(String[] args) {
		
		//测试  两个线程
		Runnable r = new ThreadCommunication();
		
		new Thread(r).start();
		new Thread(r).start();
	}
}

class  ThreadCommunication implements java.lang.Runnable{

	private String str;
	
	public void run(String name, int age) {
		//生成
		for (int i = 0; i < 50; i ++){
			if (str == null){
				str = name + age;
			}
		}
		
	}
	
	//消费
	public void run(){
		for (int i = 0; i < 50; i ++){
			if (str != null){
				System.out.println("打印:" + str);
				str = null;
			}
		}
	}
	
}
