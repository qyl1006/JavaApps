/*
	����: ��������a b����  ��ʾ��ͬ�÷�ʽ

	PS: λ������ܽ�:
		����λ:  m����nλ �����Ϊ: m * 2��n�η�

		����λ:  m����nλ, ���Ľ��Ϊ: m / 2��n�η�

	����:  �����ֽ��˼·
			1) ����һ������������ ͨ�������ǵ�ֵ����ת�Ƶ�������������ʵ��a b��������

			2) ͨ�����λ����ʵ�� �������������λ�����������ʵ��λ��ת�� 
				���� ���x ^ y = z �����Ƴ� ����֮�����������������λ���� �����Եõ�����һ��

			3)�������� ���Գ�����嵽x�����������չʾ���

			4) ����ת��Integerʵ����������ʵ�� a b��������  Ҳ����new��Integer�����������õ�ַת��ʵ��

*/

public class SwapVarDemo
{
	public static void main(String[] args)
	{
		int a = 10;
		int b =20;

		//��һ��
		int c = a;
		a = b;
		b = c;
		System.out.println("a��ֵ: " + a + " b��ֵ: " + b);

		//�ڶ���  ��ʱ a = 20 b = 10
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a��ֵ: " + a + " b��ֵ: " + b);

		//������ ��ʱ a = 10 b = 20
		a = b - a;
		b = b - a;
		a = b + a;
		System.out.println("a��ֵ: " + a + " b��ֵ: " + b);

		//������  ��ʱ a=20 b=10  �͵�һ�ַ�������
		Integer i = a; //�ײ��Զ�װ��
		Integer j = b;
		Integer n = i;
		i = j;
		j = n;
		System.out.println(i == 10); //�ײ��Զ�����
		System.out.println(j == 20);
		
	}
}