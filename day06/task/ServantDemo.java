/*
	需求:   定义一个Servant 类中有 name 和 age 两个状态,还有 买菜、做饭、洗碗的这些方法
			ServantDemo 类创建 Servant 类的对象，设置状态并调用这些方法

*/

//定义一个Servant类,它具有 买菜 做饭 洗碗 的功能
class Servant
{
	String name; //姓名 初始值为null
	int    age; //年龄  初始值为0

	//定义"买菜"功能的方法
	void shoping()
	{
		System.out.println("买菜买肉..........");
	}

	//定义"做饭"功能的方法
	void cook()
	{
		System.out.println("做饭炒菜......");
	}

	//定义"洗碗"功能的方法
	void wash()
	{
		System.out.println("洗碗筷.....");
	}

}


//测试类
public class ServantDemo
{
	public static void main(String[] args)
	{
		//创建Servant类对象xiaoli
		Servant xiaoli = new Servant();
		//System.out.println(xiaoli);  //哈希码:Servant@15db9742
		xiaoli.name = "小丽";
		xiaoli.age = 20;

		//调用小丽依次完成 买菜-->做饭--->洗碗的功能
		xiaoli.shoping();
		xiaoli.cook();
		xiaoli.wash();
	}
}


/*
	总结: 1)定义一个具有相同特征(字段) 行为(方法)的类, 然后通过创建该类的对象来调用类中方法实现一些功能,并且不同对象
			(使用者)都可以重复调用,不需要重复写代码.
		  
		  2)定义类需要注意: 类名首字母大写,驼峰表示法; 若类使用public修饰那么该文件名必须与类名相同,否则报错


*/