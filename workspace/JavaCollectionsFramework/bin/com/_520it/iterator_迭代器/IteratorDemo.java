// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IteratorDemo.java

package com._520it.iterator_8FED4EE35668;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{

	public IteratorDemo()
	{
	}

	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		for (int index = 0; index < list.size(); index++)
			System.out.println(list.get(index));

		System.out.println("------------------------");
		Object ele;
		for (Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(ele))
			ele = iterator.next();

		System.out.println("===================");
		for (Iterator i = list.iterator(); i.hasNext(); System.out.println((new StringBuilder("µü´úÆ÷: ")).append(i.next()).toString()));
	}
}
