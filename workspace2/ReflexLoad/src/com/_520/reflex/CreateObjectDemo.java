package com._520.reflex;

import java.lang.reflect.Constructor;

/*
 * 练习: 使用反射来创建对象
 */
public class CreateObjectDemo {
	public static void main(String[] args) throws Exception {
		//---传统的创建方式
//		new Test2();
//		new Test2("qyl");
//		new Test2("qyl", 18);
		
		//使用反射创建对象-->1)获取字节码对象--->2)通过字节码对象获取构造器的实例--->调用构造器Constructor类中方法创建
		Class<Test2> cls = Test2.class;
		Constructor con = null; //cls.getConstructor(); //获取无 参构造器
//		con.newInstance();
		
		System.out.println("-----------");
		con = cls.getConstructor(String.class); //获取有参构造器
		con.newInstance("一个参数");
		
		System.out.println("-----------");
		con = cls.getDeclaredConstructor(String.class, int.class); //获取有参构造器
		con.setAccessible(true);  //构造器父类的方法 可设置访问检查 
		con.newInstance("两个参数", 110);
		
		System.out.println("===============================测试Class方法创建对象==============");
		cls.newInstance();  //只能new无参数非pravte修饰的构造器
		
		
	}
}

class Test2{
	private Test2(){
		System.out.println("无参数构造器");
	}
	public Test2(String name){
		System.out.println("构造器: " + name);
	}
	private Test2(String name, int age){
		System.out.println("构造器: " + name + ", " + age);
		
	}
}
