///  字段不存在多态特征					

class Animal
{
	public String name = "动物类";

	public void print()
	{
		System.out.println("打印动物类");
	}

}

class Dog extends Animal
{
	public String name = "狗类"; 

	public void print()
	{
		System.out.println("打印狗类");
	}
}


//演示测试类
public class FieldDemo
{
	public static void main(String[] args)
	{
		Animal a = new Dog();
//		Dog d = new Dog();
		a.print();

		System.out.println(a.name); //结果显示"动物类" 为什么? 通过对象调用字段,在编译时期就已经决定了调用那一块内存空间的数据.
										//--------->字段不存在覆盖的概念,在多态时,不能有多态特征(在运行时期体现子类特征).

										//只有方法才有覆盖的概念.

	}
}