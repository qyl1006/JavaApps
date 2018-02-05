package com._520it.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ����:���Է���entrySet()������Key�� ����keySet()���ص�key �Ƿ񶼿��Ի�ȡvalueֵ
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
		
		//ʹ�÷���entrySet()��ȡ����key-value,����Set����
		Set<Map.Entry<String, Object>> entrys = map.entrySet();
		System.out.println(entrys);
		
		//��ǿforѭ��--->������
		for(Map.Entry<String, Object> entry : entrys){
			System.out.println(entry);
		}
		
		//forѭ��  ʹ�õ�����
		for(Iterator<Entry<String, Object>> entry = entrys.iterator();entry.hasNext();System.err.println(entry.next())){} 
		
		//���÷���keySet()��ȡmap���е�key����,��Set���Ϸ���
		Set<String> keys = map.keySet();
//		System.out.println(keys);
		//���ʹ�õ���������map���ϵ�Entry
		for(String ele : keys){
			System.out.println(ele + "-" + map.get(ele));
		}
	}
}