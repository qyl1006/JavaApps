package day17.random;

import java.util.Random;
/*
 * 需求: 演示生产验证码
 * 
 * 总结: 使用StringBuilder来生产验证码节约内存性能好-->还可以自定义字符数(5)
 */

public class RandomCodeDemo {
	public static void main(String[] args) {
		String str = "QAZXSWEDCVFRTGBNHYUJMKIOLP";
		str += str.toUpperCase();
		str += "1234567890";
		str += "1234567890";
//		System.out.println(new Random().nextInt(12));
		StringBuilder sb = new StringBuilder(5); //
		for (int i = 0; i < 5; i++) {
			sb.append(str.charAt(new Random().nextInt(str.length())));
		}
		System.out.println(sb);
	}
}
