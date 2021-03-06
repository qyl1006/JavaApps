package com._520it.day02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//共享的资源类  并提供生产和消费的功能
public class MiddleDemo {
	private String name;
	private String gender;
	private String[] arr = new String[5]; //生产或消费使用容量器/缓存器
	private int count; //生产/消费 计数器

	private boolean ifEmpty = true;//标志是否为空, 默认为空true
	private Lock lock = new ReentrantLock(); // 创建一个Lock对象 使用它的子类构造器
	private Condition condition = lock.newCondition(); //使用Lock的方法来 返回绑定到此 Lock 实例的新 Condition 实例。

	//生产
	public void production(String name, String gender) {
		try {
			lock.lock();//获取锁
			while (count!= 0) {
				condition.await();
				}
				//this.ifEmpty = false;
			for (int i = 0; i < 5; i++) {
				arr[0] = name + "--" + gender;
				System.out.println("生产: " + arr[0]);
				count++;
				//this.notifyAll();//唤醒所有线程--->同步锁对象调用
				condition.signal();//唤醒所有线程
			}
			//	this.wait();
			

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();//释放锁
		}
	}

	//消费
	public void consumption() {
		try {
			lock.lock();//获取锁
			while (count != 5) {
				condition.await();
					//	this.ifEmpty = true;
					//this.notify();
				}
			for (int i = 0; i < 5; i++) {
				System.out.println("消费: " + arr[0]);
				--count;
				condition.signal();//唤醒所有线程
			}
			//this.wait();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
