package com._520.reflex;

import java.lang.reflect.Constructor;

/*
 * ��ȡ���еĹ�����
 */
public class GetConstructorDemo {
	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ������
		Class cls = Test.class;

		//��ȡ������
		Constructor[] cs = cls.getConstructors(); //��ȡ����public���εĹ�����
		for (Constructor constructor : cs) {
			System.out.println(constructor);
		}
		System.out.println(cs.length);
		System.out.println("=========================");

		cs = cls.getDeclaredConstructors();  //��ȡ���еĹ�����
		for (Constructor constructor : cs) {
			System.out.println(constructor);
		}
		System.out.println(cs.length);
		System.out.println("=========================");
		
		Constructor c = cls.getConstructor();  //��ȡ�޲�����public���εĹ�����  ��û�оͱ���
		System.out.println(c);
		
		System.out.println("=========================");
		
		c = cls.getConstructor(String.class); //��ȡpublic����ָ���Ĺ�����
		System.out.println(c);
		
		
		System.out.println("=========================");
		c = cls.getDeclaredConstructor(String.class, int.class); //��ȡָ���Ĺ�����(�޹����η�)
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