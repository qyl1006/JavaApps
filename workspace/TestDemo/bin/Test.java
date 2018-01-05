// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test.java

import java.io.PrintStream;

public class Test
{

	public Test()
	{
	}

	public static void main(String args[])
	{
		Integer i = Integer.valueOf(12);
		Integer i2 = Integer.valueOf(10);
		int a = i.intValue() * i2.intValue();
		System.out.println(a);
	}
}
