//������  ��ֱ�Ӹ�����ֵ�ĳ���,����������  ��ν�������ǳ����в��仯���� 
//����: ֱ�Ӵ��볣������ӡ

//��ʾ��
public class ConstDemo
{
	//������,���
	public static void main(String[] args)
	{
		//��ӡ���� 2 int���� Ĭ�ϵ�
		System.out.println(2);

		//��ӡfinal���εĲ�����MAX
		System.out.println(new Test().max());
	}
}


//����������
//final����
class Test
{
	private final int MAX = 110;

	public int max()
	{
		return MAX;
	}
}