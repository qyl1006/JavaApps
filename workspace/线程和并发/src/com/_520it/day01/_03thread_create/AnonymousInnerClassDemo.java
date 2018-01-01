package com._520it.day01._03thread_create;


//使用匿名内部类演示创建线程---->1接口
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		//匿名内部类(接口)
		for (int i = 0; i < 50; i++) {
			System.out.println("玩游戏" + i);
			if (i == 10) {
				new Thread(new Runnable(){
					public void run(){
						for (int j = 0; j < 50; j++) {
							System.out.println("听音乐" + j);
						}
						
					}
				}).start();
				
			}
		}
	}
}
