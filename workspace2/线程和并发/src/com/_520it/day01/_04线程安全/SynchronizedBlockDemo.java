package com._520it.day01._04线程安全;

//解决线程安全问题 同步代码块
public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		//测试--->先放50个编号从1到50的苹果到数组arr

		//创建三个EatGame对象开始比赛
		for (int i = 5; i > 0; i--) {
			if (i == 1) {
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
class EatGame2 implements java.lang.Runnable {
	private int apple = 200;

	public void run() {
		for (int i = 200; i > 0; i--) {
			//同步代码块
			synchronized (this) {
				if (apple > 0) {
					try {
						Thread.sleep(10);//sleep()线程睡眠方法--->模拟网络延迟--10ms
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "把编号为:" + apple-- + "的苹果吃掉.");
				}
			}
		}
	}

}
