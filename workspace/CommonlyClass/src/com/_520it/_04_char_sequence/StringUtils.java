package com._520it._04_char_sequence;

public class StringUtils {
	
	private StringUtils() {
		
	}
	//�ж��ַ����Ƿ�Ϊ��; �ǿշ���true,����flase
	public static boolean test(String str){
		return str != null && !"".equals(str.trim());
	}
	
	public boolean test2(String str){
		return !test(str);
	}
	
	//����
	public static void main(String[] args) {
		String str1 = null;
		String str2 = "";
		String str3 = " ";
		String str4 = " A ";
		String str5 = " A B ";
		
		System.out.println(test(str1));
		System.out.println(test(str2));
		System.out.println(test(str3));
		System.out.println(test(str4));
		System.out.println(test(str5));
	}
}

