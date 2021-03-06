package com._520.reflex;

import java.lang.reflect.Method;

/*
 * 练习使用反射来获取方法
 *  步骤: 1) 获取字节码对象  2)直接调用Class的方法getMethods()来获取
 */
public class MethodDemo {
	public static void main(String[] args) throws Exception {
		//获取字节码对象
		Class cls = Test3.class;
		
		//获取方法
		Method[] ms = cls.getMethods(); //获取所有public修饰的方法 包括Test的父类Object方法
		System.out.println(ms.length);
		for (Method method : ms) {
			System.out.println(method);
		}
		System.out.println("------------");
		
		ms = cls.getDeclaredMethods();  //获取所有的方法 无关修饰符
		System.out.println(ms.length);
		for (Method method : ms) {
			System.out.println(method);
		}
		
		System.out.println("------------");
		Method m = cls.getMethod("test", String.class); //获取一个无参数的Public修饰的方法
		System.out.println(m);
//		m = cls.getMethod("test"); //获取一个有参数的Public修饰的方法
		System.out.println(m);
		System.out.println("------------");
		
		m = cls.getDeclaredMethod("test"); //获取一个无参数的方法 无关修饰符
		System.out.println(m);
		m = cls.getDeclaredMethod("test", String.class, int.class); //获取一个有参数的方法 无关修饰符
		System.out.println("Now:" + m);
		
		
		
	}
}

class Test3{
	private  void test(){}
	public void test(String name){}
	static private void test(String name, int age){}
	
	
}