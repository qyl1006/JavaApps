package com._520it.day01._03thread_create;


//演示使用匿名内部类(类)来创建线程------类
public class AnonymousInnerClassDemo2 {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.println("玩游戏" + i);
			if (i == 10) {
				new Thread(){
					public void run(){
						for (int j = 0; j < 50; j++) {
							System.out.println("听音乐" + j);
						}
					}
				}.start();
				
			}
		}
	}
}
