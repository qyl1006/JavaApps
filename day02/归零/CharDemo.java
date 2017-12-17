public class CharDemo
{
	public static void main(String[] args)
	{
		//char类型
		char c = 97;
		System.out.println(c);
		
		char c3 = '\u0061';
		char c2 = 0x0061;
		char c4 = 'a';
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("================");

		//float double 类型
		//float f = 3.14; //报错CharDemo.java:17: 错误: 可能损失精度  小数类型默认double 类型 从高转低 可能数据会溢出
		float f = 3.14F;  //float类型常量后面加F
		System.out.println(f);

		double d = 3.14;  //小数默认 double类型 后面无需加D
		System.out.println(d);
	}
}