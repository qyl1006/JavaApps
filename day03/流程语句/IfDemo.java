//if���
public class IfDemo
{
	public static void main(String[] args)
	{
		if(10 > 3)
		{
			System.out.println("10����3");
		}

		/*
			if-else: ��ʾ: ���_______����_________����________
		*/
		boolean isMan = true;
		if(isMan)
		{
			System.out.println("ȥ�в���");
		}
		else
		{
			System.out.println("ȥŮ����");
		}

		///�ж����ֵ
		int a = 20;
		int b = 100;

		if(a > b)
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