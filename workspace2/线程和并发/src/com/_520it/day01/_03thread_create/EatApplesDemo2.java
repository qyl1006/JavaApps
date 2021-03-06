package com._520it.day01._03thread_create;

//需求:有一堆苹果(50),苹果有唯一的编号(如1 2 3 ),现有三个人开始吃苹果比赛,要求吃之前展示苹果的编号,然后吃掉,最后统计每个人吃掉苹果数量

public class EatApplesDemo2 {
	public static void main(String[] args) {
		//测试--->先放50个编号从1到50的苹果到数组arr
	
		//创建三个EatGame对象开始比赛
		for (int i = 5; i > 0 ; i --) {
			if (i == 1){
				System.out.println("比赛开始:");
				Runnable r = new EatGame2();
				new Thread(r, "小A").start();
				new Thread(r, "小B").start();
				new Thread(r, "小C").start();
			}
		}
	}
}


//定义一个实现类测试
class EatGame2 implements java.lang.Runnable{
	private int apple = 50;
	
	
	public void run(){
		int count = 0;
		while(apple > 0){
			try {
				Thread.sleep(10);//sleep()线程睡眠方法--->模拟网络延迟--10ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "编号为:" + apple-- + "的苹果吃掉.");
			count ++;
		}
		System.out.println(Thread.currentThread().getName() + "一共吃了" + count + "个苹果");
	}
		
}
