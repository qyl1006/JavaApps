// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   IfDemo.java

import java.io.PrintStream;

public class IfDemo
{

	public IfDemo()
	{
	}

	public static void main(String args[])
	{
		System.out.println("10����3");
		boolean flag = true;
		if (flag)
			System.out.println("ȥ�в���");
		else
			System.out.println("ȥŮ����");
		byte byte0 = 20;
		byte byte1 = 100;
		if (byte0 > byte1)
			System.out.println((new StringBuilder()).append("���ֵ��:").append(byte0).toString());
		else
			System.out.println((new StringBuilder()).append("���ֵ��:").append(byte1).toString());
		char c = '\u0D5F';
		byte byte2 = 50;
		int i;
		if (c % byte2 == 0)
			i = c / byte2;
		else
			i = c / byte2 + 1;
		System.out.println((new StringBuilder()).append("��ҳ��:").append(i).toString());
		byte byte3 = 18;
		if (byte3 <= i)
		{
			int j;
			if (byte3 - 1 >= 1)
				j = byte3 - 1;
			else
				j = 1;
			int k;
			if (byte3 + 1 <= i)
				k = byte3 + 1;
			else
				k = i;
			System.out.println((new StringBuilder()).append("��ǰҳΪ:").append(byte3).toString());
			System.out.println((new StringBuilder()).append("��һҳΪ:").append(j).toString());
			System.out.println((new StringBuilder()).append("��һҳΪ:").append(k).toString());
		} else
		{
			System.out.println("����:��ǰҳ������ҳ��");
		}
	}
}
