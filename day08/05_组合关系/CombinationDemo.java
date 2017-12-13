//组合关系
// 为了演示组合关系代码 使用动物类和狗类,,其实它们应该使用继续关系更加合适,,,,,从A类是B类的一种特殊情况,用继承实现  否则使用组合实现

//动物类
class Animal
{
	public void sleep()
	{
		System.out.println("先玩一玩...");
		System.out.println("找个窝....");
		System.out.println("睡觉做梦........");
	}
}

//狗类
class Dog
{
	private Animal a = new Animal();
	public void print()
	{
		a.sleep();
	}

}

//测试类
public class CombinationDemo
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.print();  //ok
	}
}