//需求: 判断一个点和圆的关系(在圆外,圆周上,圆内).
//创建一个 点 的坐标类
class Points
{
	private double x; // 点的x轴坐标
	private double y;  //点的y轴坐标

	//自定义构造器
	Points(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	//创建判断方法, 如果点在圆为 返回 1 点在圆上则返回0  点在圆内则返回 -1
	public int judge(double r)
	{
		double square = this.x * this.x + this.y * this.y;
		double i = Math.sqrt(square);
		if (i > r)
		{
			return 1;
		}else if (i < r)
		{
			return -1;
		}else
		{
			return 0;
		}
		
	}
}

//创建一个圆心坐标为(0 ,0),半径为r的圆的类
class Round
{
	private double r;

	//自定义构造器
	Round(double r)
	{
		this.r = r;
	}

	public double getR()
	{
		return r;
	}
}


//测试类
public class ExerciseDemo
{
	public static void main(String[] args)
	{
		//double i = 9.0;
		//double j = Math.sqrt(i);
		//System.out.println(j);

		//创建圆对象
		Round round = new Round(5);
		double r = round.getR(); // 需要通过setter来获取r的值

		//创建点对象
		Points p = new Points(3, 4);

		//调用方法判断
		int i = p.judge(r);
		System.out.println("返回值: " + i);

	}
}