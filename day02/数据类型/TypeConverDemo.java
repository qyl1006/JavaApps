//数据类型转换
public class TypeConverDemo
{
	public static void main(String[] args)
	{
		//从小的数据范围转大的数据范围,自动转换
		//转换规则其实就是各自数据类型的空间的大小.字节大小
		byte b1 =5;
		short s1 = b1;//小转大
		int i1 = s1;
		long l1 = i1;

		float f1 = l1;
		double d1 = f1;

		System.out.println(d1);

		//------------
		///强制转换,,大的转小的
		 
		 int i2 = 22250;
		 byte b2 = (byte)i2;
		 System.out.println(b2);
		 byte b3 = (byte)222222;

		 ///表达式类型的自我提升,,,整个表达式的最终结果类型被提升到表达式类型最高的类型
		 float f2 = 123 + 1.1F + 99L + 3.14; ///报错:可能损失精度  


		 double d2 = 123 + 1.1F + 99L + 3.14;

		 //String和任意数据类型使用 + 连接起来的结果都是String
		 String d3 = 123 + 1.1F + 99L + 3.14 + "";
	}
}