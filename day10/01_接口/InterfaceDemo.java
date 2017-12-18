//演示接口的构造成分  

//定义一个接口  接口语法: [public](修饰符) interface 接口名{}
interface Jumpable
{
	/*
	jumpable()
	{
	}
	说明: 接口中不能有构造器 会报错 也就是说不能new 不能创建对象 不能定义普通方法 构造器是一个特殊的方法
	*/
	//public static void test(){} //报错
	void test(); //编译通过--- 接口中定义的方法都是公共的抽象方法 默认使用public abstract

	//Integer a;// 会报错 为什么? 接口是个数据类型 类也是, 不同的 所以类中成员变量(指默认值)不使用接口中?
	Integer A = 10;//通过反编译: 默认使用public static final来修饰 成员变量 直接定义在类中的
					//         还有 底层还是先自动装箱 然后在赋值
	class Abc //接口中可以有内部类 默认公共静态的 public static修饰
	{
	}

	
}


//演示类
public class InterfaceDemo
{
	public static void main(String[] args)
	{
		System.out.println(21);
		//new Jumpable(); //报错: Jumpable是抽象的; 无法实例化 因为接口也没有构造器,所以new也不成

	}
}