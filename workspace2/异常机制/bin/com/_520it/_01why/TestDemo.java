// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestDemo.java

package com._520it._01why;

import java.io.PrintStream;

public class TestDemo
{

	public TestDemo()
	{
	}

	public static void main(String args[])
	{
		int arr[] = {
			1, 2, 3, 4
		};
		Integer age = Integer.valueOf("12");
		System.out.println(age);
		try
		{
			int ret = 20 / 0;
			System.out.println(ret);
		}
		catch (ArithmeticException e)
		{
			System.out.println("“Ï≥£≤‚ ‘");
		}
		System.out.println("enging.......");
	}
}
