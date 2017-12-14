//演示包装类   装箱和拆箱操作
public class IntegerDemo
{
	public static void main(String[] args)
	{
		//装箱
		// 第一种方式
		Integer i1 = new Integer(18);
		System.out.println(i1);
		//第二种方法 调用Integer类的方法valueOf()
		Integer i2 = Integer.valueOf(18);
		System.out.println(i2);

		//拆箱操作 也是调用Integer类中的方法
		int num = i1.intValue();
		System.out.println(num);
		System.out.println("================");

		//自动装箱 拆箱  注意: 在底层依然是手动装箱Integer.valueOf和拆箱操作 对象.intValue() 
		Integer i3 = 20;
		System.out.println(i3);
		//自动拆箱		注意:在底层依然是手动装箱和拆箱操作
		int num2 = i3;
		System.out.println(num2);




	}
}