/*
		����ѭ���ṹ���		
*/
//������
public class LoopInLoopControlDemo
{
	public static void main(String[] args)
	{
		/*break���
		break:��ֹ��ǰ���ڵ�ѭ��. stop
	�ܽ�: break֮������ִ�в���,���Բ��ܱ�д.
	����: ֤��
		*/
		//����
		while (true)
		{
			System.out.println("����");
			break;
		}


		/*
			continue���: ��������˼. skip.
			������ǰ��ѭ��,������һ��ѭ������.
		�ܽ�:break֮������ִ�в���,���Բ��ܱ�д.
		����:֤��
		*/
		System.out.println("===========================");

		for (int i = 1;i <= 5 ;i ++ )
		{
			if (i == 3)
			{
				continue;   //���к���ʾ: ��i=3ʱ,����������ǰѭ��,������һ��ѭ��,���Դ�ӡ��ʾ: 1 2 4 5
			}
			System.out.println(i);
		}

		/*	return:
				��ʾ����ѭ�����ڵķ����������������ˣ�ѭ���ṹ��ȻҲ�ͽ����ˡ�

				ע��:
				break��continue��return����������Զû�л���ִ�У����Բ����ٸ��κ���䣬�������ʧ��
			
			����: ֤��
		*/
		System.out.println("===========================");
		for (int i = 0;i < 5 ; i ++ )
		{
			if (i == 4)
			{
				return;
			}
			System.out.println(i);
		}
		System.out.println("eng=======");  //ͨ����ʾ�������: ��仰û�д�ӡ���� ���Կ����Ƴ� returnֱ�ӽ�����ǰ����
		
	}
}