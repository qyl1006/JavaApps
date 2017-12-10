// 佣人类型 /描述 / 佣人对象 / 包括佣人的状态和行为
/*
	面向对象
	类的定义:
---------------------------------------------------------------
[修饰符]  class   类名
{
       0~N个成员变量(字段/Field),不要叫属性(JavaBean中特殊的一种成员).
       0~N个方法
}
------------------------------
定义类的注意:
    1):如果类使用了public修饰符,必须保证当前文件名称和当前类名相同.
    2):类名使用名称表示,类表示某一类事物,首字母大写,如果是多个单词组成使用驼峰表示法.
          如: EmployeeAdvanceSetting.
    3):在面向对象的过程中,各位定义类的时候,专门为描述对象提供一个类,该类不需要main方法.
        我们专门再定义一个测试类/演示类来运行程序.

*/
class Maids
{
	//状态
	String name; //姓名
	int age;  //年龄

	//行为/功能
	void shoping()
	{
		System.out.println("买菜");
	}
	void cook()
	{
		System.out.println("做饭");
	}
	void wash()
	{
		System.out.println("洗碗");
	}

} 

class Coder
{
	void daima()
	{
		System.out.println("敲代码");
	}
}


//Maids类的测试
public class MaidsDemo
{
	public static void main(String[] args)
	{
		//创建出一个Maids类的对象
		Maids m = new Maids();

		/*
			1):根据类来创建对象的语法:
				 类名  变量  =  new  类名();
			2):给字段设置值:
				 对象变量.字段名 = 该类型的值;
			3):获取字段的值:
				 该字段类型  变量 = 对象变量.字段值;
			4):通过对象调用方法.
				 对象变量.方法(实参);

		*/

		//给字段设置值
		m.name = "xiaoling";  // 需要注意定义类中字段的数据类型,设置相对应的数据类型
		m.age = 18;

		//获取字段的值
		String i = m.name; // 获取字段值时  需注意接收的变量应该和字段值的数据类型一致
		System.out.println(i);
		System.out.println(m.name);

		int j = m.age;
		System.out.println(j);
		System.out.println(m.age);

		//通过对象调用方法
		m.shoping();
		m.cook();
		m.wash();

		Coder c = new Coder();
		c.daima();

	}
}