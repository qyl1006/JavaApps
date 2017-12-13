//子类的初始化过程

//动物类 父类
class Animal
{
	private String name;
	private int age;

	//构造器
	Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("01 Animal构造器 " + "先调用父类构造器");
	}

	//获取
	public String getName()
	{
		return name;
	}

}

//狗类 子类
class Dog extends Animal   // 继承父类Animal
{
	private String colour; //颜色
	
	//构造器
	Dog(String name, int age, String colour)
	{
		super(name, age);  //调用有参数的父类构造器  调用父类构造这句话,必须作为子类构造器的第一句话  和this一样
		System.out.println("02 Dog构造器 " + "证明创建子类对象先调用父类构造器 ");
		this.colour = colour;
	}

	public void print()
	{
		//System.out.println(colour);
		System.out.println(colour + "的" + getName());
	}
}

//测试演示类
public class SubclassDemo
{
	public static void main(String[] args)
	{
		//创建子类Dog对象
		Dog d = new Dog("傻狗", 10 ,"绿色");
		d.print();

	}
}