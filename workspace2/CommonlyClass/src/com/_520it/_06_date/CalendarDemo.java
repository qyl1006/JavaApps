package com._520it._06_date;

import java.util.Calendar;


public class CalendarDemo {
	public static void main(String[] args) {
		//����Calendar����
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow);
		
		System.out.println("��: " + rightNow.get(Calendar.YEAR));
		System.out.println("��: " + (rightNow.get(Calendar.MONTH)+ 1));
		System.out.println("��: " + rightNow.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ: " + rightNow.get(Calendar.HOUR_OF_DAY));
		System.out.println("��: " + rightNow.get(Calendar.MINUTE));
		System.out.println("��: " + rightNow.get(Calendar.SECOND));
		
		// add() ���������Ĺ���Ϊ�����������ֶ����ӻ��ȥָ����ʱ����
		System.out.println("===================================");
		System.out.println(rightNow.getTime().toLocaleString());
		rightNow.add(Calendar.DAY_OF_MONTH, -15);
		System.out.println(rightNow.getTime().toLocaleString());
		
	}
}