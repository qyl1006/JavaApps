// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   VariableParameterDemo.java

import java.io.PrintStream;

public class VariableParameterDemo
{

	public VariableParameterDemo()
	{
	}

	static double getSum1(double ad[], double d)
	{
		double d1 = 0.0D;
		for (int i = 0; i < ad.length; i++)
			d1 += ad[i];

		return d1 * d;
	}

	static double getSum2(double ad[], double d)
	{
		double d1 = 0.0D;
		double ad1[] = ad;
		int i = ad1.length;
		for (int j = 0; j < i; j++)
		{
			double d2 = ad1[j];
			d1 += d2;
		}

		return d1 * d;
	}

	static transient double getSum3(double ad[])
	{
		double d = 0.0D;
		double ad1[] = ad;
		int i = ad1.length;
		for (int j = 0; j < i; j++)
		{
			double d1 = ad1[j];
			d += d1;
		}

		return d;
	}

	public static void main(String args[])
	{
		double ad[] = {
			10D, 20D, 30D, 40D
		};
		System.out.println(getSum1(ad, 0.80000000000000004D));
		System.out.println(getSum2(ad, 0.80000000000000004D));
		System.out.println(getSum3(new double[] {
			10D, 20D, 30D, 40D
		}));
	}
}
