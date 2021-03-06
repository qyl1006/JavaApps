package com._520it.day23Task;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * 需求: 练习LinkedHashSet的方法--->Set接口的常用方法
 * 	总结: 底层使用 链表 和 哈希表 算法-->可记录元素的先后添加顺序
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		//添加元素
		set.add("我");
		set.add("在");
		set.add("练");
		set.add("习");
		System.out.println(set);//[我, 在, 练, 习]
		
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		
		set.addAll(set2);
		System.out.println(set); //[我, 在, 练, 习, A, B, C]
		
		//移除所有的元素
		set2.clear();
		System.out.println(set2);// []
		
		//contains(Object o)   如果包含指定的元素 则返回true
		System.out.println(set.contains("我")); //true
		
		//equals()  比较内容
		System.out.println(set.equals("wo")); //false
		
		//isEmpty() 如果set不包含元素 则返回true
		System.out.println(set.isEmpty());  //false
		System.out.println(set2.isEmpty());  //true
		
		//remove()  删除元素的方法
		System.out.println(set);//[我, 在, 练, 习, A, B, C]
		set.remove("A");
		set.remove("B");
		set.remove("C");
		set.remove("D");
		System.out.println(set); //[我, 在, 练, 习]
		
		//练习迭代器
		Iterator<String> in = set.iterator(); 
		System.out.println(in.next());
		System.out.println(in.next());
		System.out.println(in.next());
		System.out.println("=====================");
		
		for(Iterator<String> in1 = set.iterator();in1.hasNext();System.out.println(in1.next())){}
		
	}
}
