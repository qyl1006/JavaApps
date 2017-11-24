//赋值运算符 = += -+ *= /= %=
public class AssignmentOperatorDemo
{
	public static void main(String[] args) 
	{
		///它们的功能就是 给变量赋值
		String name = "Dive"; // = 赋值
		System.out.println(name);

	
		int a =10;
		a += 5; //等价于 a = a + 5;  
		System.out.println(a); //15


		short s = 30;  //声明short类型
		//s = s + 5; //会报错,,因为short类型 与 int类型(数字5)不同类型,需要int类型转short类型(变量s),,大转少--s = (short)(s + 5); 
		s += 5; //这个赋值方式有个特点: 自带隐形类型转换..
		System.out.println(s);

		//其它赋值符和 += 的意义差不多
	
	}
}