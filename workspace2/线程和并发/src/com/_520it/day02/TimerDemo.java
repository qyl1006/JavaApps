package com._520it.day02;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/*
 * 演示 定时器
	总结: TimerTask类表示定时器执行的某一项任务.
		常用方法:
		schedule(TimerTask task,long delay,long period):
		schedule(TimerTask task,long delay):

 */

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
