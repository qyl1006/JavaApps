//����: 1)��������ת��: 1) �Զ�ת�� 2) ǿ��ת��
//		2) ��Integer��װ��Ϊ��,,��ʾintתdouble float byte ����ת������ API�ж�Ӧ����
		
/*
����:
	1) �Զ�ת�� һ�仰 Сת�� ����С���ݷ�Χ���͵���ֵ�����������һ�������ݷ�Χ���ͱ�����ϵͳ��������Զ�����ת�͡�
	2) ǿ��ת��  ��ת�� ���Ѵ�Χ���͵���ֵ�����������һ��С��Χ���ͱ���ʱ����ʱϵͳ�����Զ����ת������Ҫ����ǿ��ת�������������Ĳ�������������ݾ��ȵĽ��ͻ����������ʹ��ʱҪ����ע�⡣

	����: �ֱ���Բ�ͬ��������(Сת��)(��תС)ת���Ľ��  
*/

//������
public class TypeConvertDemo
{
	public static void main(String[] args)
	{
		//Сת��
		//����
		byte b = 12;
		int i = b;

		short s = 11;
		int i2 = s;

		int i3 = 10;
		long l = i3;

		//С��

		float f2 = 13F ;
		double d = f2; //����ͨ��


		//��תС
		long ls = 10;
		int is = (int)ls;

		int is2 = 19;
		short ss = (short)is2;

		short ss2 = 14;
		byte bs = (byte)ss2; //����ͨ��

		//������� ��Ieteger��װ������� ����ת������ API�ж�Ӧ����
		// intתdouble
		int iii = 100;

		//new��ʱ����
		System.out.println(new Integer(iii).doubleValue());

		//intתbyte
		byte bbb = new Integer(iii).byteValue(); //����ͨ�� ֤��
		System.out.println(new Integer(iii).byteValue());

		//intתfloat
		System.out.println(new Integer(iii).floatValue());
		
	}
}

/*
	�ܽ�:  boolean �����ǲ�����ת��Ϊ������������
			
			ǿ��ת���п����������,Ϊʲô? ��Ϊÿ���������͵ķ�Χ����,�����з�Χ��  ���� С������(double float)ǿ��ת��int
*/