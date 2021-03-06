package com._520it.day23Task;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 *  练习ThreeSet的方法
总结:1) 不允许元素重复
	  2) 不允许记录元素添加顺序
	  底层使用红黑树算法,区域搜索能力强
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		//添加元素
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set); //[1, 2, 3]
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(110);
		set2.add(120);
		
		set.addAll(set2);
		System.out.println(set);//[1, 2, 3, 110, 120]
		
		//迭代器的遍历
		for(Iterator<Integer> in = set.iterator(); in.hasNext();System.out.println(in.next())){}
		
	}
}
