/*
	1) ��Ԫ���������ʾ������Ԫ�ز���ı��ʽ�������ֳ�Ϊ��Ŀ��������������ʾif-else.
		�ص�:	�﷨��ʽ��X  ?  Y ��Z�� �� ��������˼������ ˼ά
		����xΪboolean���ͱ��ʽ���ȼ���X��ֵ����X���Ϊtrue��������Ŀ������ʽ�Ľ����Y���������Z����Ŀ����������������Y��Z������
	2) if���

	����: ���������� �﷨�ṹ ��� ��ҳ�� ��һҳ ��һҳ ����
	PS:  ʹ����Ԫ��������޷������ǰҳ���� ��ҳ�� �� С�� ��ҳ������� �� ʹ�� if ���ƽ��

	�ܽ�: ��ס �﷨��ʽ
*/

//������
public class TernaryOperatorDemo
{
	public static void main(String[] args)
	{

		//��Ԫ���� ���
		//��ҳ��
		int i = 100; //������
		int m = 15; // ÿҳ��������

		int j = i % m == 0 ? i / m : i / m + 1;
		System.out.println("��ҳ��: " + j);

		//��һҳ
		int n = 7; //��ǰҳ 
		
		int ii = n - 1 > 0 ? n - 1 : n;
		System.out.println("��һҳ: " + ii);

		//��һҳ
		int iii = n < j ? n + 1 : n;
		System.out.println("��һҳ: " + iii);

		System.out.println("===============");
		//if ���

		///�ж����ֵ
		int a = 20;
		int b = 100;

		if (a > b)
		{
			System.out.println("���ֵ��:" + a);
		}
		else
		{
			System.out.println("���ֵ��:" + b);
		}

		//��Ҫ: �����ҳ��
		int totalData = 3423;  //��������
		int data = 50;  //ÿҳ����������
		int totalPages; //��ҳ��

		if (totalData % data == 0)
		{
			totalPages = totalData / data;
		}
		else
		{
			totalPages = totalData / data + 1;
		}
		System.out.println("��ҳ��:" + totalPages);

		//��Ҫ: ������һҳ �� ��һҳ
		int currentPage = 18; //��ǰҳ
		int previousPage; //��һҳ
		int nextPage;     //��һҳ
		// ������һҳ
		if (currentPage <= totalPages)
		{
			if (currentPage - 1 >= 1)
			{
				previousPage = currentPage - 1;
			}
			else
			{
				previousPage = 1;
			}
			//������һҳ
			if (currentPage + 1 <= totalPages)
			{
				nextPage = currentPage + 1;
			}
			else
			{
				nextPage = totalPages;
			}
			System.out.println("��ǰҳΪ:" + currentPage);
			System.out.println("��һҳΪ:" + previousPage);
			System.out.println("��һҳΪ:" + nextPage);
		}
		else
		{
			System.out.println("����:��ǰҳ������ҳ��");
		}
	}
}