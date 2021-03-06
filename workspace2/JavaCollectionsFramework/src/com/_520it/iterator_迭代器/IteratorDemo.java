package com._520it.iterator_迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 演示 迭代器
 */
//集合元素的迭代操作
public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		//for循环操作
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index)); //A B C D
		}
		System.out.println("------------------------");
		
		//2)for-each增强for循环
		for(Object ele : list){
			System.out.println(ele);//A B C D-->语法糖--不需要操作索引时候可用
		}
		System.out.println("===================");
//		使用迭代器iterator
//		Iterator i = list.iterator();//创建迭代器对象---> 源码也很简单  不删 备注看
//		for(Iterator i = list.iterator(); i.hasNext();){
//			System.out.println("迭代器: " + i.next());//A B C D
//			i.remove();  //这里为什么删除了还可以迭代出来全部元素-->原因:迭代器操作的数组是拷贝古来过来的.
//		}
//		System.out.println(list);// []
		
		//迭代器
		//创建迭代器对象
		Iterator ii = list.iterator();
//		System.out.println(ii.next()); //A
//		System.out.println(ii.next()); //B
//		System.out.println("======");
		
		//使用While循环操作迭代器Iterator
		while(ii.hasNext()){
			System.out.println(ii.next()); //A B C D
		}
		
		
		//此外还有两种迭代器 1) listIterator  2) Enumeration-->很古老的迭代器
	}
}		
