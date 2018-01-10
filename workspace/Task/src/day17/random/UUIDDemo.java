package day17.random;

import java.util.UUID;

/*
 * 演示 UUID的方法
 * 总结: 可以调用它的静态方法来随机获取UUID的对象----String类型的字符串
 */
public class UUIDDemo {
	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString());
		System.out.println(UUID.randomUUID().toString());
		System.out.println(UUID.randomUUID().toString());
		System.out.println(UUID.randomUUID().toString());
	}
}
