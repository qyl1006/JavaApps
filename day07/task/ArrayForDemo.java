/*
	//����: ��������,��ӡ������Ԫ��
*/


//������
public class ArrayForDemo
{
	public static void main(String[] args)
	{
		//�������鲢��ʼ��
		int[][] arr = new int[][]{
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9},
			{10, 11}
		};

		//�������鲢��ӡ
		for (int index = 0;index < arr.length; index ++ )
		{
			for (int i = 0;i < arr[index].length ;i ++ )
			{
				System.out.println("arr����Ԫ��Ϊ: " + arr[index][i]);
			}
		}

		
	}
}