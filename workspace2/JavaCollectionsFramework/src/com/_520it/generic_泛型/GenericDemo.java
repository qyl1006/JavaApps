package com._520it.generic_����;

import java.util.ArrayList;
import java.util.List;

/*
 * ��ʾ ����Generic��ʹ��
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();    //--> new�����ʱ�� ǰ������Ӧ����ͬ
		list.add(12);
		Integer i = list.get(0);   //------> ���ͷ������-->�﷨��--->�ײ㻹���Զ�ǿתOInteger����
		System.out.println(i);
		
		
		List<String> str = new ArrayList<>();
		str.add("12");
	}
}
