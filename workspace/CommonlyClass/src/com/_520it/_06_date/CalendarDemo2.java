package com._520it._06_date;

import java.util.Calendar;

public class CalendarDemo2 {
	public static void main(String[] args) {
		//����
		Calendar c = Calendar.getInstance();
		c.setTime(new java.util.Date());
		
		//���ڼ�1 ʱ �������ó�0
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		java.util.Date d2 = c.getTime();
		
		c.add(Calendar.DAY_OF_MONTH, -7);
		java.util.Date d1 = c.getTime();
		
		System.out.println("��ʼʱ�� "+ d1.toLocaleString());
		System.out.println("��ǰʱ��: " + d2.toLocaleString());
	}
	/*
	//���������,�����ж�ĳ��ʱ����Ƿ��ڹ�ȥn����,�Ƿ���true �񷵻�false
	 * 
	 * PS : ������ԵĻ�  ��ô��ô���ܵõ� ĳ������ʱ�� ��Date  ??
	 * 
	public static boolean judgmentTime(int num, Date date){
		Calendar c = Calendar.getInstance();
		c.setTime(new java.util.Date());
		*/
	}
