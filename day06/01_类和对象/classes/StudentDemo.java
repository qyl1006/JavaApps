// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   StudentDemo.java

import java.io.PrintStream;

public class StudentDemo
{

	public StudentDemo()
	{
	}

	public static void main(String args[])
	{
		Student student = new Student();
		student.name = "С��";
		student.age = 13;
		Student student1 = new Student();
		student1.name = "����";
		student1.age = 12;
		student1.ifPayment = true;
		Student student2 = new Student();
		student2.name = "����";
		student2.age = 13;
		student2.ifPayment = true;
		Student student3 = new Student();
		student3.name = "������";
		student3.age = 13;
		Student astudent[] = {
			student, student1, student2, student3
		};
		Student astudent1[] = astudent;
		int i = astudent1.length;
		for (int j = 0; j < i; j++)
		{
			Student student4 = astudent1[j];
			if (!student4.ifPayment)
				student4.payment();
			System.out.println(student4.ifPayment);
			int k = student4.payment();
			System.out.println(k);
		}

		System.out.println("==================");
		System.out.println(student);
		System.out.println(astudent[0]);
		student.name = "test";
		System.out.println(astudent[0].name);
		astudent[0].name = "test02";
		System.out.println(student.name);
	}
}
