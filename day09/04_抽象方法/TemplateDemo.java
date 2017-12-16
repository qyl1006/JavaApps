//模板设计方法

//需求: 统计String连接10000此时和 int相加10000次的时间差   通过这两个需求  引出模板设计模式

//创建time类
class TimeDemo
{
	//String连接10000次
	public long connect()
	{
	
		long time1 = System.currentTimeMillis();
		String i = " ";


		for (int j = 0; j <= 10000; j++)
		{
			i += j;
		}

		long time2 = System.currentTimeMillis();
		long time3 = time2 - time1;
		return time3;
	}

class Times2Demo
{

	//int相加10000次
	public long adds()
	{
		
		long time1 = System.currentTimeMillis();
		int i = 1;


		for (int j = 0; j <= 10000000; j++)
		{
			i += j;
		}

		long time2 = System.currentTimeMillis();
		long time3 = time2 - time1;
		return time3;
	}

}

//演示测试类
public class TemplateDemo
{
	public static void main(String[] args)
	{
		TimeDemo t = new TimeDemo();

		//String相连时间统计
		System.out.println(t.connect());

		//int相加时间统计
		System.out.println(new Time2Demo().adds());
	}
}