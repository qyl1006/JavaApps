package com._520.reflex;

import java.lang.reflect.Method;

/*
 * ��ϰʹ�÷�������ȡ����
 *  ����: 1) ��ȡ�ֽ������  2)ֱ�ӵ���Class�ķ���getMethods()����ȡ
 */
public class MethodDemo {
	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ������
		Class cls = Test3.class;
		
		//��ȡ����
		Method[] ms = cls.getMethods(); //��ȡ����public���εķ��� ����Test�ĸ���Object����
		System.out.println(ms.length);
		for (Method method : ms) {
			System.out.println(method);
		}
		System.out.println("------------");
		
		ms = cls.getDeclaredMethods();  //��ȡ���еķ��� �޹����η�
		System.out.println(ms.length);
		for (Method method : ms) {
			System.out.println(method);
		}
		
		System.out.println("------------");
		Method m = cls.getMethod("test", String.class); //��ȡһ���޲�����Public���εķ���
		System.out.println(m);
//		m = cls.getMethod("test"); //��ȡһ���в�����Public���εķ���
		System.out.println(m);
		System.out.println("------------");
		
		m = cls.getDeclaredMethod("test"); //��ȡһ���޲����ķ��� �޹����η�
		System.out.println(m);
		m = cls.getDeclaredMethod("test", String.class, int.class); //��ȡһ���в����ķ��� �޹����η�
		System.out.println("Now:" + m);
		
		
		
	}
}

class Test3{
	private  void test(){}
	public void test(String name){}
	static private void test(String name, int age){}
	
	
}