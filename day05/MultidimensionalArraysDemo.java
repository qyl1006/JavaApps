//��ά���� (����������)
public class MultidimensionalArraysDemo
{
	public static void main(String[] args)
	{
		//����һ����ά���鲢��ʼ��, ��һά���鶨���ʽ����
		int[][] arr = new int[][] {
				{1, 2, 3},
				{4, 5},
				{9}
			};
		
		System.out.println(arr.length);
		System.out.println(arr); // [[I@15db9742

		for (int i = 0; i < arr.length ; i ++ )
		{
			System.out.println(arr[i]);
			System.out.println("����arrÿ��Ԫ�صĳ���: " + arr[i].length);
			for (int j = 0; j < arr[i].length; j ++ )
			{
				System.out.println(arr[i][j]);
			}
		}
		
	}
}