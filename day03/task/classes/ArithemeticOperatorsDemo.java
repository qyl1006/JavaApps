// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ArithemeticOperatorsDemo.java

import java.io.PrintStream;

public class ArithemeticOperatorsDemo
{

	public ArithemeticOperatorsDemo()
	{
	}

	public static void main(String args[])
	{
		System.out.println((new Double(10D)).intValue() + (new Double(10D)).intValue());
		short word0 = 10;
		word0 += 10;
	}
}
