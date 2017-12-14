//final修饰符  final本身的含义是“最终的,不可改变的”，它可以修饰非抽象类，非抽象方法和变量。
//注意：构造方法不能使用final修饰，因为构造方法不能被继承，肯定是最终的。


//final class SupClass   //报错 FinalDemo.java:8: 错误: 无法从最终SupClass进行继承
class SupClass
{
	//final public void print(){}   //报错:FinalDemo.java:11: 错误: SubClass中的print()无法覆盖SupClass中的print()
	
	//final修饰引用类型变量
	public String name = "试试"; 
}

class SubClass extends SupClass
{
	public void print(){}

	public static void name()
	{
		System.out.println("123");
	}
}

//演示类
public class FinalDemo
{
	public static void main(String[] args)
	{

		//final常量
		final int NUM_DOG = 10;

//		NUM_DOG = 11;  //编译报错  FinalDemo.java:25: 错误: 无法为最终变量NUM_DOG分配值



		//创建SupClass对象,,对象是用 fanil 修饰的 测试 final修饰的引用类型变量不可变 是引用的地址 还是 内存空间的内容?
		final SupClass s = new SupClass();
		System.out.println(s.name);

		s.name = "改变引用内存空间的内容";
		System.out.println(s.name); //编译运行正常
		
		//新new一个对象 意味着创建一个新的引用的内存地址值
	//	s = new SupClass(); //编译报错: FinalDemo.java:39: 错误: 无法为最终变量s分配值

		SubClass.name();
	}
}