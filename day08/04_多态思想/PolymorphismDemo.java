//理解多态思想及它的好处特点
//创建动物类 父类
class Animal
{
	private String naem;
	private int     age;

	public void eat()
	{
		System.out.println("----喂食动物-----");
	}
}

//创建狗类 子类
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("-----喂狗粮---");
	}

	//看门
	public void guard()
	{
		System.out.println("---看门----");
	}
	
}

//创建猫类
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("------喂猫粮-------");
	}

	//抓老鼠
	public void mouse()
	{
		System.out.println("-------抓老鼠-------");
	}
}

//创建喂养员
class People
{
	//喂养方法
	public void feed(Animal a)   // 多态在运行时期会表现出具体的子类特征(调用子类的方法). 例如 a.eat()中的a

	{
		System.out.println("-----喂养中------");
		a.eat();
		////引入运算符 instanceof 进行判断  instanceof  运算符: 判断该对象是否是某一个类的实例.
		//语法格式：boolean b = 对象A   instanceof  类B;  // 判断 A对象是否是 B类的实例,如果是,返回true.
		if (a instanceof Dog)     
		{
			Dog d = (Dog)a;     //引用类型数据强制转换(和基本数据类型转换语法格式一样)
			d.guard();
		}else if (a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.mouse();
		}
	}
}




//演示测试类
public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Animal a = new Dog();  //当代码变成以下的样子的时候,多态就产生了
		Animal b = new Cat();   ///所谓多态: 对象具有多种形态,对象可以存在不同的形式. Animal 与 Dog 或 Cat形态


		Cat c = new Cat();
		People p = new People();

		p.feed(c);

		Dog d = new Dog();
		p.feed(d);
	}
}