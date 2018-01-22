package com._520it.day24Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * ����: ��һ��n����ĸString�ַ�������ÿ���ַ����ִ���,��ӡ��: a = 9
 * 	����: ���ݴ�ӡ��Ҫ�����˵һЩ���ݽṹ�������Ԫ���ص�,���ʺ���TreeMap�����洢--->ò�Ʒ����Ĳ�͸��...
 *
 */
public class MapTest {
	public static void main(String[] args) {
		String str = "asgdgsafvhsjedvaeaasnrfjhsvfhzxjfhzfvszf";
		
		//����һ��TreeMap�����ڴ洢ͳ���ַ����ִ����Ľ��
		Map<Character, Integer> map = new HashMap<>();

		//strת��Char[],֮������ǿforѭ��������ÿ���ַ�
		for (Character ele : str.toCharArray()) {
			//��ele�ַ����ڼ���map��key��,��value + 1-->���ִ�����1
			if (map.containsKey(ele)) {
				Integer old = map.get(ele);
				map.put(ele, old + 1);
			//����ֱ��put��map����,����valueΪ1--->��һ�γ��ִ���	
			} else {
				map.put(ele, 1);  
			}
		}
		System.out.println(map);// ��ӡmap
		
		//��ʽһ 
		Map<Integer, String> map2 = new TreeMap<>(); //����һ����Map����,���ڴ洢 <���ֵĴ���, ���ֵ���ĸ>
		Set<Entry<Character, Integer>> entrys = map.entrySet();
		for(Map.Entry<Character, Integer> entry : entrys){
			if (map2.containsKey(entry.getValue())) {
				String old = map2.get(entry.getValue());
				map2.put(entry.getValue(), old + " " + entry.getKey().toString());
				continue;
			}
			map2.put(entry.getValue(), entry.getKey().toString());

		}
		System.out.println(map2);
		
		//��ʽ�� ˼·һ��
		Map<Integer, String> map3 = new TreeMap<>(); //����һ����Map����,���ڴ洢 <���ֵĴ���, ���ֵ���ĸ>
		//��ǿforѭ����������map���е�key
		for (Character ele : map.keySet()) {
			//�õ�map����ÿһ��key
			//�жϵ�ǰ���ִ����Ƿ���map2��key��
			if (map3.containsKey(map.get(ele))) {
				String old = String.valueOf(map3.get(map.get(ele)));//��ȡ�ɵ�map2��valueֵ
				map3.put(map.get(ele), old + " " + String.valueOf(ele)); //ƴ���ַ�����洢��map2��vlaue
				continue;
			}
				map3.put(map.get(ele), String.valueOf(ele)); //��map2��key�����ڵ�ǰ�ĳ��ִ���,ֱ��put����
		}
		System.out.println(map3);
	}

}