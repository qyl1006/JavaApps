package com.qyl._2_bean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Arrays;

import com.qyl._1_annont.Person;

/*
 * 需求:获取User类中的属性名称/类型/(读/写属性的方法)
 */
public class IntrospectorDemo {
	public static void main(String[] args) throws Exception {
		//通过Introspector来获取BeanInfo对象
		BeanInfo b = Introspector.getBeanInfo(Person.class, Object.class);//第二个参数决定从哪里停止找属性
		PropertyDescriptor[] ps = b.getPropertyDescriptors();
		System.out.println(ps.length);
		
		//循环获到的属性ps[]  得到Person类中的各种属性并打印
		for (PropertyDescriptor propertyDescriptor : ps) {
			System.out.println("属性的类型:" + propertyDescriptor.getPropertyType());
			System.out.println("属性的名字:" + propertyDescriptor.getName());
			System.out.println("属性读的方法" + propertyDescriptor.getReadMethod());
			System.out.println("属性写的方法" + propertyDescriptor.getWriteMethod());
		}
	}
}
