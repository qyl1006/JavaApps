//尝试佐证证明实例内部类的特性
//外部类
class Test
{
	String	name = "外部类成员Test.name";

	//内部类
	class Test2
	{
		String name = "内部类成员";
		public void print()
		{
			String name = "内部类方法内变量";
			
			System.out.println("内部类可以直接访问外部类成员 " + name);
			System.out.println(Test.this.name);
		}
	}

	public void print()
	{
		System.out.println("外部类方法 " + new Test2().name);
	}
}

//测试类
public class InteriorClassDemo2
{
	public static void main(String[] args)
	{
		//创建Test2对象
		Test t = new Test(); //Test对象
		t.print();
		System.out.println(t.name); //name通过Test类对象访问
		//类似的 实例内部类的对象 通过外部类对象来创建
		Test.Test2 t2 = t.new Test2();
		System.out.println(t2);
		t2.print();
	}
}