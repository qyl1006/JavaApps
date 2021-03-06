package com._520it.day01._04线程安全;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//同步锁
public class LockDemo {
	public static void main(String[] args) {
		//测试--->先放50个编号从1到50的苹果到数组arr

		//创建三个EatGame对象开始比赛
		for (int i = 5; i > 0; i--) {
			if (i == 1) {
				System.out.println("比赛开始:");
				Runnable r = new EatGame5();
				new Thread(r, "小A").start();
				new Thread(r, "小B").start();
				new Thread(r, "小C").start();
			}
		}
	}
}

//定义一个实现类测试
class EatGame5 implements java.lang.Runnable {
	private int apple = 500;
	private final Lock lock = new ReentrantLock();

	public void run() {
		for (int i = 500; i > 0; i--) {
			//同步锁
			doWork();
		}
	}

	//保证线程安全 Lock实现  手动加锁 释放锁
	private void doWork() {
		//进入方法,马上加锁
		lock.lock();//获取锁
		try {
			if (apple > 0) {
				System.out.println(Thread.currentThread().getName() + "把编号为:"
						+ apple + "的苹果吃掉.");
				Thread.sleep(10);//sleep()线程睡眠方法--->模拟网络延迟--10ms
				apple--;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock(); //释放锁 走人
		}
	}
}
