package com._520it.day02;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		//演示下 定时器
		System.out.println("---------");
		new Timer().schedule(new TimerTask(){
			public void run() {
				System.out.println(new Date().toLocaleString());
			}
		},  30000, 1000);
		
		System.out.println("main主线程");
		
		
		System.out.println(Thread.currentThread().getThreadGroup());
	}
	
	
	
}
