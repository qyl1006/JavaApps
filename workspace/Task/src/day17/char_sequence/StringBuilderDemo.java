package day17.char_sequence;
/*
 * 演示: StringBuilder类的常用方法
 * 总结: StringBuilder首先它是不可变化的,增查改删都不会新new对象,操作的都是创建它-->父类对象指向的char数组空间
 * 		StringBuilder没有使用synchronized修饰,没有同步方法,所以在多线程同时操作(如追加)时,数据会可能不安全	
 */

public class StringBuilderDemo {
	public static void main(String[] args) {
		//创建对象
		StringBuilder sb = new StringBuilder();// 调用它父类AbstractStringBuilder的构造器,数据也存储在父类字段value数组中
		System.out.println(sb.capacity()); //16 默认
		
		//追加 操作 -->常见的数据都是通过父类的方法来完成-->先转换成字符串-->中间会判断是否扩容-->str.getChars()完成<---最后还是调用数组的复制方法
		sb.append(123);
		System.out.println(sb);
		
		//charAt(int index) 返回指定索引的char
		System.out.println(sb.charAt(2)); //3
		
		//删除
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		//
		System.out.println(sb.length());
	}
}
