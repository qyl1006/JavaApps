// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IntegerDemo.java

import java.io.PrintStream;

public class IntegerDemo
{

	public IntegerDemo()
	{
	}

	public static void main(String args[])
	{
		Integer integer = new Integer(18);
		System.out.println(integer);
		Integer integer1 = Integer.valueOf(18);
		System.out.println(integer1);
		int i = integer.intValue();
		System.out.println(i);
		System.out.println("================");
		Integer integer2 = Integer.valueOf(20);
		System.out.println(integer2);
		int j = integer2.intValue();
		System.out.println(j);
	}
}
