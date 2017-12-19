//规划一个USB接口
interface MUSB
{
	void features();
}

//鼠标的功能
class Mouse implements MUSB
{
	public void features()
	{
		System.out.println("鼠标在移动.....");
	}
}

//鼠标的功能
class Mouse2 implements MUSB
{
	public void features(Mouse2 m) //报错 无法覆盖抽象方法 ----... 方法的形参不同
	{
		System.out.println("鼠标在移动.222....");
	}
}

//鼠标的功能
class Mouse33 implements MUSB
{
	public void features(Mouse33 m)
	{
		System.out.println("鼠标在移动33333.....");
	}
}


//测试类
public class USBDemo2
{
	public static void main()
	{
	}
}