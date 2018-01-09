package com._520it._07_regex;

//�������ʽ  ע��:java�� һ�� '/' ��ʾת��  ����' //'�ű�ʾ��б��  /
public class RegexDemo {
	public static void main(String[] args) {
		//��֤�ֻ�����
		String phoneNumber = "13377129877";
		String regex = "^1[3|4|5|7|8][0-9]{9}$";
		System.out.println(phoneNumber.matches(regex));
		
		//��֤Email��ַ
		String email = "yuelin123A@gmail.cn";
		String regex2 = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"; 
		System.out.println(email.matches(regex2));
		
		//ֻ�����뺺��
		String input = "ջ֡������ķ�ʽ";
		String regex3 = "^[\u4e00-\u9fa5]{0,}$";
		System.out.println(input.matches(regex3));
		
		
	}
}