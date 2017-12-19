// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   TestDemo.java


final class AAA extends Enum
{

	public static final AAA A;
	public static final AAA B;
	public static final AAA C;
	public static final AAA D;
	public static final AAA E;
	public static final AAA F;
	public static final AAA G;
	private static final AAA $VALUES[];

	public static AAA[] values()
	{
		return (AAA[])$VALUES.clone();
	}

	public static AAA valueOf(String s)
	{
		return (AAA)Enum.valueOf(AAA, s);
	}

	private AAA(String s, int i)
	{
		super(s, i);
	}

	static 
	{
		A = new AAA("A", 0);
		B = new AAA("B", 1);
		C = new AAA("C", 2);
		D = new AAA("D", 3);
		E = new AAA("E", 4);
		F = new AAA("F", 5);
		G = new AAA("G", 6);
		$VALUES = (new AAA[] {
			A, B, C, D, E, F, G
		});
	}
}
