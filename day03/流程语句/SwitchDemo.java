//switch���  
//����: �����������һ,�ʹ�ӡ�����һ;����������ܶ�,�ʹ�ӡ����ܶ�;�������������,�ʹ�ӡ�������;.......
public class SwitchDemo
{
	public static void main(String[] args)
	{
		/*
			switch��ʽ:
				switch(���ͱ��ʽ)
				{
					case ֵ1: ִ�е����; break;
					case ֵ2: ִ�е����; break;
					case ֵ3: ִ�е����; break;
					---
					default: ������ֵ�����Ǳ��ʽ�Ľ��,��ִ����������;
				}
		*/
		int weekday = 8;
		switch(weekday)
		{
			case 1 : System.out.println("��1"); break;
			case 2 : System.out.println("��2"); break;
			case 3 : System.out.println("��3"); break;
			case 4 : System.out.println("��4"); break;
			case 5 : System.out.println("��5"); break;
			case 6 : System.out.println("��6"); break;
			case 7 : System.out.println("��7"); break;
			default : System.out.println("û���������");
		}
		//����: �жϹ���������Ϣ��
		int day = 8;
		switch(day)
		{
			case 1 : 
			case 2 : 
			case 3 : 
			case 4 : 
			case 5 : System.out.println("������"); break;
			case 6 : 
			case 7 : System.out.println("��Ϣ��"); break;
			default : System.out.println("û���������");
		}
	}
}