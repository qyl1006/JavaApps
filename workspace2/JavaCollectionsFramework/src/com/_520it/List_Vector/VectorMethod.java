package com._520it.List_Vector;

import java.util.Vector;

/*
 * 演示Vector方法
 */
public class VectorMethod {
	public static void main(String[] args) {
		vectorAdd();
		vectorRemove();
		vectorSet();
	}

	private static void vectorAdd() {
//		//增加:
//			boolean add(Object e) 将指定元素添加到此向量的末尾,等价于addElement方法。

		Vector v = new Vector();
		v.add('1');
		v.add(2);
		v.add(3);
		System.out.println(v);
//			void add(int index, Object element)  在此向量的指定位置插入指定的元素。
		v.add(1, "你好世界");
		System.out.println(v);
//			boolean addAll(Collection c) :把c集合中的元素添加到当前集合对象中
		Vector vv = new Vector();
		vv.add("我是一个整体别拆开我");
		vv.add("1");
		vv.add("1");
		vv.add("1");
		vv.add("1");
		v.add(vv);
		System.out.println(v);//[1, 你好世界, 2, 3, [我是一个整体别拆开我]]
		System.out.println(v.size());
		v.removeAll(vv);
		System.out.println(v);
		System.out.println(v.size());
		Object v3 = v.set(4, "嘻嘻");
		System.out.println(v);
		System.out.println(v3);
		
//		v.addAll(vv);
//		System.out.println(v);//[1, 你好世界, 2, 3, 我是一个整体别拆开我]-->很明显 拆开了 底层就是把vv先转成char数组,然后复制到v上面
//		System.out.println(v.size());
//		v.removeAll(vv);
//		System.out.println(v);
//		v.retainAll(vv);
//		System.out.println(v);
	}
	private static void vectorRemove() {
//		删除:
//			Object remove(int index) :删除指定索引位置的元素,并返回删除之后的元素.
		
		
//			boolean remove(Object o):删除指定的元素.
//			boolean removeAll(Collection c):从此集合中移除包含在指定 集合c中的所有元素。 
//			boolean retainAll(Collection c):在此集合中仅保留包含在指定 集合c中的元素,求两个集合的交集。 

	}
	public static void vectorSet(){
		System.out.println("========================================");

	}
}
