/*
	����: ����һ����ά���� ����ʼ�� ����������ֵ ��ȡֵ ������ӡ����Ԫ�صĲ���

	˼·:  ��ά�����һά���鶼������,�������Ǿ���������,ͬ��һЩ����Ҳһ��,���Բ���ģ��һά����Ĳ���.
*/

//������
public class ArrayInArrayDemo
{
	public static void main(String[] args)
	{
		//����һ����ά���鲢��ʼ��;
		int[][] test = new int[10][3];

 		int[][] arr = new int[][]{
			{1, 2, 3, 4, 5, 6, 7},
			{8, 9, 10, 11, 12},
			{11, 12, 13}
		};

		//��ȡֵ
		System.out.println(arr[2][1]); //12

		//����ֵ
		arr[2][1] = 120;
		System.out.println(arr[2][1]); // 120

		//�������鲢��ӡ
		for (int i = 0;i < arr.length ; i ++ )
		{
			for (int j = 0;j < arr[i].length ;j ++ )
			{
				System.out.println(arr[i][j]);
			}
		}

		System.out.println("===========================================");

		//��ǿforѭ����ά���� ʵ��
		for(int[] i : arr)     //i Ϊ��ά�����е� ����һά����������ڴ�ռ���ڴ��ֵַ 
		{                        // ��ʵ����ͨ�������Բ�������һά����Ķ���洢��ֵ
			for (int ii : i)
			{
				System.out.println(ii);
			}
		}
	}

}