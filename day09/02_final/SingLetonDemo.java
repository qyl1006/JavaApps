//单例设计模式 ------ 饿汉式.------自己先创建好一个对象,等着调用 --
/*
		写单例模式的步骤：单讲饿汉式.
      1):必须在该类中,自己先创建出一个对象.
      2):私有化自身的构造器,防止外界通过构造器创建新的对象.
      3):想外暴露一个公共的静态方法用于获取自身的对象
*/

//工具类
class Utils
{
	//创建一个对象
	private static final Utils u = new Utils();
	//私有化构造器
	private Utils()
	{
	}
	//全局静态的方法
	public static Utils getU()
	{
		return u;
	}

	public void print(int[] arr)
	{
		System.out.println("排序操作");
	}
}



//测试类
public class SingLetonDemo
{
	public static void main(String[] args)
	{
		/*
		Utils u = new Utils();
		u.print();
		System.out.println("---------");
		Utils.print();
		Utils.print();
		Utils.print();
		*/
		Utils.getU().print(null);
		
	}
}