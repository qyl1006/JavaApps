package com._520.reflex;

import java.lang.reflect.Constructor;

/*
 * ��ϰ: ʹ�÷�������������
 */
public class CreateObjectDemo {
	public static void main(String[] args) throws Exception {
		//---��ͳ�Ĵ�����ʽ
//		new Test2();
//		new Test2("qyl");
//		new Test2("qyl", 18);
		
		//ʹ�÷��䴴������-->1)��ȡ�ֽ������--->2)ͨ���ֽ�������ȡ��������ʵ��--->���ù�����Constructor���з�������
		Class<Test2> cls = Test2.class;
		Constructor con = null; //cls.getConstructor(); //��ȡ�� �ι�����
//		con.newInstance();
		
		System.out.println("-----------");
		con = cls.getConstructor(String.class); //��ȡ�вι�����
		con.newInstance("һ������");
		
		System.out.println("-----------");
		con = cls.getDeclaredConstructor(String.class, int.class); //��ȡ�вι�����
		con.setAccessible(true);  //����������ķ��� �����÷��ʼ�� 
		con.newInstance("��������", 110);
		
		System.out.println("===============================����Class������������==============");
		cls.newInstance();  //ֻ��new�޲�����pravte���εĹ�����
		
		
	}
}

class Test2{
	private Test2(){
		System.out.println("�޲���������");
	}
	public Test2(String name){
		System.out.println("������: " + name);
	}
	private Test2(String name, int age){
		System.out.println("������: " + name + ", " + age);
		
	}
}