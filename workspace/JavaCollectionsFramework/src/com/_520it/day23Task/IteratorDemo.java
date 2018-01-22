package com._520it.day23Task;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/*
 * ����: 1)ʹ�õ�������������; 2)��ʾ��ʹ�õ�������ȡnextʱɾ��Ԫ�ص���ȷ����
 * 
 * �ܽ�:  ʹ�õ���������ʱ����ʹ�õ�������remove()����ɾ��Ԫ��,���򱨴�: ConcurrentModificationException
 * 		ԭ��: --->Դ����--��ʾ������next()ÿ�����ж���Բ�����modCount���м��:---> checkForComodification();--->
 * 																	final void checkForComodification() {
															            if (modCount != expectedModCount)
															                throw new ConcurrentModificationException();
 */
public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("C");
		list.add("D");
		
		//���յ���������--->����ArrayList�ڲ���Irt��������ķ���
		Iterator in = list.iterator();
		//��ȡ��һ��Ԫ��
//		System.out.println(in.next());
//		System.out.println(in.next());
		
		//ʹ��Whileѭ�� ����-------->����hasNext()����
//		while(in.hasNext()){
//			System.out.println(in.next());
//		}
		
		//��ǿforѭ��------------->����hasNext()����
//		Iterator in2 = list.iterator();
//		for(Object ele : list){
//			System.err.println(ele);
//		}
		
		//forѭ��
//		for(Iterator in3 = list.iterator(); in3.hasNext();System.out.println(in3.next())){}
		
		//ʹ�õ���������ʱ��ȷ��ɾ��Ԫ�ط���
		System.out.println(list); //[A, B, C, D, C, D]
		for(Iterator in4 = list.iterator(); in4.hasNext();){
			if("C".equals(in4.next())){
				in4.remove();
			}
		}
		System.out.println(list); // [A, B, D, D]
		
	}
}