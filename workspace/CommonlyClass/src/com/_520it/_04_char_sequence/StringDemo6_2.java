package com._520it._04_char_sequence;

public class StringDemo6_2 {
	public static void main(String[] args) {
		/*
		 * ����: String fileNames = "abc.java;hello.txt;hello.java;hello.class";
					��ȡ��hello��ͷ���ļ����ĵĺ�׺��
		 * */
		String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		
		// 1) ʹ�� split(String regex)������ֳɸ����ļ���,�������һ���ַ���
		String[] fileStr = fileNames.split(";");
		for (String i : fileStr) {
			//System.out.println(i);
			//���÷���startsWith()�������ַ����Ƿ���ָ��"hello"ǰ׺��ʼ,��ɸѡ
			if (i.startsWith("hello")) {
				System.out.println(i);
				
				//���÷���lastIndexOf������"."�����ֵ�����ֵ
				int index = i.lastIndexOf(".");
				System.out.println(index);
				//���÷���substring()����ȡ������"."������ַ���
				String suffixName = i.substring(index);
				System.out.println(suffixName);
			}
			
		}
	}
}