/** if-else�ṹ
	�﷨:	if(boolean���ʽ){
				 ����ִ����A
			}else{
				 ����ִ����B
			}

	����: �����ֵ����ֵ
*/

//������
public class IfElseDemo
{
	public static void main(String[] args)
	{
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

/*�ܽ�: �������϶��ߵĺ�����ͬ.
			�ӱ�����˵,if-else�����ṹ,��Ԫ�������һ���������.
			��Ԫ �����������һ�����,���ʽ�����н��,�����з���.
			��if-else,���ܷ���ʲô���,ֻ�ܿ������Ľṹ.
 
*/