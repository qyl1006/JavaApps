package com._520it._04_char_sequence;

public class StringDemo3 {
	public static void main(String[] args) {
		/*2):��ȡ�ַ�����Ϣ
				int length() ���ش��ַ����ĳ��� 
				char charAt(int index) ����ָ���������� char ֵ 
				int indexOf(String str)����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ��������� 
				int lastIndexOf(String str)����ָ�����ַ����ڴ��ַ��������ұ߳��ִ������� 
		 * */
		
		//  1) int length() ���ش��ַ����ĳ���
		System.out.println("abcd12��".length()); //7
		String s1 = new String("asd12��");
		System.out.println(s1.length());  //6
		
		// 2) char charAt(int index) ����ָ���������� char ֵ
		String s2 = "A B C ";
		char c2 = s2.charAt(1);  // �ո�Ҳ��һ���ַ�char
		System.out.println(c2);
		//System.out.println(s2.charAt(12));  //���� ����Խ��
		
		//  3)  int indexOf(String str)����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ���������
		//  4)  int lastIndexOf(String str)����ָ�����ַ����ڴ��ַ��������ұ߳��ִ������� 
		String s3 = "AABSAABABAVAA";
		System.out.println(s3.indexOf("BA")); //��һ�γ��ֵ�����
		System.out.println(s3.lastIndexOf("BA"));  //���һ�γ��ֵ�����
		
		
		
		
	}

}