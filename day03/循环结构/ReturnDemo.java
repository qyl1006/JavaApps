// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ReturnDemo.java

import java.io.PrintStream;

public class ReturnDemo
{

	public ReturnDemo()
	{
	}

	public static void main(String args[])
	{
		for (int i = 1; i <= 10; i++)
			if (i != 4)
				System.out.println(i);

		System.out.println("------ending----");
		System.out.println("============");
		for (int j = 1; j <= 10; j++)
		{
			if (j == 4)
				return;
			System.out.println(j);
		}

		System.out.println("------ending----");
	}
}
