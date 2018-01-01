package com._520it.day01._03thread_create;

//演示使用使用继承Thread类的方法来创建新的线程,-->定义Thread的子类,该子类应重写Thread类的run方法,接下来分配并启动该子类的实例
//定义一个类,使之继承与Thread类
class PlayMusic extends java.lang.Thread{
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("听音乐" + i);
		}
	}
}



public class ExtendsThreadDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.println("玩游戏" + i);
			if (i == 10) {
				new PlayMusic().start();
			}
		}
	}

}
