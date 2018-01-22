package com._520it.day23Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ����: ��ϰHashSet�ĳ��÷���--->Set�ӿڵķ���
 * 	�ܽ�: Set-->add()����Ԫ��ʱ�������Ѵ��ڵ�Ԫ��,�᷵��false
 * 	HashSet��Set�ӿ���õ�ʵ����,����˼��,�ײ�����˹�ϣ��(ɢ��/hash)�㷨.
	��ײ���ʵҲ��һ������-->��ѯ�ٶȳ�Ⱥ
	1) ������Ԫ���ظ�
	2) ��������¼Ԫ������˳��
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//����Ԫ�صķ���
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);//[1, 2, 3]
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(7);
		set2.add(8);
		set2.add(9);
		
		set.addAll(set2); //[1, 2, 3, 7, 8, 9]
		System.out.println(set);
		//�Ƴ�set������Ԫ��
//		set2.clear();
		System.out.println(set2);//[]
		
		//contains(object o) ���set����ָ����Ԫ��,�򷵻�true
		System.out.println(set.contains(90)); //false
		System.out.println(set.containsAll(set2)); //true
		
		//equals(Object o)  �Ƚ�ָ���Ķ���, ������---->���������Object��equals()
		System.out.println(set.equals(set)); //true
		
		
		//����������Ԫ��
		for(Iterator<Integer> in = set.iterator();in.hasNext();System.out.println(in.next())){}
		
		//size() ����Ԫ�ص�����int
		int size = set.size();
		System.out.println("set����Ԫ������:" + size);
		
		//remove(Object o)  ����ɾ�� ����true
		set.remove(9);
		set.remove(8);
		set.remove(7);
		System.out.println(set);
		
	}
}