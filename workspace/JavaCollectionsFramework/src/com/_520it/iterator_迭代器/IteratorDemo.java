package com._520it.iterator_迭代器;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * 演示 迭代器
 */

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		//使用不同方法迭代出来
		//1) 
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		System.out.println("------------------------");
		
		//2)for-each增强for循环
		for(Object ele : list){
			System.out.println(ele);
		}
		System.out.println("===================");
		//使用迭代器iterator
//		Iterator i = list.iterator();//创建迭代器对象---> 源码也很简单  不删 备注看
		for(Iterator i = list.iterator(); i.hasNext();){
			System.out.println("迭代器: " + i.next());
			i.remove();  //这里为什么删除了还可以迭代出来全部元素-->原因:迭代器操作的数组是拷贝古来过来的.
		}
		System.out.println(list);
		
		//此外还有两种迭代器 1) listIterator  2) Enumeration-->很古老的迭代器
	}
}		
