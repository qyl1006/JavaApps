// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SwapVarDemo.java

import java.io.PrintStream;

public class SwapVarDemo
{

	public SwapVarDemo()
	{
	}

	public static void main(String args[])
	{
		int i = 10;
		int j = 20;
		byte byte0 = i;
		i = j;
		j = byte0;
		System.out.println((new StringBuilder()).append("a的值: ").append(i).append(" b的值: ").append(j).toString());
		i ^= j;
		j = i ^ j;
		i ^= j;
		System.out.println((new StringBuilder()).append("a的值: ").append(i).append(" b的值: ").append(j).toString());
		i = j - i;
		j -= i;
		i = j + i;
		System.out.println((new StringBuilder()).append("a的值: ").append(i).append(" b的值: ").append(j).toString());
		Integer integer = Integer.valueOf(i);
		Integer integer1 = Integer.valueOf(j);
		Integer integer2 = integer;
		integer = integer1;
		integer1 = integer2;
		System.out.println(integer.intValue() == 10);
		System.out.println(integer1.intValue() == 20);
	}
}
