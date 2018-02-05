package com._520.reflex;

import java.util.Date;

/*
 * ��ȡ�ֽ������: class����
 */
public class ClassDemo {
	public static void main(String[] args) throws Exception {
		//����: ��ȡjava.util.Date����ֽ������
		//��ʽ1)
		Class<java.util.Date> cls1 = java.util.Date.class;
		
		//��ʽ��
		Date date = new java.util.Date();
		Date date2 = new java.util.Date();
		Class cls2 = date.getClass();
		Class cls9 = date2.getClass();
		//��ʽ��
		Class cls3 = Class.forName("java.util.Date");
		
		System.out.println(cls1);
		System.out.println(cls2);
		System.out.println(cls3);
		System.out.println(cls1 == cls2);
		
		Integer i = new Integer(12);
		Class cls4 = i.getClass();
		
		Class cls5 = Class.forName("java.lang.Integer");
		
		System.out.println("����: " + (cls4 == cls5));
		System.out.println(cls4.equals(cls5));
		
		//�����������͵��ֽ������
		Class c = int.class;
		Class c2 = double.class;
		System.out.println(c2);
		System.out.println(c == Integer.class);  //false
		System.out.println(Integer.TYPE == int.class);
		
		//������ֽ������
		int[] arr = new int[12];
		Class<int[]> arrc = (Class<int[]>) arr.getClass();
		System.out.println(arrc);
		System.out.println(int[].class == arrc);  //true
		
	}
}