
package com._520it.day23Task;

import java.util.ArrayList;
import java.util.List;
/*需求: 使用for循环遍历List集合,并打印
 * 总结: ArrayList本身就是数组,-->集合只能存储对象,
 */

public class ForDemo {
	public static void main(String[] args) {
		//定义一个ArrayList集合
		List<Integer> list = new ArrayList<>();
		//添加元素
		list.add(1);//-------->自动装箱
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		//使用for循环遍历--
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
