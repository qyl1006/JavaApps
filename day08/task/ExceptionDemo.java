/*
	��������ĳ����쳣
		1)NullPointerException:��ָ���쳣(������).
		2)ArrayIndexOutOfBoundsException:���������Խ���쳣.

		����: ������֤�����쳣

*/

//������
public class ExceptionDemo
{
	public static void main(String[] args)
	{
		// 1)
		int[] arr = null;
		System.out.println(arr); //���������������� ԭ��:arr������ջ֡���Ǵ��ڵ�,����û�������κ��ڴ�ռ�,Ϊnull.����ӡ�������鲢û�ж����ڴ�ռ������
		//System.out.println(arr.length); //���� .NullPointerException

		// 2)
		arr = new int[]{1, 2, 3, 4};
		//System.out.println(arr[5]); // ���� ArrayIndexOutOfBoundsException ��Ϊ���������Ϊ[0 , arr.length)

	}
}