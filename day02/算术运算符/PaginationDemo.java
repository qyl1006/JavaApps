//������Ԫ��������з�ҳ���߼�
public class PaginationDemo
{
	public static void main(String[] args) 
	{
		/*
			����:����һ��344������,Ҫ��ÿһҳ���10������,��ҳ������?
		*/
		int total_data = 344; //��������
		int data = 20;		//ÿҳ���20������

		int total_pages = total_data / data == 0 ? total_data / data : total_data / data + 1; //��ҳ��
		System.out.println("��ҳ��:" + total_pages);


		//��Ҫ: ������һҳ����?
		int current_page = 1;// ������ǰҳ��
		System.out.println("��ǰҳ:" + current_page);
		int previous_page = current_page - 1 >= 1 ? current_page - 1 : 1;
		System.out.println("��һҳ:" + previous_page);
		System.out.println("======================");

		//����: ������һҳ����?
		int current_page2 = 18;// ������ǰҳ��
		System.out.println("��ǰҳ:" + current_page2);
		int next_page = current_page2 + 1 <= total_pages ? current_page2 + 1 : total_pages;
		System.out.println("��һҳ:" + next_page);
	}
}