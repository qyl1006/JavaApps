package com._520it.day23Task;

import java.util.ArrayList;
import java.util.List;

/*
 * ����: ʹ����ǿforѭ����������
 * �ܽ�: �ײ���Ȼ����forѭ��+ ��������ȡ����Ԫ��.--->ͨ���鿴���������
 */
public class ForeachDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		for(String ele: list){
			System.out.println(ele);
		}
	}
}
