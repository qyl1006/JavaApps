package com._520it._05_random;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		
		//��Ϊ�޷�����ThreadLocalRandomDemo������,����ֻ�ܵ���current()����������һ������
		// �����뵥����....
		ThreadLocalRandom t = ThreadLocalRandom.current();
		System.out.println(t.nextInt(34, 100));
	}
}
