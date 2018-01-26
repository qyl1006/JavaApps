package com._520.reflex;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
 * 练习使用反射调用方法
 * 
 */
public class InvocationMethodDemo {
	public static void main(String[] args) throws Exception {
		///1) 创建字节码对象  2)获取方法  3)调用Method类中的方法来实现
		Class cls = User.class;
		Method m = cls.getMethod("test");  //获取方法
		m.invoke(cls.newInstance());	//调用无参数的方法
		
		m = cls.getMethod("test", String.class);  //调用有参数的方法
		m.invoke(cls.newInstance(), new Object[]{"Hello"});  //注意调用方法参数格式--
		
		System.out.println("test");
		m = cls.getDeclaredMethod("test", int[].class);
		m.setAccessible(true);
		m.invoke(cls.newInstance(), new Object[]{new int[]{1, 2, 3, 4, 5, 6}});
		
		m = cls.getDeclaredMethod("test", Integer.class); //
		m.invoke(null, new Object[]{1234});
		
		System.out.println("-----------=====-------------------");
		System.out.println(cls);
		int i = cls.getModifiers();
		System.out.println(i); // 获得修饰符
		 
		System.out.println(cls.getName());   //返回类的全限定名
		System.out.println(cls.getPackage()); // 获得该类的包
		System.out.println(cls.getSimpleName());  //获得类的简单名字
		
		System.out.println(cls.getSuperclass()); // 获得类的简单名字
		System.out.println(cls.isArray()); // 判断Class实例是否是数组
		
		System.out.println(cls.isEnum()); //判断该Class实例是否是枚举
		
	}
}

class User{
	public void test(){
		System.out.println("无参数方法");
	}
	
	public void test(String name){
		System.out.println("有一个参数的方法 " + name);
	}
	
	 private void test(int ...age ){
		System.out.println("有两个参数的方法" + Arrays.toString(age));
	}
	 
	public static void test(Integer num){
		System.out.println("static修饰的方法 " + num);
	}
}
