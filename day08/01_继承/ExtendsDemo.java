/*
	什么是继承关系:
	基于某个父类对对象的定义加以拓展，而产生新的子类定义，子类可以继承父类原来的某些定义，也可以增加原来父类所没有的定义，或者覆写父类中的某些特性。

	语法格式: 在定义子类的时候来表明自己需要拓展于哪一个父类.
			public  class  子类类名    extends    父类类名


*/

//创建一个父类people
class people
{
	private String name;
	protected int age;
}

//老师类
class Teacher extends people
{
	void teaching()
	{
	}
}

//学生类
class Student extends people
{
	void task()
	{
	}
}



//测试类
public class ExtendsDemo
{
	public static void main(String[] args)
	{

		Student s = new Student();
		System.out.println(s.age);
	}
}