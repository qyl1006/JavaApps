package com._520it._06_date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		// 1)����Date����
		Date time = new Date();
		System.out.println(time);
		
		//2) ����ʱ�� ��������-----���Ե�ǰϵͳʱ��
		Date time3 = new Date(System.currentTimeMillis());
		System.out.println("�����������Date����: " + time3.toLocaleString());
		System.out.println("����" + new Date(9999999999999L).toLocaleString());
		
		
		//��ǰʱ��ת����long
		long time2 = time.getTime();
		System.out.println(time2);
		
		//��ӡ��ʽcn���ʱ���ʽ
		System.out.println(new Date().toLocaleString());
		System.out.println(new Date().toString());
	}
}