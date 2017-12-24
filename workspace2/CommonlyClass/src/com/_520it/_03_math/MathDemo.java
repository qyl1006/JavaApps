package com._520it._03_math;

//演示Math类的方法
public class MathDemo {
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.println(Math.E); //final修饰的常量
		
		System.out.println(Math.min(-12, 10));
		
		
		// random()返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
		//范围[0, 1)
		double ran = Math.random();
		System.out.println((int)(ran * 100));
		
	}
}
