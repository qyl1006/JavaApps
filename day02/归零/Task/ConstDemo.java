//字面量  把直接给出的值的常量,叫做子面量  所谓常量就是程序中不变化的量 
//步骤: 直接传入常量并打印

//演示类
public class ConstDemo
{
	//主方法,入口
	public static void main(String[] args)
	{
		//打印常量 2 int类型 默认的
		System.out.println(2);

		//打印final修饰的不变量MAX
		System.out.println(new Test().max());
	}
}


//加深理解记忆
//final修饰
class Test
{
	private final int MAX = 110;

	public int max()
	{
		return MAX;
	}
}