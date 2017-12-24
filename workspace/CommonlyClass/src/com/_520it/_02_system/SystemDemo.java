package com._520it._02_system;

import java.util.Arrays;

public class SystemDemo {
	
	//gc��������������ʱ,���õķ���
	protected void finalize() throws  Throwable{
		super.finalize();
		System.out.println("�ұ�������.......");
	}
	
	public static void main(String[] args){
			
		//��������
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] newArr = new int[10];
		
		//��ӡ����ǰ����
		System.out.println(Arrays.toString(newArr));
		
		//���ƿ�ʼʱ��
		long time1 = System.currentTimeMillis();
		//��arr���鸴�Ƶ�����newArr
		System.arraycopy(arr, 5, newArr, 3, 5);
		
		//forѭ���ӳ�ʱ������ʾ����
		for (int i = 0;i <100; i ++)
		{
			System.out.println(i);
		}
		//���ƽ���ʱ��
		long time2 = System.currentTimeMillis();
		
		//��ӡ���ƺ�����
		System.out.println(Arrays.toString(newArr));
		System.out.println("��ʼ:" + time1);
		System.out.println("����:" + time2);
		
		//System.exit(0); //��ֹ��ǰ�������е�Java�����
		
		//��������������  gc
		new SystemDemo(); // �ұ�������.......
		new SystemDemo();
		new SystemDemo();
		new SystemDemo();
		System.gc();
		
		
		System.out.println("exit()��������");
	}
}
