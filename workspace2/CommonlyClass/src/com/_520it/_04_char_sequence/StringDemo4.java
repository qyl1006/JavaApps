package com._520it._04_char_sequence;

public class StringDemo4 {
	public static void main(String[] args) {
		/*
		 * 4):�ַ����Ƚ��ж�
				boolean equals(Object anObject) �����ַ�����ָ���Ķ���Ƚϡ� 
				boolean equalsIgnoreCase(String anotherString) ���� String ����һ�� String �Ƚϣ������Ǵ�Сд
				boolean contentEquals(CharSequence cs) �����ַ�����ָ���� CharSequence �Ƚ�
		 * */
		
		
		// 1) boolean equals(Object anObject) �����ַ�����ָ���Ķ���Ƚ�  �Ƚϵ��������ڴ�洢��ֵ
		String s1 = new String("ab");
		String ss2 = s1 + "cd";
		String ss1 = "ab" + "cd";
		System.out.println(ss2.equals(ss1));
		
		// 2) boolean equalsIgnoreCase(String anotherString) ���� String ����һ�� String �Ƚϣ������Ǵ�Сд
		String s2 = "ABcd";
		String s22 = "abcd";
		System.out.println(s2.equalsIgnoreCase(s2));  //true
		System.out.println(s2.equals(ss2));           //false �����ִ�Сд
		
		// 3) boolean contentEquals(CharSequence cs) �����ַ�����ָ���� CharSequence �Ƚ�
		String s3 = "ABCDE";
		String s33 = "ABCDE";
		System.out.println(s3.contentEquals(s33));  //true  �ȼ��ڵ�һ�� equals  
		
		
		
	}
}
