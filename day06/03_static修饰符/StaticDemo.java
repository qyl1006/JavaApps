//定义人类的类
class Humanity
{
	String name; // 姓名
	int age;	 // 年龄

	static int totalPeople = 10; //总人数

	//自定义构造器
	Humanity(String n, int a)
	{
		name = n;
		age = a;
		totalPeople ++;
	}

	//死亡一个人的方法
	void died()
	{
		System.out.println("去世ing---------");
		totalPeople --;
	}

	//人类灭亡的方法
	static void perish()
	{
		System.out.println("人类灭亡....");
		totalPeople = 0;
	}

}

//演示static修饰符
public class StaticDemo
{
	public static void main(String[] args)
	{
		System.out.println(Humanity.totalPeople);

		Humanity i = new Humanity("小米", 18);

		System.out.println(Humanity.totalPeople);
		System.out.println(i.totalPeople); //根据该(Humanity类)类创建出来的任何对象,都可以访问static成员,,但其本质依然使用类名访问,和对象没有任何关系(通过反编译看到的)


		//调用died()
		i.died();
		System.out.println(Humanity.totalPeople);

		//
		Humanity.perish();
		System.out.println(Humanity.totalPeople);
	}
}