package com._520it._03_math;

//��ʾMath��ķ���
public class MathDemo {
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.println(Math.E); //final���εĳ���
		
		System.out.println(Math.min(-12, 10));
		
		
		// random()���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0��
		//��Χ[0, 1)
		double ran = Math.random();
		System.out.println((int)(ran * 100));
		
	}
}