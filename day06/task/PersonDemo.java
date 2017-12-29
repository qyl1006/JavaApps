/*
 需求: 演示调用无参和有参的构造器创建对象
*/

//定义一个类  用于构造器的测试
class Test
{
	Test()
	{
		System.out.println("无参数构造器");
	}

	Test(int i)
	{
		System.out.println("有参数构造器");
	}
}


//测试类
public class PersonDemo
{
	public static void main(String[] args)
	{
		//使用匿名对象来测试
		new Test();

		new Test(12306);
	}
}

//总结: )类中构造器问题--->类中默认有缺省构造器-----类似-->Abc(){}----->构造器可以自定义--->可定义多个-->重载
//				构造器的特点: 1方法名与类名相同  2不用定义返回值类型 3不需要写return语句
//			  默认构造器特点: 1无参数 2无方法体 3构造器修饰符与所在类的修饰符相同
//			      构造器作用: 1创建对象  2做初始化操作