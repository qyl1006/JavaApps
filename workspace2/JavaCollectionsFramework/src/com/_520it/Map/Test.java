package com._520it.Map;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("X");
		set.add("A");
		set.add("K");
		set.add("G");
		set.add("O");
		set.add("D");
		set.add("B");
		System.out.println(set);
		
		System.out.println(new Random().nextInt(2));
	}
}