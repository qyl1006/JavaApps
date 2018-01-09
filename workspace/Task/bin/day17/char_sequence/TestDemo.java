// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestDemo.java

package day17.char_sequence;


public class TestDemo
{

	public TestDemo()
	{
	}

	public static void main(String args[])
	{
		String temp = "aa";
		String str1 = (new StringBuilder(String.valueOf(temp))).append("ss").toString();
		String str2 = "112";
	}
}
