package com._520it.day02;

//线程通信  

public class ThreadCommunicationDemo {
	public static void main(String[] args) {
		
		//测试  两个线程
		//创建Runnable对象
		Runnable r = Middle.getMm();
		new Thread(r).start();
		new Thread(r).start();
		
	}
}

//Runnable实现类 用来创建线程
class Middle implements Runnable{
	String str;
	private static Middle mm = new Middle();
	
	Producer p = new Producer();
	Consumer c = new Consumer();
	
	
	public static Middle getMm(){
		return mm;
	}
	
	public void run() {
		for (int i = 0; i < 200; i ++){
			p.production(mm);
			c.consumption(mm);
		}
		
	}
}
	
//生产者
class Producer{
	int count;
	public void production(Middle m){
		if (m.str == null) {
		m.str = "凤姐      20";
		System.out.println("生产一个" + (++ count));
	   }
	}
	
}

//消费者
class Consumer{
	int count;
	public void consumption(Middle m){
		if (m.str != null){
			m.str = null;
			System.out.println("消费一个" + (++ count));
		}		
	}
}


