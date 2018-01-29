package com._520it.day01._03thread_create;


//需求:有一堆苹果(50),苹果有唯一的编号(如1 2 3 ),现有三个人开始吃苹果比赛,要求吃之前展示苹果的编号,然后吃掉,最后统计每个人吃掉苹果数量

public class EatApplesDemo {
	public static void main(String[] args) {
	
		//创建三个EatGame对象开始比赛
		for (int i = 5; i > 0 ; i --) {
			if (i == 1){
				System.out.println("比赛开始:");
				new EatGame("小A").start();
				new EatGame("小B").start();
				new EatGame("小C").start();
			}
		}
	}

}

//使用继承Thread类来实现
class EatGame extends java.lang.Thread{
	private static int apple = 50;
	
	EatGame(String s){
		super(s);
	}
	
	public void run(){
		int count = 0;
		while(apple > 0){
				System.out.println(super.getName() + "把编号为:" + apple-- + "的苹果吃掉.");
				count ++;
		}
		System.out.println(super.getName() + "一共吃了" + count + "个苹果..");	
	}
}
