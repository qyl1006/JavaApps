// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   SwitchDemo.java

import java.io.PrintStream;

public class SwitchDemo
{

	public SwitchDemo()
	{
	}

	public static void main(String args[])
	{
		byte byte0 = 8;
		switch (byte0)
		{
		case 1: // '\001'
			System.out.println("周1");
			break;

		case 2: // '\002'
			System.out.println("周2");
			break;

		case 3: // '\003'
			System.out.println("周3");
			break;

		case 4: // '\004'
			System.out.println("周4");
			break;

		case 5: // '\005'
			System.out.println("周5");
			break;

		case 6: // '\006'
			System.out.println("周6");
			break;

		case 7: // '\007'
			System.out.println("周7");
			break;

		default:
			System.out.println("没有这个日期");
			break;
		}
		byte byte1 = 8;
		switch (byte1)
		{
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			System.out.println("工作日");
			break;

		case 6: // '\006'
		case 7: // '\007'
			System.out.println("休息日");
			break;

		default:
			System.out.println("没有这个日期");
			break;
		}
	}
}
