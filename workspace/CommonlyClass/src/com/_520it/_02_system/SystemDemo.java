package com._520it._02_system;

import java.util.Arrays;

public class SystemDemo {
	public static void main(String[] args){
		//调用System.arraycopy()方法进行数组复制操作
		
		//定义数组
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] newArr = new int[10];
		System.out.println(Arrays.toString(newArr));
		
		//从arr数组复制到数组newArr
		System.arraycopy(arr, 5, newArr, 3, 5);
		//打印
		System.out.println(Arrays.toString(newArr));
	}
}
