// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StrinngDemo1.java

package com._520it._04_char_sequence;


public class StrinngDemo1
{

	public StrinngDemo1()
	{
	}

	public static void main(String args[])
	{
		String str1 = "ABCD";
		String str2 = "ABCD";
		String str3 = "ABCD";
		String temp = "AB";
		String str5 = (new StringBuilder(String.valueOf(temp))).append("CD").toString();
		String str6 = (new StringBuilder(String.valueOf(getXx()))).append("CD").toString();
	}

	private static String getXx()
	{
		return "AB";
	}
}
