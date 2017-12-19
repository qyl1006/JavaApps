/*
	枚举类的引入和模拟:
-------------------------------------------------------------------------------------------------
需求:定义一个Employee(员工),使用一个变量restday来表示他哪一天休息(一周的哪一天).

*/
enum AAA
{
	A, B, C, D, E, F, G;
}
public class TestDemo
{
	public static void main(String[] args)
	{
		System.out.println(AAA.B);
		System.out.println(AAA.B.name());
		System.out.println(AAA.G.ordinal());

		switch(AAA.D)
		{
			case A : break;
			case B : break;
			case C : break;
			case D : break;

		}
	}
}