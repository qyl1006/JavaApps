//ģ����Ʒ���

//����: ͳ��String����10000��ʱ�� int���10000�ε�ʱ���   ͨ������������  ����ģ�����ģʽ

//����time��
class TimeDemo
{
	//String����10000��
	public long connect()
	{
	
		long time1 = System.currentTimeMillis();
		String i = " ";


		for (int j = 0; j <= 10000; j++)
		{
			i += j;
		}

		long time2 = System.currentTimeMillis();
		long time3 = time2 - time1;
		return time3;
	}

class Times2Demo
{

	//int���10000��
	public long adds()
	{
		
		long time1 = System.currentTimeMillis();
		int i = 1;


		for (int j = 0; j <= 10000000; j++)
		{
			i += j;
		}

		long time2 = System.currentTimeMillis();
		long time3 = time2 - time1;
		return time3;
	}

}

//��ʾ������
public class TemplateDemo
{
	public static void main(String[] args)
	{
		TimeDemo t = new TimeDemo();

		//String����ʱ��ͳ��
		System.out.println(t.connect());

		//int���ʱ��ͳ��
		System.out.println(new Time2Demo().adds());
	}
}