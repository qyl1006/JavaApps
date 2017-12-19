//����˼�Ľӿ� ��̬
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

//���̹���
class Keyboard implements MUSB
{
	public void features()
	{
		System.out.println("žžž��Ϣ����");
	}
}

//����
class Motherboard
{
	static MUSB[] arr = new MUSB[6];
	static int index = 0;
	//���ù���
	public static void transfer(MUSB m)
	{
		if (index > arr.length - 1)
		{
			System.out.println("...������.......");
			return;
		}
		arr[index] = m;
		index ++;
	}

	//һ�����
	public static void print()
	{
		for(MUSB i : arr)
		{
			if (i != null)
			{
				i.features();
			}
			
		}
	}
}



//������
public class USBDemo
{
	public static void main(String[] args)
	{
		/*
		//�������
		Mouse m = new Mouse();
		Motherboard.transfer(m);

		//���ü���
		Keyboard k = new Keyboard();
		//Motherboard.transfer(k);//���� ��ΪMotherboard��û�е��ü��̵ķ��� �����n���豸��Ҫ�����彻������,��ô������Ҫ����n����������? ���˼·,ͳһһ���淶 �ӿ�
		*/
		//�������
		Mouse m = new Mouse();
		Motherboard.transfer(m);

		//����
		Keyboard k = new Keyboard();
		Motherboard.transfer(k);
		Motherboard.transfer(k);
		Motherboard.transfer(k);
		Motherboard.transfer(k);
		
//		����һ�������ֲ��ڲ���
		Motherboard.transfer(new MUSB()
			{
				public void features()
				{
					System.out.println("papappapa");
				}
			}
			
		);
		Motherboard.print();
	}
}
