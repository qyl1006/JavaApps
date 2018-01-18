package com._520it.day23Task;

import java.util.HashSet;
import java.util.Set;

/*
 * 需求: 证明证明 set 元素的唯一性(不可重复性)和不是替换的(非覆盖式添加元素)。
 * 
 * 分析: 1) 使用add()方法添加多个重复一样的元素,若set集合size数量不改变,则可证明
 * 
 * 		 2) 利用Set集合add()方法返回值来判断对于多个一样的元素是否覆盖添加
 * 
 * 		PS: 以HashSet为例
 */
public class ProveDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println("原始元素:" + set + "元素个数:" + set.size());
		
		//证明第一个
		set.add("A");
		set.add("A");
		set.add("A");
		System.out.println("1)元素:" + set + "元素个数:" + set.size());//元素个数为:3
		
		//证明第二个-->先添加一个新元素"D",返回true,表示添加成功,再次添加多个"D",若全部返回false,则证明成功
		System.out.println(set.add("D")); //true
		System.out.println(set.add("D")); //false
		System.out.println(set.add("D")); //false
		
		
		
		
	}
}
