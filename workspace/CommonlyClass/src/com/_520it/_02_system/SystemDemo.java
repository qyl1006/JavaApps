package com._520it._02_system;

import java.util.Arrays;

public class SystemDemo {
	public static void main(String[] args){
		//����System.arraycopy()�����������鸴�Ʋ���
		
		//��������
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] newArr = new int[10];
		System.out.println(Arrays.toString(newArr));
		
		//��arr���鸴�Ƶ�����newArr
		System.arraycopy(arr, 5, newArr, 3, 5);
		//��ӡ
		System.out.println(Arrays.toString(newArr));
	}
}
