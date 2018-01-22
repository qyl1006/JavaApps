package day17.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/*
 * 	��ʽ������
 * �ܽ�: DateFormat�ೣ��Ҳ�������ڵĸ�ʽ�� �� ���� ����������
 * 
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println("δ��ʽ��ǰ��: " + d);
		
		//����DateFormat����
		DateFormat dd = DateFormat.getDateInstance(); //Ĭ�Ϸ��
		String str = dd.format(d);
		System.out.println("���ڸ�ʽ����(Ĭ�Ϸ��)" + str);
		
		//�������
		DateFormat dd2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
		System.out.println(dd.format(d));
		
		//����
		dd = DateFormat.getDateInstance();
		String time = dd.format(d);
		System.out.println("����ǰ:" + time);
		System.out.println("������: " + dd.parse(time));
		
	}
}