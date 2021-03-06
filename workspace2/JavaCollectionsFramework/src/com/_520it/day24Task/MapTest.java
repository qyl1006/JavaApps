package com._520it.day24Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * 需求: 给一个n个字母String字符串计算每个字符出现次数,打印如: a = 9
 * 	分析: 根据打印的要求或者说一些数据结构类的添加元素特点,更适合用TreeMap来做存储--->貌似分析的不透彻...
 *
 */
public class MapTest {
	public static void main(String[] args) {
		String str = "asgdgsafvhsjedvaeaasnrfjhsvfhzxjfhzfvszf";
		
		//定义一个TreeMap类用于存储统计字符出现次数的结果
		Map<Character, Integer> map = new HashMap<>();

		//str转成Char[],之后用增强for循环遍历出每个字符
		for (Character ele : str.toCharArray()) {
			//若ele字符存在集合map的key中,就value + 1-->出现次数加1
			if (map.containsKey(ele)) {
				Integer old = map.get(ele);
				map.put(ele, old + 1);
			//否则直接put到map集合,并设value为1--->第一次出现次数	
			} else {
				map.put(ele, 1);  
			}
		}
		System.out.println(map);// 打印map
		
		//方式一 
		Map<Integer, String> map2 = new TreeMap<>(); //定义一个新Map集合,用于存储 <出现的次数, 出现的字母>
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
		
		//方式二 思路一样
		Map<Integer, String> map3 = new TreeMap<>(); //定义一个新Map集合,用于存储 <出现的次数, 出现的字母>
		//增强for循环遍历集合map所有的key
		for (Character ele : map.keySet()) {
			//得到map集合每一个key
			//判断当前出现次数是否在map2的key中
			if (map3.containsKey(map.get(ele))) {
				String old = String.valueOf(map3.get(map.get(ele)));//获取旧的map2的value值
				map3.put(map.get(ele), old + " " + String.valueOf(ele)); //拼接字符串后存储到map2的vlaue
				continue;
			}
				map3.put(map.get(ele), String.valueOf(ele)); //若map2的key不存在当前的出现次数,直接put添加
		}
		System.out.println(map3);
	}

}
