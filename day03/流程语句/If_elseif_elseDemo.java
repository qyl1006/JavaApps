//if-else-else���
public class If_elseif_elseDemo
{
	public static void main(String[] args)
	{
		// ��Ҫ: ���Գɼ��������90��,��ӡ��; �������80��,��ӡ��; �������70��,��ӡ��; ���������ӡ���Ŭ��
		int score = 58;

		if (score >= 90)
		{
			System.out.println("��");
		}
		else if (score >= 80 && score < 90)
		{
			System.out.println("����");
		}
		else if (score >= 70 && score < 80)
		{
			System.out.println('��');
		}
		else
		{
			System.out.println("���Ŭ��");
		}
	}
}