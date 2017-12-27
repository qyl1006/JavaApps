package com._520it._05_random;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		
		//因为无法调用ThreadLocalRandomDemo构造器,所以只能调用current()方法来返回一个对象
		// 类似与单例吧....
		ThreadLocalRandom t = ThreadLocalRandom.current();
		System.out.println(t.nextInt(34, 100));
	}
}
