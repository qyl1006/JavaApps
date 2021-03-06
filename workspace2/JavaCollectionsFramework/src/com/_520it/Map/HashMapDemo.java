package com._520it.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//演示HashMap类中的方法
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		
		//添加
		map.put("key1", "value1");
		map.put("key1", "修改key1对应的值-新值");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		System.out.println(map.size());
		System.out.println(map);
		
//		map.clear();
//		System.err.println(map.containsKey("key1"));
//		System.err.println(map.containsValue("value110"));
		
		System.out.println(map.get("key1"));//返回指定键所映射的值
		//map.clear();
		System.out.println("isEmpty:" + map.isEmpty());
		
		System.out.println(map.keySet());
		map.put("key1","12");
		System.out.println(map);
		
		map.remove("key1");
		System.out.println(map);
		
		System.out.println(map.values());
		
		System.out.println("===============================");
		Set<Map.Entry<String, Object>> entrys = map.entrySet();
		
		for (Entry<String, Object> entry : entrys) {
			System.out.println(entry);
		}
		
	}
}
