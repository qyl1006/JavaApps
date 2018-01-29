package com.qyl._2_bean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

/*
 * 需求: 两个功能1) JavaBean转Map
 * 				思考: 利用通过Introspector-->获取BeanInfo对象--->得到各个属性--->调用PropertyDescriptor属性名   读的方法获取属性值
 * 					  之后put()到HashMap中
 * 		
 * 				2) Map转JavaBean
 * 				和 1)类似
				利用通过Introspector-->获取BeanInfo对象--->得到各个属性--->调用PropertyDescriptor获取属性名 和 写的方法
				利用写的方法把Map中的value值(get(key))写入
				
		//主要问题就是难以确定这两个方法的返回值类型 与 传入参数类型  怎么写?
 */
public class BeanUtil {
	//JavaBean转Map
	public static Map<String, Object> bean2Map(Object obj) throws Exception{
		Map<String, Object> map = new HashMap<>();
		//获取属性名 和 属性值
		BeanInfo b = Introspector.getBeanInfo(obj.getClass(), Object.class);
		PropertyDescriptor[] ps = b.getPropertyDescriptors();

		for (PropertyDescriptor ele : ps) {
			String key = ele.getName();
			Object value = ele.getReadMethod().invoke(obj);
			
			//把key - value添加到Map
			map.put(key, value);
		}
		return map;
	}
	
	public static <T> T map2Bean(Map<String, Object>map, Class<T> cls) throws Exception{
		T obj = cls.newInstance();
		
		//获取obj中的属性名
		BeanInfo b = Introspector.getBeanInfo(obj.getClass(), Object.class);
		PropertyDescriptor[] ps = b.getPropertyDescriptors();
		for (PropertyDescriptor ele : ps) {
			String key = ele.getName();
			ele.getWriteMethod().invoke(obj, map.get(key));
		}
		
		return obj;
	}
}
