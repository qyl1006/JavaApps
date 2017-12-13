//所谓隐藏就是“遮蔽”的意思。
// 动物类
class Animal
{
	public String name = "动物";
	public int age;
}

// 狗类
class Dog extends Animal
{
	public String name = "傻狗";
	public int age;

	//打印
	public void print()
	{
		System.out.println(name); // 傻狗
		System.out.println(super.name); // 动物 满足继承的访问权限下，隐藏父类字段：若子类中定义的字段和超类中的字段名相同(不管类型)，此时就是隐藏父类字段，此时只能通过super访问被隐藏的字段
	}

	public String toString()    //覆盖父类Object的toString()方法
	{
		return this.name + ", " + this.age + ".";

	}
}


//测试类
public class HideDemo
{
	public static void main(String[] args)
	{
		//创建Dog类的对象
		Dog d = new Dog();
		d.print();

		System.out.println(d);
		System.out.println(d.toString()); // 打印对象d其实和打印d.toString()一样的 ,,因为println()也是调用 toString()的
 
	}
}