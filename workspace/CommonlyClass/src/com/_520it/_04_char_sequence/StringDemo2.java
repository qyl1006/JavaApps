package com._520it._04_char_sequence;

public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * 1):String�Ĵ�����ת��
				String(char[] value):��char����ת��Ϊ�ַ���
				char[] toCharArray():���ַ���ת��Ϊchar����
				byte[] getBytes():���ַ���ת��Ϊbyte����
				String(byte[] bytes):��byte����ת��Ϊ�ַ���			
		 * */
		// 1)String(char[] value):��char����ת��Ϊ�ַ���
		char[] cs = new char[]{'1', '2', '3', '4'};
		String s = new String(cs);
		System.out.println(s);
	}
}