/** �ɼ�����
		����: �ֱ��ѯ���� ��ѧ Ӣ��óɼ�.[100 90]�� (90 80]�� (80 60]���� ����������
	    ���:  ���ýӿ���ʵ��
*/



//��ѯ�ӿڹ淶
interface Querys
{
	void print();
}

//���ĳɼ���ѯʵ����
class Language implements Querys
{
	public void print()
	{
		System.out.println("���ĳɼ�Ϊ:");
	}
}

//��ѧ�ɼ���ѯʵ����
class Mathematics implements Querys
{
	public void print()
	{
		System.out.println("��ѧ�ɼ�Ϊ:");
	}
}

//Ӣ��ɼ���ѯʵ����
class Englist implements Querys
{
	public void print()
	{
		System.out.println("Ӣ��ɼ�Ϊ:");
	}
}

//�ɼ���ѯ
class Results
{
	public static void pass(Querys q, int num)
	{
		q.print();

		//�ɼ��ж� if-elseif-else�ṹ���
		if (num >= 90)
		{
			System.out.println("����");
		}
		else if (num >= 80)
		{
			System.out.println("����");
		}
		else if (num >= 60)
		{
			System.out.println("����");
		}
		else 
		{
			System.out.println("������");
		}
	}
}


//������
public class ScorelevelDemo
{
	public static void main(String[] args)
	{
		//Ӣ��ɼ���ѯ
		Querys q1 = new Englist();
		Results.pass(q1, 56);

		//��ѧ�ɼ���ѯ
		Querys q2 = new Mathematics();
		Results.pass(q2, 79);

		//���ĳɼ���ѯ
		Querys q3 = new Language();
		Results.pass(q3, 89);
	}
}


