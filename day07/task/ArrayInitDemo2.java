/*
	����Ķ�̬��ʼ������:
	 �����������������Ԫ�ظ���(���鳤��),��ÿһ������Ԫ�صĳ�ʼֵ��ϵͳ����.
	�﷨:
		����Ԫ������[]  ������ = new  ����Ԫ������[ length ];

*/

//������
public class ArrayInitDemo2
{
	public static void main(String[] args)
	{
		//��̬��ʼ��һ����ά����
		int[][] arr = new int[10][10];

		//��ȡ����arr�ĳ���,����ӡ
		System.out.println(arr.length);

		//��ȡ����ֵ
		System.out.println(arr);//��ӡ����������ڴ�ռ�ĵ�ֵַ
		System.out.println(arr[9][9]);// 0

		//��������ֵ
		System.out.println("=======================");
		
		arr[9][9] = 110;
		System.out.println(arr[9][9]);

	}
}


//�ܽ�: ��̬��ʼ��һ�㶼�ǲ�֪��������Ԫ�صľ���ֵ,��Ϊ��֪����Ҫ�洢��Щ����
//		,����ֻ��ʹ�ö�̬��ʼ��