package com._520it._03_math;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args){
		
		//double
		System.out.println("0.09 + 0.01=" + (0.09 + 0.01));
		System.out.println("1.0 - 0.33=" + (1.0 - 0.3));
		System.out.println("4.015 * 1000=" + (4.015 * 1000));
		System.out.println("12.3 / 100=" + (12.3 / 100));
		
		BigDecimal num1 = new BigDecimal("12.0");
		BigDecimal num2 = new BigDecimal("4");
		
		BigDecimal num3 = num1.add(num2); //不能直接调用 需要对象调用
		System.out.println(num3);
		System.out.println(num1.divide(num2));
		
		System.out.println(Long.MAX_VALUE);
	}
}
