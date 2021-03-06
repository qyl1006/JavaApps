package com._520it.day23Task;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * 需求: 定义 Gun 类，存放有弹夹属性，弹夹容量是 5，再提供射击方法（打印出的子弹，若子弹没有了提示没有子弹）和装子弹的方法（装满子弹也是提示一下）。子弹是用 Integer 对象。
 * 
 * 分析: 更改手枪射击的特点,应该采用栈结构ArrayDeque来存储数据(子弹),
 */
public class GunDemo {
	public static void main(String[] args) {
		//测试
		Gun g = new Gun();
		//装弹测试
		g.add(1);
		g.add(2);
		g.add(3);
		g.add(4);
		g.add(5);
		g.add(6);

		//射击测试
		g.shooting();
		g.shooting();
		g.shooting();
		g.shooting();
		g.shooting();
		g.shooting();
	}
}

class Gun {
	private Deque<Integer> deque; //弹夹
	private int size; //子弹的数量

	private final int DEFAULT = 5; //默认装子弹数
	private final int MAX = 10; //最大装字弹数
	private int ShootNumber = DEFAULT; //射击次数

	Gun() {
		deque = new ArrayDeque<>(DEFAULT);
	}

	Gun(int i) {
		if (i > MAX) {
			throw new IllegalArgumentException("超过最大装弹限度");
		}
		deque = new ArrayDeque<>(i);
		ShootNumber = i;
	}

	//装子弹
	public void add(Integer i) {
		if (size >= ShootNumber) {
			System.out.println("子弹已经装满了");
			return;
		}
		deque.add(i);
		System.out.println(++size + "号子弹已装好");
	}

	//射击
	public void shooting() {
		if (size == 0) {
			System.out.println("没有子弹了");
			return;
		}
		System.out.println("射击出" + deque.pollLast() + "号子弹");
		size--;
	}
}
