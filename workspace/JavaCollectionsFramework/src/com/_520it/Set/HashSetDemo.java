package com._520it.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("90");
		set.add("4");
		set.add("D");
		set.add("1");
		set.add("1");
		System.out.println(set.size());
		System.out.println(set);
	}
}
