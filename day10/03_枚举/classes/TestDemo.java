// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestDemo.java

import java.io.PrintStream;

public class TestDemo
{

	public TestDemo()
	{
	}

	public static void main(String args[])
	{
		System.out.println(AAA.B);
		System.out.println(AAA.B.name());
		System.out.println(AAA.G.ordinal());
		static class 1
		{

			static final int $SwitchMap$AAA[];

			static 
			{
				$SwitchMap$AAA = new int[AAA.values().length];
				try
				{
					$SwitchMap$AAA[AAA.A.ordinal()] = 1;
				}
				catch (NoSuchFieldError nosuchfielderror) { }
				try
				{
					$SwitchMap$AAA[AAA.B.ordinal()] = 2;
				}
				catch (NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$AAA[AAA.C.ordinal()] = 3;
				}
				catch (NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$AAA[AAA.D.ordinal()] = 4;
				}
				catch (NoSuchFieldError nosuchfielderror3) { }
			}
		}

		switch (1..SwitchMap.AAA[AAA.D.ordinal()])
		{
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		default:
			return;
		}
	}
}
