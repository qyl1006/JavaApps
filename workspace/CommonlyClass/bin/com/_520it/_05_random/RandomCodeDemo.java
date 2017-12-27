// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   RandomCodeDemo.java

package com._520it._05_random;

import java.util.Random;

public class RandomCodeDemo
{

	public RandomCodeDemo()
	{
	}

	public static void main(String args[])
	{
		String str = "qazxswedcvfrtgbnhyujmkiolp";
		str = (new StringBuilder(String.valueOf(str))).append(str.toUpperCase()).toString();
		str = (new StringBuilder(String.valueOf(str))).append("0123456789").toString();
		Random random = new Random();
	}
}
