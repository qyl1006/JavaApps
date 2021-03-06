package com._520.reflex;

import java.util.Date;

/*
 * 获取字节码对象: class对象
 */
public class ClassDemo {
	public static void main(String[] args) throws Exception {
		//需求: 获取java.util.Date类的字节码对象
		//方式1)
		Class<java.util.Date> cls1 = java.util.Date.class;
		
		//方式二
		Date date = new java.util.Date();
		Date date2 = new java.util.Date();
		Class cls2 = date.getClass();
		Class cls9 = date2.getClass();
		//方式三
		Class cls3 = Class.forName("java.util.Date");
		
		System.out.println(cls1);
		System.out.println(cls2);
		System.out.println(cls3);
		System.out.println(cls1 == cls2);
		
		Integer i = new Integer(12);
		Class cls4 = i.getClass();
		
		Class cls5 = Class.forName("java.lang.Integer");
		
		System.out.println("测试: " + (cls4 == cls5));
		System.out.println(cls4.equals(cls5));
		
		//基本数据类型的字节码对象
		Class c = int.class;
		Class c2 = double.class;
		System.out.println(c2);
		System.out.println(c == Integer.class);  //false
		System.out.println(Integer.TYPE == int.class);
		
		//数组的字节码对象
		int[] arr = new int[12];
		Class<int[]> arrc = (Class<int[]>) arr.getClass();
		System.out.println(arrc);
		System.out.println(int[].class == arrc);  //true
		
	}
}
