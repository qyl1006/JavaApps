//��Ԫ�����
public class TernaryOperatorDemo
{
	public static void main(String[] args)
	{
		//����:��һ��С��,��Ҫ�������������Ľ��,,��ô��ɸ�����?
		/*
			˼·����ֽ����
			1) ��ȡ3.49����������---------3
			2) ��ȡ3.49��С������----3.49---0.49
			3) ��0.49��0.5���Ƚ�:
						0.49 >=0.5  ----------3+1
						0.49<0.5 -------------3

			��Ԫ�������ʽ:
			�������� ���� = boolean���ʽ ? ֵ1 : ֵ2;

			���boolean���ʽ�Ľ����true, ��Ԫ������ʽ�������ֵ1;
				boolean���ʽ�Ľ����false, ��Ԫ������ʽ�������ֵ2


		*/
		double num = 3.5123 ;

		int num1 = (int)num; //��������
		double num2 = num - num1;
		System.out.println(num2);

		int abc = num2 >= 0.5 ? num1 + 1 : num1;
		System.out.println(abc);
	
	    //�Ƚ�����ֵ,�ҳ����/Сֵ
		int a = 20;
		int b = 22;
		String max = a >= b ? "���ֵ:" + a : "���ֵ:" + b;
		System.out.println(max);

		//�ж�һ�����Ƿ���ż��������
		int c = -22223;
		String parity = c % 2 == 0 ? "ż��" : "����";
		System.out.println(parity);
	}
}