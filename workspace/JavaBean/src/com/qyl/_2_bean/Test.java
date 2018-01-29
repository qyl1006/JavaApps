package com.qyl._2_bean;

import java.util.HashMap;
import java.util.Map;

import com.qyl._1_annont.Person;

public class Test {
	public static void main(String[] args) throws Exception {
		Person person = new Person("qyl", 12L, 17);
		Map map = BeanUtil.bean2Map(person);
		System.out.println(map);
		
		Person p = BeanUtil.map2Bean(map, Person.class);
		System.out.println(p);
		
		//纠错练习
		Map<String, Object> map2 = new HashMap<>();
		map2.put("id", 10L);
		map2.put("name", "逍遥");
		map2.put("age", 18);
		
		Person p2 = BeanUtil.map2Bean(map2, Person.class);
		System.out.println(p2);
		
		
		
	}
}


