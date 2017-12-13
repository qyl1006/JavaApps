//方法的覆盖
// 鸟类 父类
class Bird
{
	//飞的功能 方法
	public void fei()
	{	
		System.out.println("自由的飞翔");
	}
}

//企鹅类  子类
class Penguin extends Bird
{
	public void fei()   //方法的覆盖
	{
		System.out.println("我不会飞,只会游泳..");
	}

	public void print()
	{
		System.out.println("打印");
		super.fei();      //关键字super  表示当前对象的父类对象 在这个方法中调用父类中被覆盖的方法fei()
	}
}

//测试演示类
public class OverrideDemo
{
	public static void main(String[] args)
	{
		Penguin b = new Penguin();
		b.fei();
		b.print();
	}


}

