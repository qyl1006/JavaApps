package day15;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/*
 * ����:  ��ʾö�ٵĶ��� �� ����
 * �ܽ�: -->ö����Ҫ������ʾ����̶�������.
 * 	�ص�: 1)ö�ٵ�ֱ�Ӹ���java.lang.Enum�����ǲ�����ʾ�̳�Enum��
		  2)ö�پ��൱��һ���࣬���Զ��幹�췽������Ա��������ͨ�����ͳ��󷽷���
		  3)Ĭ��˽�е��췽������ʹ��д����Ȩ��Ҳ��private((�ٹ�����,�ײ�û���޲���������)��
		  4)ÿ��ʵ���ֱ���һ��ȫ�ֳ�����ʾ��ö����Ķ����ǹ̶��ģ�ʵ���������ޣ�����ʹ��new�ؼ��֡�
		  5)ö��ʵ������λ��ö�����е��ʼ���֣�ö��ʵ���б��ĺ�Ҫ�зֺ���������Ա��ָ���

	ʹ��:1) ö���ж���ȫ�ֹ����ľ�̬����,����ʹ��ö������������
		 2) ��Ϊjava.lang.Enum��������ö����ĸ���,�������е�ö�ٶ��󶼿��Ե���Enum��ķ���
		 3) ���������ɵ�ö����ľ�̬����(�ӷ����������):
			         ö������[]  values();
			          Weekday[] ws   = Weekday.values();:���ص�ǰö���������еĳ���,ʹ��һ�������װ����.
			         ö������  valueof(String name);
          		Weekday  day = Weekday.valueOf("MONDAY");//��һ��ָ�������ַ���ת��Ϊ��ǰö������ͬ���ĳ���.
          4)��java5��ʼ����ö��,switchҲ֧�ֲ���ö������

 */

public class EnumDemo {

	public static void main(String[] args) {
		//����
		System.out.println(Test.ABC);
		
		//ö�ٶ���ĳ�������
		System.out.println(Test.ICBC.name());
		System.out.println(Test.ICBC.toString());
		
		//ö�ٶ�������
		System.out.println(Test.ICBC.ordinal());
		
		//��ǰö���������еĳ���-->���ص���һ������
		Test[] arr = Test.values();
		System.out.println(arr);// [Lday15.Test;@4aa168c ��ϣ��
		for(Test t : arr){
			System.out.println(t);
		}
		
		System.out.println("==============================");
		//��һ��ָ�������ַ���ת��Ϊ��ǰö������ͬ���ĳ���
		Test t = Test.valueOf("ICBC");
		
		//֧��switch  ��ʵ�ײ㻹��ת����int
		switch(Test.ICBC){
			case ABC : ;break;
			case BBC :;break;
			case ICBC : System.out.println("����ö���Ƿ�֧��switch");
		}
		
	}
}

//����ö��
enum Test{
	ABC, BBC, ICBC;
}

//ö�ٵ���
enum Demo{
	AAA;
	private void sysout() {
		System.out.println("�������ڹ�����---->�����Ǿ��巽������");
	}
}