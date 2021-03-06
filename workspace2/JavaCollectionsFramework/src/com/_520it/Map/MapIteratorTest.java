package com._520it.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 需求:测试方法entrySet()方法的Key与 方法keySet()返回的key 是否都可以获取value值
 */
public class MapIteratorTest {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		System.out.println(map.size());
		
		//使用方法entrySet()获取所有key-value,返回Set集合
		Set<Map.Entry<String, Object>> entrys = map.entrySet();
		System.out.println(entrys);
		
		//增强for循环--->迭代器
		for(Map.Entry<String, Object> entry : entrys){
			System.out.println(entry);
		}
		
		//for循环  使用迭代器
		for(Iterator<Entry<String, Object>> entry = entrys.iterator();entry.hasNext();System.err.println(entry.next())){} 
		
		//调用方法keySet()获取map所有的key集合,以Set集合返回
		Set<String> keys = map.keySet();
//		System.out.println(keys);
		//间接使用迭代器遍历map集合的Entry
		for(String ele : keys){
			System.out.println(ele + "-" + map.get(ele));
		}
	}
}
