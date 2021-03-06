package com._520it.day24Task;

import java.util.HashMap;
import java.util.Map;

//练习HashMap的常用方法
public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		System.out.println(map);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("map2key", "map2value");
		
		//和addAll(xx) 相似
		map.putAll(map2);
		System.out.println(map);//{key3=value3, key2=value2, key1=value1, map2key=map2value}

		//清空
		map2.clear();
		System.out.println(map2);// {}
		
		//get(Object key) 通过key来获取对应的value值  --->为什么没有通过value来获取key的方法--->因为key是不可重复的,都有唯一对应的value值,而value则不一定
		System.out.println(map.get("key3"));
		
		//isEmpty() 如果没有entry 返回true
		System.out.println(map.isEmpty()); //false
		System.out.println(map2.isEmpty()); //true
		
		//remove(Object key)  删除指定键key的映射关系(如果存在的话)
		map.remove("map2key");
		System.out.println(map);
		
		System.out.println(map.size());
		
		
		
		
	}
}
