package com._520it._04_char_sequence;

public class StringDemo7 {
	public static void main(String[] args) {
		/*
		 * ����: ������ĸ��д,����Сд
		 * */
		String str = "sCHooL";
		
		/*˼·: 1)�Ƚ�ȡstr�ĵ�һ���ַ�---��д����
				2)�ڽ�ȡstr�ĵ�һ���ַ�֮��������ַ�-----Сд����
				3)��1) ��  2) ������ȡ���ַ��� + ����
		*/
		
		// 1) �Ƚ�ȡstr�ĵ�һ���ַ�---��д����
		String initials =str.substring(0, 1).toUpperCase();
		System.out.println(initials);
		
		//2)  �ڽ�ȡstr�ĵ�һ���ַ�֮��������ַ�-----Сд����
		String other = str.substring(1).toLowerCase();
		System.out.println(other);
		
		//3) ��1) ��  2) ������ȡ���ַ��� + ����
		String word = initials + other;
		System.out.println(word);
	}
}