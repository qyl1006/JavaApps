/*
	�߼������  ����˼��  �����������߼������
	�﷨��ʽΪ:boolean  result = ���ʽA   �߼������   ���ʽB;
	
	����: ��ʾ�����߼���������÷� �� �Ƚ� & �� && | �� || ����ĺô�

	�ܽ�: ����һ��ʹ�� || && ���ܺ� ��ִ��һЩ�ж� ��Լ�ڴ�?

*/


//������
public class LogicalOperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		// && �ĵ� 
		System.out.println(false && (10 / 0) == 1);  //���в�����  ֤�� && ���ܺ��� &
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

	}
}

