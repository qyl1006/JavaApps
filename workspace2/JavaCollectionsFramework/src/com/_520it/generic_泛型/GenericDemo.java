package com._520it.generic_泛型;

import java.util.ArrayList;
import java.util.List;

/*
 * 演示 泛型Generic的使用
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();    //--> new对象的时候 前后类型应该相同
		list.add(12);
		Integer i = list.get(0);   //------> 泛型反编译后-->语法糖--->底层还是自动强转OInteger类型
		System.out.println(i);
		
		
		List<String> str = new ArrayList<>();
		str.add("12");
	}
}
