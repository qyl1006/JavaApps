/*
	����:
		1������ 5 ���µ������ſ�����spending��������
		rent�����⣩        = 800.00
		mealCost���Է���    = 900.00
		clothingCosts�����·��� = 300.00
		otherCosts���������ã�    = 300.00


		2������ 12 ���´�����Ϣ֮�ͣ�totalInterest��������ѧ��(tuition) 16000.00��ÿ�����ʣ�rate��1%��������������

		3������һ�� int ����(unfinishedCount)��ŵ�ǰ����ҵδ��ɴ���������һ�� String ����(result)�����Ԫ��������صĽ�����ﵽ 3 �λ����Ͼʹ�š��������������š����ڡ���

		4������һ�� int �������һ����λ�����������ֱ������λ���ϵ�ֵ��ʮλ���ϵ�ֵ�͸�λ���ϵ�ֵ��
			
*/


//������
public class ExtendDemo
{
	public static void main(String[] args)
	{
		//��һ������
		double rent = 800;
		double meal_cost = 900;
		double clothing_costs = 300;
		double other_costs = 300;
		double sum = rent + meal_cost + clothing_costs + other_costs;
		System.out.println("5���µ������Ϊ: " + sum);

		//�ڶ�������
		double interests = 16000.00 * (1.0 / 100.0);
		System.out.println(interests);

		//����������
		int i = 2;
		String s = i >= 3 ? "����" : "����";
		System.out.println(s);

		//���ĸ�����
		int a = 234;
		int nnn = a / 100;//a��λ��������
		int nn = (a - nnn * 100) / 10; //ʮλ��������
		int n = a % 10; //a��λ��������
		System.out.println("��λ��: " + nnn + " ʮλ��:" + nn + " ��λ��:" + n);
		
	}
}