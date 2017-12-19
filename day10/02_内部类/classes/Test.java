// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InteriorClassDemo.java


class Test
{
	static class Test2
	{

		static String name = "内部类成员";

		public void print()
		{
		}


		Test2()
		{
		}
	}


	String name;

	Test()
	{
		name = "外部类成员Test.name";
	}

	public void print()
	{
	}
}
