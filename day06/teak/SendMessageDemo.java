/*
	����:����һ��������Ϣ�ķ���
			���ز���: 1 ��ʾ   ���ͳɹ�
					  0  ��ʾ  ����ʧ��	
					  -1  ��ʾ ��Ϣ�Ѳ���
*/					  	

//�Զ���
class Test
{
	public int message(int i, String s)
	{
		//TODO
		System.out.println("��Ϣ����: " + s + " ������:" + i + " ״̬:�ɹ�");
		return 1;
	}
}

//������
public class SendMessageDemo
{
	public static void main(String[] args)
	{
		//���÷���
		new Test().message(10086, "���");
	}
}