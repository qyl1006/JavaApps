package day15;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/*
 * 需求:  演示枚举的定义 和 操作
 * 总结: -->枚举主要用来表示事物固定的类型.
 * 	特点: 1)枚举的直接父类java.lang.Enum，但是不能显示继承Enum。
		  2)枚举就相当于一个类，可以定义构造方法、成员变量、普通方法和抽象方法。
		  3)默认私有的造方法，即使不写访问权限也是private((假构造器,底层没有无参数构造器)。
		  4)每个实例分别用一个全局常量表示，枚举类的对象是固定的，实例个数有限，不能使用new关键字。
		  5)枚举实例必须位于枚举体中的最开始部分，枚举实例列表的后要有分号与其他成员相分隔。

	使用:1) 枚举中都是全局公共的静态常量,可以使用枚举类类名调用
		 2) 因为java.lang.Enum类是所有枚举类的父类,所以所有的枚举对象都可以调用Enum类的方法
		 3) 编译器生成的枚举类的静态方法(从反编译代码中):
			         枚举类型[]  values();
			          Weekday[] ws   = Weekday.values();:返回当前枚举类型所有的常量,使用一个数组封装起来.
			         枚举类型  valueof(String name);
          		Weekday  day = Weekday.valueOf("MONDAY");//把一个指定名称字符串转换为当前枚举类中同名的常量.
          4)从java5开始出现枚举,switch也支持操作枚举类型

 */

public class EnumDemo {

	public static void main(String[] args) {
		//调用
		System.out.println(Test.ABC);
		
		//枚举对象的常量名称
		System.out.println(Test.ICBC.name());
		System.out.println(Test.ICBC.toString());
		
		//枚举对象的序号
		System.out.println(Test.ICBC.ordinal());
		
		//当前枚举类型所有的常量-->返回的是一个数组
		Test[] arr = Test.values();
		System.out.println(arr);// [Lday15.Test;@4aa168c 哈希码
		for(Test t : arr){
			System.out.println(t);
		}
		
		System.out.println("==============================");
		//把一个指定名称字符串转换为当前枚举类中同名的常量
		Test t = Test.valueOf("ICBC");
		
		//支持switch  其实底层还是转换成int
		switch(Test.ICBC){
			case ABC : ;break;
			case BBC :;break;
			case ICBC : System.out.println("测试枚举是否支持switch");
		}
		
	}
}

//定义枚举
enum Test{
	ABC, BBC, ICBC;
}

//枚举单例
enum Demo{
	AAA;
	private void sysout() {
		System.out.println("单例用于工具类---->这里是具体方法代码");
	}
}