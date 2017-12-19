//有意思的接口 多态
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

//键盘功能
class Keyboard implements MUSB
{
	public void features()
	{
		System.out.println("啪啪啪信息输入");
	}
}

//主板
class Motherboard
{
	static MUSB[] arr = new MUSB[6];
	static int index = 0;
	//调用功能
	public static void transfer(MUSB m)
	{
		if (index > arr.length - 1)
		{
			System.out.println("...插满了.......");
			return;
		}
		arr[index] = m;
		index ++;
	}

	//一起调用
	public static void print()
	{
		for(MUSB i : arr)
		{
			if (i != null)
			{
				i.features();
			}
			
		}
	}
}



//测试类
public class USBDemo
{
	public static void main(String[] args)
	{
		/*
		//调用鼠标
		Mouse m = new Mouse();
		Motherboard.transfer(m);

		//调用键盘
		Keyboard k = new Keyboard();
		//Motherboard.transfer(k);//报错 因为Motherboard类没有调用键盘的方法 如果有n个设备需要和主板交换数据,那么不就是要定义n个方法了吗? 解决思路,统一一个规范 接口
		*/
		//调用鼠标
		Mouse m = new Mouse();
		Motherboard.transfer(m);

		//键盘
		Keyboard k = new Keyboard();
		Motherboard.transfer(k);
		Motherboard.transfer(k);
		Motherboard.transfer(k);
		Motherboard.transfer(k);
		
//		创建一个匿名局部内部类
		Motherboard.transfer(new MUSB()
			{
				public void features()
				{
					System.out.println("papappapa");
				}
			}
			
		);
		Motherboard.print();
	}
}
