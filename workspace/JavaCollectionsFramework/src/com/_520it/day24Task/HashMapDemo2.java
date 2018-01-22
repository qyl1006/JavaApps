package com._520it.day24Task;

import java.util.HashMap;
import java.util.Map;

//��ϰHashMap�ĳ��÷���
public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		System.out.println(map);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("map2key", "map2value");
		
		//��addAll(xx) ����
		map.putAll(map2);
		System.out.println(map);//{key3=value3, key2=value2, key1=value1, map2key=map2value}

		//���
		map2.clear();
		System.out.println(map2);// {}
		
		//get(Object key) ͨ��key����ȡ��Ӧ��valueֵ  --->Ϊʲôû��ͨ��value����ȡkey�ķ���--->��Ϊkey�ǲ����ظ���,����Ψһ��Ӧ��valueֵ,��value��һ��
		System.out.println(map.get("key3"));
		
		//isEmpty() ���û��entry ����true
		System.out.println(map.isEmpty()); //false
		System.out.println(map2.isEmpty()); //true
		
		//remove(Object key)  ɾ��ָ����key��ӳ���ϵ(������ڵĻ�)
		map.remove("map2key");
		System.out.println(map);
		
		System.out.println(map.size());
		
		
		
		
	}
}