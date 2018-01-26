package com._520.reflex;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
 * ��ϰʹ�÷�����÷���
 * 
 */
public class InvocationMethodDemo {
	public static void main(String[] args) throws Exception {
		///1) �����ֽ������  2)��ȡ����  3)����Method���еķ�����ʵ��
		Class cls = User.class;
		Method m = cls.getMethod("test");  //��ȡ����
		m.invoke(cls.newInstance());	//�����޲����ķ���
		
		m = cls.getMethod("test", String.class);  //�����в����ķ���
		m.invoke(cls.newInstance(), new Object[]{"Hello"});  //ע����÷���������ʽ--
		
		System.out.println("test");
		m = cls.getDeclaredMethod("test", int[].class);
		m.setAccessible(true);
		m.invoke(cls.newInstance(), new Object[]{new int[]{1, 2, 3, 4, 5, 6}});
		
		m = cls.getDeclaredMethod("test", Integer.class); //
		m.invoke(null, new Object[]{1234});
		
		System.out.println("-----------=====-------------------");
		System.out.println(cls);
		int i = cls.getModifiers();
		System.out.println(i); // ������η�
		 
		System.out.println(cls.getName());   //�������ȫ�޶���
		System.out.println(cls.getPackage()); // ��ø���İ�
		System.out.println(cls.getSimpleName());  //�����ļ�����
		
		System.out.println(cls.getSuperclass()); // �����ļ�����
		System.out.println(cls.isArray()); // �ж�Classʵ���Ƿ�������
		
		System.out.println(cls.isEnum()); //�жϸ�Classʵ���Ƿ���ö��
		
	}
}

class User{
	public void test(){
		System.out.println("�޲�������");
	}
	
	public void test(String name){
		System.out.println("��һ�������ķ��� " + name);
	}
	
	 private void test(int ...age ){
		System.out.println("�����������ķ���" + Arrays.toString(age));
	}
	 
	public static void test(Integer num){
		System.out.println("static���εķ��� " + num);
	}
}
