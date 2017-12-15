//求圆(circle)、矩形(rectangle)、三角形(Triangle )的面积   之和引出抽象方法

//圆
class Circle
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
class Rectangles
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
class Triangle
{
	private Integer AA;
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


	}
}