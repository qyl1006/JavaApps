package com.qyl._1_annont;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
 * 需求: 获取贴在Person类中的注解,获取其信息
	思路: 1) 通过Person的字节码对象来获取该类的注解<---调用Class中的方法
		 2)直接通过Person类的注解(也就是注解对象)来调用注解的方法获取相对应的属性
 */
public class AnnotDemo {
	public static void main(String[] args) throws Exception {
		//获取Persin的字节码对象
		Class<?> cls = Person.class;
		Class<?> cls2 = Class.forName("com.qyl._1_annont.Person");// 获取字节码对象第三种方法
		System.err.println(cls2);
			
		//获取一个注解
		VIP an = cls.getAnnotation(VIP.class);
		System.out.println(an);
		
		//判断注解是否有,有就调用注解的方法获取打印属性
		if(an != null){
			System.out.println(an.value());
			System.out.println(an.age());
			System.out.println(an.gender());
			System.out.println(Arrays.toString(an.measurements()));
		}
	}
}
