/**
	do whileѭ��:
		��ʽ��
		do
		{
			  ѭ�������
		}
		while(boolean���ʽ);
	�ܽ�:	do whileѭ���ص㣺��ִ��һ��ѭ���壬���жϱ��ʽ����Ϊtrue��ִ��ѭ���壬��������ѭ���塣
			Ҳ����˵do while����ִ�к��жϣ���ʹ�ж�����Ϊfalse����ѭ�����ٻ�ִ��һ�Ρ� 
	����:��ӡ���� 5��
*/

//������
public class DoWhileDemo
{
	public static void main(String[] args)
	{
		int i = 0;
		do
		{
			System.out.println("����");
			i ++;
		}
		while (i < 5);
	}
}