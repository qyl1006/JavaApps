package com._520it.day23Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 需求: 练习HashSet的常用方法--->Set接口的方法
 * 	总结: Set-->add()添加元素时不覆盖已存在的元素,会返回false
 * 	HashSet是Set接口最常用的实现类,顾名思义,底层才用了哈希表(散列/hash)算法.
	其底层其实也是一个数组-->查询速度超群
	1) 不允许元素重复
	2) 不允许记录元素添加顺序
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		//添加元素的方法
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
		//移除set中所有元素
//		set2.clear();
		System.out.println(set2);//[]
		
		//contains(object o) 如果set包含指定的元素,则返回true
		System.out.println(set.contains(90)); //false
		System.out.println(set.containsAll(set2)); //true
		
		//equals(Object o)  比较指定的对象, 比内容---->如果覆盖了Object的equals()
		System.out.println(set.equals(set)); //true
		
		
		//迭代器遍历元素
		for(Iterator<Integer> in = set.iterator();in.hasNext();System.out.println(in.next())){}
		
		//size() 返回元素的数量int
		int size = set.size();
		System.out.println("set集合元素数量:" + size);
		
		//remove(Object o)  有着删除 返回true
		set.remove(9);
		set.remove(8);
		set.remove(7);
		System.out.println(set);
		
	}
}
