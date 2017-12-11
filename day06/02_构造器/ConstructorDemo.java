//构造器
class Constructors
{
	String name;

	//自定义构造器
	Constructors(String m)
	{
		System.out.println("12345");
		System.out.println(m);

		name = m; //把m的值赋值给name字段 // 1 可以给字段进行初始值 /2 可以设置字段值
	}
}

//测试自定义构造器
public class ConstructorDemo
{
	public static void main(String[] args)
	{
		//new Constructors();  //调用Constructors类中, 无参数的构造器 所以报错: 没有参数.. 
		new Constructors("xiaoming");  // 调用Constructors类中, 带有一个int类的参数的 
	}
}