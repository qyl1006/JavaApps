package day17.random;

import java.util.Random;

/*
 * Random类的常用方法练习
 */
public class RandomDemo {
	public static void main(String[] args) {
		System.out.println(new Random().nextInt(12));
//		System.out.println(new Random().nextBoolean());
		
		Random r = new Random(12);
		System.out.println(new Random().nextInt(12));
		
	}
}
