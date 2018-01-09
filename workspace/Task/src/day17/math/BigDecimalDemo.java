package day17.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * ��ʾBigDecimal��Ĵ�����ʹ��
 * �ܽ�:1) ʹ�ù���������BigDecimal����ʱ,Ϊ�˱�֤����Ĳ���׼ȷ��,Ӧ�ô����ַ������͵�����
 * 		2) ���ó��������ʱ��,Ӧ��ע�������Ƿ���ľ���,��������ѡ�����
 * 		3)BigInteger��ʾ������,һ�㲻ʹ��, �ò���..������BigDecimal��ͬ
 */

public class BigDecimalDemo {
	public static void main(String[] args) {
		//��������
		BigDecimal b1 = new BigDecimal("10");
		BigDecimal b2 = new BigDecimal("3");
		
		//1) �ӷ�
		System.out.println(b1.add(b2));
		
		//2) ����
		System.out.println(b1.subtract(b2));
		
		//3) ����
		System.out.println(b1.divide(b2,BigDecimal.ROUND_HALF_UP));
		System.out.println(b1.divide(b2, 5, RoundingMode.HALF_UP));  //���������  ����
		
		//4) �˷�
		System.out.println(b1.multiply(b2));
	}
}