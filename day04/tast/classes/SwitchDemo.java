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
		String s = "星期日";
		String s1 = s;
		byte byte0 = -1;
		switch (s1.hashCode())
		{
		case 25961760: 
			if (s1.equals("星期一"))
				byte0 = 0;
			break;

		case 25961900: 
			if (s1.equals("星期二"))
				byte0 = 1;
			break;

		case 25961769: 
			if (s1.equals("星期三"))
				byte0 = 2;
			break;

		case 25964027: 
			if (s1.equals("星期四"))
				byte0 = 3;
			break;

		case 25961908: 
			if (s1.equals("星期五"))
				byte0 = 4;
			break;

		case 25962637: 
			if (s1.equals("星期六"))
				byte0 = 5;
			break;

		case 25967877: 
			if (s1.equals("星期日"))
				byte0 = 6;
			break;
		}
		switch (byte0)
		{
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
			System.out.println("今天上班");
			break;

		case 5: // '\005'
		case 6: // '\006'
			System.out.println("今天加班");
			break;
		}
		static class 1
		{

			static final int $SwitchMap$Today[];

			static 
			{
				$SwitchMap$Today = new int[Today.values().length];
				try
				{
					$SwitchMap$Today[Today.A.ordinal()] = 1;
				}
				catch (NoSuchFieldError nosuchfielderror) { }
				try
				{
					$SwitchMap$Today[Today.B.ordinal()] = 2;
				}
				catch (NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$Today[Today.C.ordinal()] = 3;
				}
				catch (NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$Today[Today.D.ordinal()] = 4;
				}
				catch (NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$Today[Today.E.ordinal()] = 5;
				}
				catch (NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$Today[Today.F.ordinal()] = 6;
				}
				catch (NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$Today[Today.G.ordinal()] = 7;
				}
				catch (NoSuchFieldError nosuchfielderror6) { }
			}
		}

		switch (1..SwitchMap.Today[Today.G.ordinal()])
		{
		case 7: // '\007'
			System.out.println("test");
			break;
		}
	}
}
