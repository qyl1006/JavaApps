package com._520it._04_char_sequence;

public class StringUtils {
	
	private StringUtils() {
		
	}
	//�ж��ַ����Ƿ�Ϊ��; �ǿշ���true,����flase
	public static boolean hasLength(String str){
		return str != null && !"".equals(str.trim());
	}
	
	public static boolean isBlank(String str){
		return !hasLength(str);
	}
	
	//����
	public static void main(String[] args) {
		String str1 = null;
		String str2 = "";
		String str3 = " ";
		String str4 = " A ";
		String str5 = " A B ";
		
		System.out.println(hasLength(str1));
		System.out.println(hasLength(str2));
		System.out.println(hasLength(str3));
		System.out.println(hasLength(str4));
		System.out.println(hasLength(str5));
	}
}


