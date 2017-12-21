/**
	需求: 输出各种图形的矩形图案
			如: *****       $
				*****		$$
				*****		$$$	
*/

//图案接口规范
interface Patternable
{
	void print();
}

//星号图案实现类
class Asterisk implements Patternable
{

	public void print()
	{
		System.out.println("星号*的矩形图案为:");
	}
}

//@图案实现类
class Aite implements Patternable
{
	public void print()
	{
		System.out.println("@的矩形图案为:");
	}
}

//美元$图案实现类
class Dollars implements Patternable
{
	public void print()
	{
		System.out.println("美元$的矩形图案为:");
	}
}

//长方体图形制造器
class Rectangles
{
	public static void enter(Patternable p, String s)
	{
		p.print();
		for (int i = 0;i < 3 ; i ++ )
		{
			for (int j = 0;j < 10 ;j ++ )
			{
				System.out.print(s);
			}
			System.out.print("\n");
		}
	}
}

//三角形图案制造器
class Triangle
{
	public static void enter(Patternable p, String s)
	{
		p.print();
		for (int i = 1;i < 6 ; i ++ )
		{
			for (int n = 1;n <= i ; n ++ )
			{
				System.out.print(s);
			}
			System.out.print("\n");
		}
	}
}

//测试类
public class RectangleDemo
{
	public static void main(String[] args)
	{
		//创建美元$符号对象
		Patternable p = new Dollars();
		Rectangles.enter(p, "$");

		Triangle.enter(p, "$");

		
		//创建美元$符号对象
		Patternable p2 = new Asterisk();
		Rectangles.enter(p2, "*");

		Triangle.enter(p, "*");


		//创建美元$符号对象
		Patternable p3 = new Aite();
		Rectangles.enter(p3, "@");

		Triangle.enter(p, "@");

		
	}
}