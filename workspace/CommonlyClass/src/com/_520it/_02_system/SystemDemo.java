package com._520it._02_system;

import java.util.Arrays;

public class SystemDemo {
	
	//gc垃圾回收器运行时,调用的方法
	protected void finalize() throws  Throwable{
		super.finalize();
		System.out.println("我被回收了.......");
	}
	
	public static void main(String[] args){
			
		//定义数组
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] newArr = new int[10];
		
		//打印复制前数组
		System.out.println(Arrays.toString(newArr));
		
		//复制开始时间
		long time1 = System.currentTimeMillis();
		//从arr数组复制到数组newArr
		System.arraycopy(arr, 5, newArr, 3, 5);
		
		//for循环延长时间来显示差异
		for (int i = 0;i <100; i ++)
		{
			System.out.println(i);
		}
		//复制结束时间
		long time2 = System.currentTimeMillis();
		
		//打印复制后数组
		System.out.println(Arrays.toString(newArr));
		System.out.println("开始:" + time1);
		System.out.println("结束:" + time2);
		
		//System.exit(0); //终止当前正在运行的Java虚拟机
		
		//测试垃圾回收器  gc
		new SystemDemo(); // 我被回收了.......
		new SystemDemo();
		new SystemDemo();
		new SystemDemo();
		System.gc();
		
		
		System.out.println("exit()方法测试");
	}
}
