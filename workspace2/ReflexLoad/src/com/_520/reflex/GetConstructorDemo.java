package com._520.reflex;

import java.lang.reflect.Constructor;

/*
 * 获取类中的构造器
 */
public class GetConstructorDemo {
	public static void main(String[] args) throws Exception {
		//获取字节码对象
		Class cls = Test.class;

		//获取构造器
		Constructor[] cs = cls.getConstructors(); //获取所有public修饰的构造器
		for (Constructor constructor : cs) {
			System.out.println(constructor);
		}
		System.out.println(cs.length);
		System.out.println("=========================");

		cs = cls.getDeclaredConstructors();  //获取所有的构造器
		for (Constructor constructor : cs) {
			System.out.println(constructor);
		}
		System.out.println(cs.length);
		System.out.println("=========================");
		
		Constructor c = cls.getConstructor();  //获取无参数的public修饰的构造器  若没有就报错
		System.out.println(c);
		
		System.out.println("=========================");
		
		c = cls.getConstructor(String.class); //获取public修饰指定的构造器
		System.out.println(c);
		
		
		System.out.println("=========================");
		c = cls.getDeclaredConstructor(String.class, int.class); //获取指定的构造器(无关修饰符)
		System.out.println(c);
	}
}

class Test {
	public Test() {
	}

	public Test(String name) {
	}

	private Test(String name, int age) {
	}
}
