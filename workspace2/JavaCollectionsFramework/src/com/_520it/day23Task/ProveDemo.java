package com._520it.day23Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/*
 * ����: ֤��֤�� set Ԫ�ص�Ψһ��(�����ظ���)�Ͳ����滻��(�Ǹ���ʽ����Ԫ��)��
 * 
 * ����: 1) ʹ��add()�������Ӷ���ظ�һ����Ԫ��,��set����size�������ı�,���֤��
 * 
 * 		 2) ����Set����add()��������ֵ���ж϶��ڶ��һ����Ԫ���Ƿ񸲸�����
 * 
 * 		PS: ��HashSetΪ��
 */
public class ProveDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println("ԭʼԪ��:" + set + "Ԫ�ظ���:" + set.size());
		
		//֤����һ��
		set.add("A");
		set.add("A");
		set.add("A");
		System.out.println("1)Ԫ��:" + set + "Ԫ�ظ���:" + set.size());//Ԫ�ظ���Ϊ:3
		
		//֤���ڶ���-->������һ����Ԫ��"D",����true,��ʾ���ӳɹ�,�ٴ����Ӷ��"D",��ȫ������false,��֤���ɹ�
		System.out.println(set.add("D")); //true
		System.out.println(set.add("D")); //false
		System.out.println(set.add("D")); //false
		
		//-----------------------------------------------------------------------------
		Set<String> set2 = new TreeSet<>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		System.out.println("ԭʼԪ��:" + set2 + "Ԫ�ظ���:" + set2.size());
		
		//֤����һ��
		set2.add("A");
		set2.add("A");
		set2.add("A");
		System.out.println("1)Ԫ��:" + set2 + "Ԫ�ظ���:" + set2.size());//Ԫ�ظ���Ϊ:3
		
		//֤���ڶ���-->������һ����Ԫ��"D",����true,��ʾ���ӳɹ�,�ٴ����Ӷ��"D",��ȫ������false,��֤���ɹ�
		System.out.println(set2.add("D")); //true
		System.out.println(set2.add("D")); //false
		System.out.println(set2.add("D")); //false
		
		System.out.println("---------------------------------------------------------------------");
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		System.out.println(map.size());  //1
		String str = map.put("key1", "value2");
		System.out.println(str);
		String str2 = map.put("key1", "value3");   //���Ǻ�᷵��֮ǰkey��Ӧ��valueֵ
		System.out.println(str2);
		System.out.println(map);       //֤���ظ���Entry�Ḳ������  
		System.out.println(map.size());//1 ֤��Ԫ�ز������ظ�
		
		
		
	}
}