package day17.random;

import java.util.concurrent.ThreadLocalRandom;

/*
 * 练习ThreadLocalRandom类的方法
 * 总结: 它是Random类的子类,, 所以它可以调用Random的方法
 * 		ThreadLocalRandom通过  ThreadLocalRandom.current()来创建对象
 */
public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		ThreadLocalRandom random = ThreadLocalRandom.current(); // 创建对象
		System.out.println(random.nextInt(34, 179)); //生产[34, 179)之间的随机数
	}
}
