package com._520it._04_char_sequence;

public class ClassDemo6 {
	public static void main(String[] args) {
		
		//���� split()����  ���ݸ����������ʽ��ƥ���ִ��ַ���  �����ַ�����
		String s = "abc.txt;123.java;fdsffs.class";
		String[] s2 = s.split(";");  // ���
		System.out.println(s2);
		for (String i : s2) {
			System.out.println(i);
		}
		
		
		// ����startWith()���� ���Դ��ַ�����ָ��������ʼ�����ַ����Ƿ���ָ��ǰ׺��ʼ������boolean
		System.out.println(s.startsWith("abc."));  //����ָǰ׺ ����0��ʼ(Ĭ��0)
		
		//����lastIndexOf(String str)����ָ�����ַ����ڴ��ַ��������ұ߳��ִ��������������ұߵĿ��ַ��� "" ��Ϊ����������ֵ this.length() �������ص�������
		System.out.println(s.lastIndexOf("."));
		
		//���� substring(int beginIndex����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ����������ַ�����ָ�����������ַ���ʼ��ֱ�����ַ���ĩβ
		String newStr = s.substring(23);
		System.out.println(newStr);
	}
}