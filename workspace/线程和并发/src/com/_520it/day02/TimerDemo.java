package com._520it.day02;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/*
 * ��ʾ ��ʱ��
	�ܽ�: TimerTask���ʾ��ʱ��ִ�е�ĳһ������.
		���÷���:
		schedule(TimerTask task,long delay,long period):
		schedule(TimerTask task,long delay):

 */

public class TimerDemo {
	public static void main(String[] args) {
		//��ʾ�� ��ʱ��
		System.out.println("---------");
		new Timer().schedule(new TimerTask(){
			public void run() {
				System.out.println(new Date().toLocaleString());
			}
		},  30000, 1000);
		
		System.out.println("main���߳�");
		
		
		System.out.println(Thread.currentThread().getThreadGroup());
	}
	
	
	
}
