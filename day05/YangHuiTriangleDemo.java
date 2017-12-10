//�������
public class YangHuiTriangleDemo
{
	//���������ĳ��λ�õ����ֵķ���
	static int sumC(int n, int i)
	{
		int sum = 0;
		if (n >= 0 && i >= 0)
		{
			if (n == 0 && i == 0)
			{
				return 1;
			}else if (n == 1 && i == 0)
			{
				return 1;
			}else if (n == 1 && i == 1)
			{
				return 1;
			}else{
				sum = sumC(n - 1, i) + sumC(n-1, i - 1);
				return sum;
			}
		}
		return sum;
	}
	
	//������ǵĶ�ά���鷽��

	static int[][] yangHui(int m1)
	{
		int[][] arr = new int[m1][m1];
		for (int n = 0; n < m1; n ++ )
		{
			for (int i = 0; i < n + 1; i ++ )
			{
				arr[n][i] = sumC(n, i);
				if (sumC(n, i) != 0)
				{
					System.out.print(sumC(n, i) + "\t"); //��ӡ����
				}

			}
			System.out.println("\r");
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		//����һ�� ����
		System.out.println(sumC(7,6));
		int[][] arr = yangHui(10);
		/*
		for (int i = 0; i < arr.length ; i ++ )
		{
			System.out.println("����arrÿ��Ԫ�صĳ���: " + arr[i].length);
			for (int j = 0; j < arr[i].length; j ++ )
			{
				System.out.print(arr[i][j]);
			}
			System.out.println("\r");
			System.out.println("=========");
		}
		*/
	}
}