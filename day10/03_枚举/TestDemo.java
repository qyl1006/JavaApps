/*
	ö����������ģ��:
-------------------------------------------------------------------------------------------------
����:����һ��Employee(Ա��),ʹ��һ������restday����ʾ����һ����Ϣ(һ�ܵ���һ��).

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