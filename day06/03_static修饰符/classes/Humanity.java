// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StaticDemo.java


class Humanity
{

	String name;
	int age;
	static int totalPeople = 10;

	Humanity(String s, int i)
	{
		name = s;
		age = i;
		totalPeople++;
	}

}
