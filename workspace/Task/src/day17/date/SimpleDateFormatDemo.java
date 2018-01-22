package day17.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  ��ʾ SimpleDateFormat��
 * �ܽ�: SimpleDateFormat����DateFormat����, ͬʱ DateFormat��Date������
 * --->��ôSimpleDateFormat�����Ե������������ķ���,��ͬ�Ļ������ӵĳ��õķ������� 
 * 		-->֧���Զ����ʽģʽ
 * 
 * 	��Ҫע��ĵط���---> ��������ʱ--->ʹ��ʲô����ʽ����, ����ʹ����ͬ��������ȥ  ���߱���
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		//�Զ������ڵ�ģʽ
		String time = "yyyy-MM-dd HH:mm:ss E";
		//����SimpleDateFormat����
		SimpleDateFormat s = new SimpleDateFormat(); // PS ��ʵ�����ڴ��������ʱ��ֱ�Ӱ�time�����
		s.applyPattern(time);    // ���������Զ���ģʽ
		System.out.println(s.format(new Date()));  // ���ڸ�ʽ��
		String time1 = s.format(new Date());
		
		SimpleDateFormat s2 = new SimpleDateFormat();
		System.out.println("Ĭ�Ϸ��: " + s2.format(new Date()));
		
		
		System.out.println("��ͬ������: " + s.parse(time1));
		System.out.println("����ͬ������: " + s2.parse(time1)); //����: Unparseable date
	}
}