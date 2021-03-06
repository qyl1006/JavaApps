package com._520it.List_Vector;

import java.util.Vector;

/* 演示 Vector类的方法
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.addElement(12);//------>集合中只能存储对象..这里没有报错是因为1.7版本自动装箱,要看效果验证改成1.5一下就会报错
		
		// 2) 验证---->集合类中存储的对象,都存储的是对象的引用,而不是对象本身.
		Vector vv = new Vector();
		System.out.println(vv); //[]
		
		StringBuilder sb = new StringBuilder(5);
		sb.append("测试集合类存储的是对象的引用");
		vv.addElement(sb);
		System.out.println(vv); //[测试集合类存储的是对象的引用]
		sb.append("若打印vv出现这段文字,说明集合类存储的是对象的引用");
		System.out.println(vv); //OK
		
		Vector v3 = new Vector();
		StringBuilder sb1 = new StringBuilder();
		sb1.append(123);
		v3.add(sb1);
		System.out.println(v3);

	}
}
