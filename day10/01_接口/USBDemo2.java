//�滮һ��USB�ӿ�
interface MUSB
{
	void features();
}

//���Ĺ���
class Mouse implements MUSB
{
	public void features()
	{
		System.out.println("������ƶ�.....");
	}
}

//���Ĺ���
class Mouse2 implements MUSB
{
	public void features(Mouse2 m) //���� �޷����ǳ��󷽷� ----... �������ββ�ͬ
	{
		System.out.println("������ƶ�.222....");
	}
}

//���Ĺ���
class Mouse33 implements MUSB
{
	public void features(Mouse33 m)
	{
		System.out.println("������ƶ�33333.....");
	}
}


//������
public class USBDemo2
{
	public static void main()
	{
	}
}