package day17.date;

import java.util.Date;

/*
 * ����:  ��ϰ������Date�ķ���
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		
		System.out.println(new Date());
		System.out.println(new Date().toLocaleString());
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(new Date().getTime()); //����
	}
}