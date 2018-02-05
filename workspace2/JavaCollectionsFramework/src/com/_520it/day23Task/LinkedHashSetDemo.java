package com._520it.day23Task;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * ����: ��ϰLinkedHashSet�ķ���--->Set�ӿڵĳ��÷���
 * 	�ܽ�: �ײ�ʹ�� ���� �� ��ϣ�� �㷨-->�ɼ�¼Ԫ�ص��Ⱥ�����˳��
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		//����Ԫ��
		set.add("��");
		set.add("��");
		set.add("��");
		set.add("ϰ");
		System.out.println(set);//[��, ��, ��, ϰ]
		
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		
		set.addAll(set2);
		System.out.println(set); //[��, ��, ��, ϰ, A, B, C]
		
		//�Ƴ����е�Ԫ��
		set2.clear();
		System.out.println(set2);// []
		
		//contains(Object o)   �������ָ����Ԫ�� �򷵻�true
		System.out.println(set.contains("��")); //true
		
		//equals()  �Ƚ�����
		System.out.println(set.equals("wo")); //false
		
		//isEmpty() ���set������Ԫ�� �򷵻�true
		System.out.println(set.isEmpty());  //false
		System.out.println(set2.isEmpty());  //true
		
		//remove()  ɾ��Ԫ�صķ���
		System.out.println(set);//[��, ��, ��, ϰ, A, B, C]
		set.remove("A");
		set.remove("B");
		set.remove("C");
		set.remove("D");
		System.out.println(set); //[��, ��, ��, ϰ]
		
		//��ϰ������
		Iterator<String> in = set.iterator(); 
		System.out.println(in.next());
		System.out.println(in.next());
		System.out.println(in.next());
		System.out.println("=====================");
		
		for(Iterator<String> in1 = set.iterator();in1.hasNext();System.out.println(in1.next())){}
		
	}
}