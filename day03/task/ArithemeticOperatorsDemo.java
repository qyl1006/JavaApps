//���������
/*
	1) �Ӻţ��ڲ�����ֵ���ַ����ַ���ʱ�����ǲ�ͬ�ģ��������ַ���ӵõ�����ASCII���ֵ��
    2)�������ַ������ʱ��ʾ�������ַ���������һ�𣬴Ӷ�����µ��ַ�����
	3)���ţ�������ʹ�ó��Ų���ʱ���õ��Ľ����Ϊ������С�����ֺ��ԣ�������������0��ʱ�򣬻����������쳣��
             �������(Infinity):��һ������������������0ʱ,��������������0.0ʱ;
              �������(-Infinity):��һ������������������0ʱ,���߸���������0.0ʱ;
              NaN(Not a Number):��0.0����0.0ʱ;
    4)ȡģ(������)��ģ���ķ��ź��Բ��ƣ����������ȡ���ڱ�ģ��.
		.
  
	 5)������doubleת��int���������

	����: ���֤����֤���� 5 ��
*/

//������
public class ArithemeticOperatorsDemo
{
	public static void main(String[] args)
	{

		// ��һ��
		char c = 'a';  //97
		char c2 = 'A';	//65
		System.out.println(c + c2);  //162

		//�ڶ���
		String s = "52";
		String s2 = "0";
		String s3 = s + s2;
		System.out.println(s3); // "520"

		//������
		System.out.println(20 / 3); // 6 (С�����ֺ���)
		//System.out.println(20 / 0);//  by zero  �쳣
		System.out.println(20.0 / 0.0);   //Infinity �������
		System.out.println(-20.0 / 0.0);  //-Infinity �������

		//���ĸ�
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); // -1

		//�����
		//�ӷ�����
		//�����������ת����ֵ
		int i = new Double(10.1).intValue(); // 10
		int m = new Double(12.5).intValue(); // 12
		System.out.println(i + m);  //22 ����
		
		//����
		System.out.println((10 / 0.0) == (20 / 0.0));  //true

		System.out.println(0.0 / 0.0);  //NaN
		System.out.println((0.0 / 0.0) == (0.0 / 0.0)); //false
		
		
	}
}

//ע�⣺������NaN������double��������,�������������������ȵ�,���и������Ҳ����ȵ�,NaN��Զ�����,Ҳ�������Լ�