//�����++��--
public class ArithmeticOeratorsDemo2
{
	public static void main(String[] args)
	{
		/*
		     ǰ�����....��ʾ�������(a)�ȼ�1���1,�ٽ�������..
			 �������....��ʾ�������(a)�ȼ�1���1,��֮ǰ��ԭʼֵ��ȥ������
		*/
		int a1 = 5;
		int b1 = ++a1;
		//int b3 = --a1;
		System.out.println("++ǰ��:" + "a1=" + a1 + ",b1=" + b1);
		//System.out.println("--ǰ��:" + "a1=" + a1 + ",b3=" + b3);

		int a2 = 5;
		//int b2 = a2++;
		int b4 = a2--;
		//System.out.println("++����:" + "a2=" + a2 + ",b2=" + b2);
		System.out.println("--����:" + "a2=" + a2 + ",b4=" + b4);


		///�������...����
		System.out.println("=============================");
		int num1 = 1;
		num1 ++; //ԭʼֵΪ1; ����num1=2..
		System.out.println(num1);
        int num3 = num1++; //ԭʼֵΪ2,,,��num1=3..������num3����ȡԭʼֵ��!!!!��Ҫע��ĵط�
		System.out.println(num3);

		int num2 = 1;
		num2 = ++num2;
		System.out.println(num2);

		System.out.println("======������ϰ��===========");
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