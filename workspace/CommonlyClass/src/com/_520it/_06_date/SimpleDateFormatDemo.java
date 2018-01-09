package com._520it._06_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		String pattern = "yyy-MM-dd EE a HH:mm:ss"; //�Զ�������ʱ����
		SimpleDateFormat time = new SimpleDateFormat(); //Ĭ��SHORT��� ���Զ���
		time.applyPattern(pattern); //������  Ҳ����ֱ���Ӹ�����������ȥ
		
		String str = time.format(new Date());//��ʽ��
		System.out.println(str);
		
		//���� ע��ʹ��ʲô����ʽ����,����ʹ����ͬ��������ȥ
		Date d = time.parse(str);
		System.out.println(d);
		
		//����  ��ʱ��str�ַ������Զ�����  ���ڴ���һ��Ĭ�Ϸ���SimpleDateFormat����,����ʹ��������str,Ӧ�ûᱨ��!
		SimpleDateFormat time2 = new SimpleDateFormat();//Ĭ�Ϸ��
		Date d2 = time2.parse(str);		////���б���:�쳣 
		System.out.println("���Բ�ͬ���ֱ�ӽ���:" + d2); 
	}

}