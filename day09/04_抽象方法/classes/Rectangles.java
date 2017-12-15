// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AcreageDemo.java


class Rectangles
{

	private Integer length;
	private Integer high;

	Rectangles(Integer integer, Integer integer1)
	{
		length = integer;
		high = integer1;
	}

	public Double area()
	{
		return Double.valueOf(length.doubleValue() * high.doubleValue());
	}
}
