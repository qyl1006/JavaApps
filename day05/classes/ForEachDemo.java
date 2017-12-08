// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   ForEachDemo.java

import java.io.PrintStream;

public class ForEachDemo
{

	public ForEachDemo()
	{
	}

	public static void main(String args[])
	{
		int ai[] = {
			10, 20, 30, 40, 50
		};
		for (int i = 0; i < ai.length; i++)
			System.out.println(ai[i]);

		System.out.println("==========");
		int ai1[] = ai;
		int j = ai1.length;
		for (int k = 0; k < j; k++)
		{
			int l = ai1[k];
			System.out.println(l);
		}

	}
}
