package com._520it.List_Vector;

import java.util.Iterator;
import java.util.LinkedList;

//练习 LinkedLis的方法
public class LinkedListDemo {
	public static void main(String[] args) {
	LinkedList demo = new LinkedList();
	LinkedList demo2 = new LinkedList();
	demo.add(1);
	demo2.add(1);
	demo.add(2);
	demo2.add(2);
	demo.add(3);
	demo2.add(3);
	demo.add(4);
	demo2.add(4);
	System.out.println(demo);
	
//	demo.clear();
	System.out.println(demo2);
//	demo.add(demo2);
	demo.addAll(demo2);
	System.out.println(demo);
	demo.addFirst("插列表开头");
	demo.addLast("插入列表结尾处");
	System.out.println(demo);
	System.out.println(demo.get(0));
	System.out.println(demo.getLast());
	
	Iterator iter = demo.descendingIterator();
	
	System.out.println(iter.hasNext());
	System.out.println(iter.next());
	
	System.out.println(demo.pop());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
