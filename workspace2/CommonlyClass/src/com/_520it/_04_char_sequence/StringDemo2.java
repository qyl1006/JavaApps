package com._520it._04_char_sequence;

import java.awt.print.Printable;
import java.util.Arrays;

public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * 1):String�Ĵ�����ת��
				String(char[] value):��char����ת��Ϊ�ַ���
				char[] toCharArray():���ַ���ת��Ϊchar����
				byte[] getBytes():���ַ���ת��Ϊbyte����
				String(byte[] bytes):��byte����ת��Ϊ�ַ���			
		 * */
		// 1)String(char[] value):��char����ת��Ϊ�ַ���  PS�ַ��������Ͼ���char����
		char[] cs = new char[]{'1', '2', '3', '4'};
		String s = new String(cs);     // ʹ��String������
		System.out.println(s);
	
		// 2) char[] toCharArray():���ַ���ת��Ϊchar����
		String s2 = "ABCD";
		char[] cs2 = s2.toCharArray();    //String�������
		System.out.println(cs2);
		
		// 3) byte[] getBytes():���ַ���ת��Ϊbyte����
		String s3 = "abcdefg";
		byte[] b3 = s3.getBytes();       //String�������
		System.out.println(Arrays.toString(b3));
		
		// 4) String(byte[] bytes):��byte����ת��Ϊ�ַ���
		String s4 = new String(b3);       // ʹ��String������
		System.out.println(s4);
		
	}
}