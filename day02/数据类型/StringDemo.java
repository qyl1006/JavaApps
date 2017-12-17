// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StringDemo.java

import java.io.PrintStream;

public class StringDemo
{

	public StringDemo()
	{
	}

	public static void main(String args[])
	{
		System.out.println("Hello Wrold");
		String s = "Ëû18Ëê";
		System.out.println(s);
		System.out.println((new StringBuilder()).append(s).append("Âð?").toString());
	}
}
