//this 关键字
//需求: 定义一个User类,提供name,age字段,以及相应getter/setter方法.
class User
{
	//字段使用private修饰 表达隐藏, 为了数据安全性
	private String name;
	private int age;

	//构造器
	User()
	{
		System.out.println(this);
	}

	//创建getter/setter方法
	//获取字段值
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	//设置字段值
	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	//打印当前对象的name与age的值
	public void print()
	{
		System.out.println(this.name + " , " + this.age);
	}

	//打印hello
	public void hello()
	{
		System.out.println("你好! " + this.name);
		this.print();
	}


}

//测试类
public class ThisDemo
{
	public static void main(String[] args)
	{
		User u = new User();
		System.out.println(u);
		//设置name和age
		u.setName("小明");
		u.setAge(17);

		//获取字段值
		//String m = u.getName();
		System.out.println(u.getName());

		//int i = u.getAge();
		System.out.println(u.getAge());

		u.print();

		User u2 = new User();
		u2.setName("嗷嗷");
		u2.setAge(18);
		u2.print();

		u2.hello();

	}
}