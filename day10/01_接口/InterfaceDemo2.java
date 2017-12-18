//接口的使用

//爬行动物规范
interface Crawlable
{
	void print();
}

//水生动物规划
interface Swimmingable
{
	void print();
}

//定义接口类 
class Dog implements Crawlable, Swimmingable
{
	public void print()
	{
		System.out.println("走起");
	}
}

//测试类
public class InterfaceDemo2
{
	public static void main(String[] args)
	{
		System.out.println(11);

		Crawlable c = new Dog();
		c.print();
	}
}