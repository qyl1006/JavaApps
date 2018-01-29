package com._520it.day23Task;

import java.util.ArrayList;
import java.util.List;

/*
 * 需求: 使用增强for循环遍历集合
 * 总结: 底层依然采用for循环+ 索引来获取数组元素.--->通过查看反编译代码
 */
public class ForeachDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		for(String ele: list){
			System.out.println(ele);
		}
	}
}
