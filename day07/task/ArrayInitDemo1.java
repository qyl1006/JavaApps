/*
	����ľ�̬��ʼ������:
    �ص�: �������Լ���Ϊÿһ������Ԫ�����ó�ʼ��ֵ,������ĳ�����ϵͳ(JVM)����.
	�﷨:
	      ����Ԫ������[]  ������ = new ����Ԫ������[]{Ԫ��1,Ԫ��2,Ԫ��3,.......};

*/


//������
public class ArrayInitDemo1
{
	public static void main(String[] args)
	{
		//��̬��ʼ��һ��int�Ķ�ά����
		int[][] arr = new int[][]{
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9},
			{10, 11}
		};

		//��ȡ������arr�ĳ���,����ӡ
		System.out.println(arr.length);

		//��ȡ����ֵ����ӡ
		System.out.println(arr);  //��ӡ����������ڴ�ռ�ĵ�ֵַ
		
		System.out.println(arr[2][1]);  // 11
		//����ĳ������ֵ
		
		arr[2][1] = 110;
		System.out.println(arr[2][1]);  // 110
	}
}

//�ܽ�: ��̬��ʼ����ʹ�ñ���Ԥ��֪��