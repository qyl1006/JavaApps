//运算符++与--
public class ArithmeticOeratorsDemo2
{
	public static void main(String[] args)
	{
		/*
		     前置情况....表示自身变量(a)先加1或减1,再进行运算..
			 后置情况....表示自身变量(a)先加1或减1,把之前的原始值拿去做运算
		*/
		int a1 = 5;
		int b1 = ++a1;
		//int b3 = --a1;
		System.out.println("++前置:" + "a1=" + a1 + ",b1=" + b1);
		//System.out.println("--前置:" + "a1=" + a1 + ",b3=" + b3);

		int a2 = 5;
		//int b2 = a2++;
		int b4 = a2--;
		//System.out.println("++后置:" + "a2=" + a2 + ",b2=" + b2);
		System.out.println("--后置:" + "a2=" + a2 + ",b4=" + b4);


		///其他情况...试试
		System.out.println("=============================");
		int num1 = 1;
		num1 ++; //原始值为1; 但现num1=2..
		System.out.println(num1);
        int num3 = num1++; //原始值为2,,,现num1=3..问题是num3它是取原始值的!!!!需要注意的地方
		System.out.println(num3);

		int num2 = 1;
		num2 = ++num2;
		System.out.println(num2);

		System.out.println("======测试练习下===========");
		int i = 5;
		i--;                         //i=6
		System.out.println("i=" + i); //5     4
		--i;                          
		System.out.println("i=" + i);//7      3
		System.out.println("-------------");
		int a = --i;         
		System.out.println("a=" + a); //8     2
		System.out.println("i=" + i);    //8   2
		int b = i--;
		System.out.println("b=" + b);//8  2
		System.out.println("i=" + i);//9  1

		
	}
}