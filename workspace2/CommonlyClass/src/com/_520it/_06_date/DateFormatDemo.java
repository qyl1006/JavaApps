package com._520it._06_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;



public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		
		//��ʽ�� --->Date���Ͷ���--------->String����  String format(Date date) 

		Date d = new Date();
		
		DateFormat time = DateFormat.getInstance();//Ĭ�� SHORT���
		String str = time.format(d);               //17-12-28 ����4:22
		System.out.println(str);
		
		System.out.println("------------------------------------");
		time = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);  //LONG���
		System.out.println(time.format(d));										  //2017��12��28�� ����04ʱ22��04��
		
		time = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);//MEDIUM���
		System.out.println(time.format(d));	                                        //2017-12-28 16:24:09
		
		time = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);//FULL���
		str = time.format(d);
		System.out.println(str);	  									//2017��12��28�� ������ ����04ʱ26��04�� CST
		
		//����  String����ʱ��---->Date����ʱ��   Date parse(String source)  
		System.out.println("========================================");
		Date d2 = time.parse(str);  //FULL���   ���� ͬһ�����ܽ���
		System.out.println(d2);
		
	}
}