//��ʾ��װ��   װ��Ͳ������
public class IntegerDemo
{
	public static void main(String[] args)
	{
		//װ��
		// ��һ�ַ�ʽ
		Integer i1 = new Integer(18);
		System.out.println(i1);
		//�ڶ��ַ��� ����Integer��ķ���valueOf()
		Integer i2 = Integer.valueOf(18);
		System.out.println(i2);

		//������� Ҳ�ǵ���Integer���еķ���
		int num = i1.intValue();
		System.out.println(num);
		System.out.println("================");

		//�Զ�װ�� ����  ע��: �ڵײ���Ȼ���ֶ�װ��Integer.valueOf�Ͳ������ ����.intValue() 
		Integer i3 = 20;
		System.out.println(i3);
		//�Զ�����		ע��:�ڵײ���Ȼ���ֶ�װ��Ͳ������
		int num2 = i3;
		System.out.println(num2);




	}
}