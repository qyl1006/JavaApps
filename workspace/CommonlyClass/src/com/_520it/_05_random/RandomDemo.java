package com._520it._05_random;

import java.util.Random;

//����α�����
public class RandomDemo {
	public static void main(String[] args) {
		Random r1 = new Random(10);
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextInt(1000));
		System.out.println("==========================");
		Random r2 = new Random(10);
		System.out.println(r2.nextBoolean());
		System.out.println(r2.nextDouble());
		System.out.println(r2.nextInt(1000));

	}

}
