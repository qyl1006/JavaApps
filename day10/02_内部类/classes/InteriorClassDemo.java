// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InteriorClassDemo.java

import java.io.PrintStream;

public class InteriorClassDemo
{

	public InteriorClassDemo()
	{
	}

	public static void main(String args[])
	{
		System.out.println(123);
		Test.Test2 test2 = new Test.Test2();
		System.out.println(Test.Test2.name);
	}
}
