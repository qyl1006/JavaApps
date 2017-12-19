//求圆(circle)、矩形(rectangle)、三角形(Triangle )的面积   之和引出抽象方法

//求面积类
abstract class Areas
{
	abstract public Double area();//使用abstract修饰的方法叫 抽象方法 没有方法体,留给子类去实现/覆盖
}

//圆
class Circle extends Areas
{
	private Integer r;

	//构造器
	Circle(Integer r)
	{
		this.r = r;
	}

	//面积方法
	public Double area()
	{
		return 3.14 * r *r;
		//return Math.PI * r * r;
	}
}

//矩形
class Rectangles extends Areas
{
	private Integer length; //长
	private Integer high; //高

	//构造器
	Rectangles(Integer length, Integer high)
	{
		this.length = length;
		this.high = high;
	}

	//面积方法
	public Double area()
	{
		return length.doubleValue() * high.doubleValue(); //反编译得到:Double.valueOf(length.doubleValue() * high.doubleValue());
	}
}

//三角形
class Triangle extends Areas
{
	private Integer a;
	private Integer b;
	private Integer c;

	//构造器
	Triangle(Integer a, Integer b, Integer c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	//面积
	public Double area()
	{
		Double p = (a + b + c) / 2.0; // ? 怎么移位??
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));  //其中Math.sqrt() 是求平方根的方法
	}
	
}

//演示测试类
public class AcreageDemo
{
	public static void main(String[] args)
	{
		//创建圆对象,调用方法,打印面积值
		System.out.println(new Circle(10).area());


		//长方体
		System.out.println(new Rectangles(4, 5).area());
		
		//三角形
		System.out.println(new Triangle(4, 6, 9).area());  //三角形的三边关系 a+b>c 且 a-b<c

		System.out.println("=================");

	}
}