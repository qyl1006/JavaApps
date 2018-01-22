package com._520it.Map;

import java.util.Map;
import java.util.TreeMap;

//�����ַ���������ĸ���ֵĴ���
public class MapDemo {
	public static void main(String[] args) {
		String str = "qllffnwiuerfadlaoifaodafzbfhadadvadanfvfudhadklzzhf";
		char[] arr = str.toCharArray();
		//����һ��Map��ʵ����
		Map<Character, Integer> map = new TreeMap<>();
		
		for(Character ele : arr){
			if(map.containsKey(ele)){
				Integer oldValue = map.get(ele);
				map.put(ele, oldValue + 1);
			}else{
				map.put(ele, 1);
			}
		}
		System.out.println(map);
	}
}