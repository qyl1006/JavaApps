//�����Ķ���͵���
public class MethodDemo2
{
	/*
		�����Ķ����ʽ:
			[���η�]   ����ֵ����   ��������([�β�1,�β�2,...])
			{
				������;
				[���������Ҫ�������߷���һ�����,��ʱʹ��return ֵ];
			}
	*/

	// 1) �޲����޷���
	// ����: ����һ������,, ר�Ŵ�ӡ============
	static void print()
	{
		System.out.println("=====================");
	}

	// 2) �в����޷���   ����: ��ӡ������
	static void print2(String val)
	{
		System.out.println(val);
	}
	
	// 3) �޲����з���  ����: �����ҵ�����17
	static int getAge()
	{
		return 17;
	}

	// 4) �в����з���  ����: ����������֮��
	static int getSum(int a, int b)
	{
		return a + b;
	}


	public static void main(String[] args)
	{
		MethodDemo2.print(); //���÷���

		MethodDemo2.print2("1234");  // ���÷���, ������Ҫ��ӡ���ַ�������
		MethodDemo2.print2("Hello");
		MethodDemo2.print2("����");

		//MethodDemo2.getAge();  // ����ʾ���صĽ��,û�н��շ��ؽ���ı���
		int age = MethodDemo2.getAge();   //����һ���������շ������صĽ��
		System.out.println(age);

		// �������sum����getAge���صĽ��
		int sum = MethodDemo2.getSum(11, 123);
		System.out.println(sum);

		sum = MethodDemo2.getSum(1111, 123);
		System.out.println(sum);
	}


}