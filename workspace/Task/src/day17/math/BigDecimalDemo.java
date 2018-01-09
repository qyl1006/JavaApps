package day17.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * 演示BigDecimal类的创建及使用
 * 总结:1) 使用构造器创建BigDecimal对象时,为了保证传入的参数准确性,应该传入字符串类型的数据
 * 		2) 调用除法运算的时候,应该注意数据是否除的尽来,根据需求选择参数
 * 		3)BigInteger表示大整型,一般不使用, 用不着..方法和BigDecimal相同
 */

public class BigDecimalDemo {
	public static void main(String[] args) {
		//创建对象
		BigDecimal b1 = new BigDecimal("10");
		BigDecimal b2 = new BigDecimal("3");
		
		//1) 加法
		System.out.println(b1.add(b2));
		
		//2) 减法
		System.out.println(b1.subtract(b2));
		
		//3) 除法
		System.out.println(b1.divide(b2,BigDecimal.ROUND_HALF_UP));
		System.out.println(b1.divide(b2, 5, RoundingMode.HALF_UP));  //还是这个叼  厉害
		
		//4) 乘法
		System.out.println(b1.multiply(b2));
	}
}
