//�������ģʽ ------ ����ʽ.------�Լ��ȴ�����һ������,���ŵ��� --
/*
		д����ģʽ�Ĳ��裺��������ʽ.
      1):�����ڸ�����,�Լ��ȴ�����һ������.
      2):˽�л�����Ĺ�����,��ֹ���ͨ�������������µĶ���.
      3):���Ⱪ¶һ�������ľ�̬�������ڻ�ȡ����Ķ���
*/

//������
class Utils
{
	//����һ������
	private static final Utils u = new Utils();
	//˽�л�������
	private Utils()
	{
	}
	//ȫ�־�̬�ķ���
	public static Utils getU()
	{
		return u;
	}

	public void print(int[] arr)
	{
		System.out.println("�������");
	}
}



//������
public class SingLetonDemo
{
	public static void main(String[] args)
	{
		/*
		Utils u = new Utils();
		u.print();
		System.out.println("---------");
		Utils.print();
		Utils.print();
		Utils.print();
		*/
		Utils.getU().print(null);
		
	}
}