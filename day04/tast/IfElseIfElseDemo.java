/** �﷨��ʽ:
	if(boolean���ʽA){
     ����ִ����
	}else if (boolean ���ʽB){
		 ����ִ����B
	}else{
		 ����ִ����C
	}

	����: ����17��12�µ�һ������,�жϽ������ڼ�? �����ڳ�����������Χ,��ӡ����()
			PS: 12����31��
*/

//������
public class IfElseIfElseDemo
{
	public static void main(String[] args)
	{
		
		int today = 131;
		if (today <= 0 || today > 31)
		{
			System.out.println("17��12��û�����������");
		}else if (today % 7 == 0)
		{
			System.out.println("��������" + 4);
		}else if(today % 7 <= 3)
		{
			System.out.println("��������" + (today % 7 + 4));
		}else
		{
			System.out.println("��������" + (today % 7 - 3));
		}
	}
}

/**�ܽ�:1):������if(boolean���ʽ),ʹ�÷ֺ�.
		2):������else if(boolean���ʽ),ʹ�÷ֺ�.
		3):����ֱ��ʹ��else if���,������ʹ��if���.
		4):����else���,��ʾ��������������Ϊfalse
			��ʱ��Ż�ִ�еĴ���
*/