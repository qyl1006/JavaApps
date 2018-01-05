package day14;
/*
 * 需求:---> 演示包装类的使用 及 包装类-基本数据类型-String的相互转换
 * */
public class IntegerDemo {
	public static void main(String[] args) {
		//获取包装类的常量
		System.out.println("最大值:" + Integer.MAX_VALUE);
		System.out.println("最大值:" + Integer.MIN_VALUE);
		
		//基本类型和 包装类型的转换
		//装箱
		Integer i = Integer.valueOf(110);
		//拆箱
		int a = i.intValue();
		
		//String 和基本类型 / 包装类型之间的转换操作
		//把String转换为包装类类型
		Integer i2 = new Integer("520");
		Integer i3 = Integer.valueOf("520");
		//把包装类对象 转换String
		String s = i2.toString();
		
		//把基本数据类型转换为String
		String s2 = 23 + "";
		
		//把String转换为基本数据类型
		int b = Integer.parseInt(s2);
		
		
	}
}
