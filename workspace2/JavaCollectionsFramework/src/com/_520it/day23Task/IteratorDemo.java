package com._520it.day23Task;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/*
 * 需求: 1)使用迭代器遍历集合; 2)演示在使用迭代器获取next时删除元素的正确方法
 * 
 * 总结:  使用迭代器遍历时必须使用迭代器的remove()方法删除元素,否则报错: ConcurrentModificationException
 * 		原因: --->源代码--显示迭代器next()每次运行都会对操作数modCount进行检查:---> checkForComodification();--->
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
		
		//接收迭代器对象--->利用ArrayList内部类Irt迭代器类的方法
		Iterator in = list.iterator();
		//获取下一个元素
//		System.out.println(in.next());
//		System.out.println(in.next());
		
		//使用While循环 遍历-------->利用hasNext()方法
//		while(in.hasNext()){
//			System.out.println(in.next());
//		}
		
		//增强for循环------------->利用hasNext()方法
//		Iterator in2 = list.iterator();
//		for(Object ele : list){
//			System.err.println(ele);
//		}
		
		//for循环
//		for(Iterator in3 = list.iterator(); in3.hasNext();System.out.println(in3.next())){}
		
		//使用迭代器遍历时正确的删除元素方法
		System.out.println(list); //[A, B, C, D, C, D]
		for(Iterator in4 = list.iterator(); in4.hasNext();){
			if("C".equals(in4.next())){
				in4.remove();
			}
		}
		System.out.println(list); // [A, B, D, D]
		
	}
}
