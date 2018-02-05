package com._520it.day23Task;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 *  ��ϰThreeSet�ķ���
�ܽ�:1) ������Ԫ���ظ�
	  2) ��������¼Ԫ������˳��
	  �ײ�ʹ�ú�����㷨,������������ǿ
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		//����Ԫ��
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set); //[1, 2, 3]
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(110);
		set2.add(120);
		
		set.addAll(set2);
		System.out.println(set);//[1, 2, 3, 110, 120]
		
		//�������ı���
		for(Iterator<Integer> in = set.iterator(); in.hasNext();System.out.println(in.next())){}
		
	}
}