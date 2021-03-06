package com._520it.day01._03thread_create;

//通过定义声明实现Runnable接口的类,该类实现run方法,任何可以分配该类的实例(该类对象),
// 在创建Thread时作为一个参数来传递并启动.

//定义Runnable实现类
class PlayMusics implements java.lang.Runnable{
	public void run() {
		for (int i = 0; i < 50; i ++){
			System.out.println("听音乐" + i);
		}
	}
	
}

public class ImplementsRunnable {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.println("打游戏" + i);
			if (i == 10) {
				Runnable r = new PlayMusics();
				Thread t = new Thread(r);
				t.start();
			}
		}
	}

}
