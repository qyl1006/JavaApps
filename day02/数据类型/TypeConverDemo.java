//��������ת��
public class TypeConverDemo
{
	public static void main(String[] args)
	{
		//��С�����ݷ�Χת������ݷ�Χ,�Զ�ת��
		//ת��������ʵ���Ǹ����������͵Ŀռ�Ĵ�С.�ֽڴ�С
		byte b1 =5;
		short s1 = b1;//Сת��
		int i1 = s1;
		long l1 = i1;

		float f1 = l1;
		double d1 = f1;

		System.out.println(d1);

		//------------
		///ǿ��ת��,,���תС��
		 
		 int i2 = 22250;
		 byte b2 = (byte)i2;
		 System.out.println(b2);
		 byte b3 = (byte)222222;

		 ///���ʽ���͵���������,,,�������ʽ�����ս�����ͱ����������ʽ������ߵ�����
		 float f2 = 123 + 1.1F + 99L + 3.14; ///����:������ʧ����  


		 double d2 = 123 + 1.1F + 99L + 3.14;

		 //String��������������ʹ�� + ���������Ľ������String
		 String d3 = 123 + 1.1F + 99L + 3.14 + "";
	}
}