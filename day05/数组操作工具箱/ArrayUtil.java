//���з�װ�����������ArrayUtil��												
public class ArrayUtil
{
	//��ӡ����Ԫ�صķ���
	static void printArray(int[] arr)
	{
		if (arr == null)
		{
			System.out.println("null");
			return;
		}
		String ret = "[";
		for (int index = 0; index < arr.length; index ++ )
		{
			ret = ret + arr[index];
			if (index != arr.length - 1)
			{
				ret = ret + ", ";
			}
		}
		ret = ret + "]";
		System.out.println(ret);	
	}


	//��������Ԫ�ػ������� ------�÷���������׳ ����index1 index2 ��Ҫ�ж�
	static void swap(int[] arr, int index1, int index2)
	{
		int i = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = i;
	}

	//�����������з���  ð������ ------����ķ��� ��if�ж������ĳ� < ��
	static void rise1(int[] arr)
	{
		for (int m = 1; m < arr.length; m ++ )
		{
			for (int n = 0; n < arr.length - m; n ++ )
			{
				if (arr[n] > arr[n + 1])
				{
					swap(arr, n, n + 1);
				}
			}
		}
	}

	//�����������򷽷� ѡ������  ����ķ��� ��if�ж������ĳ� < ��
	//������������� ѡ�����򷽷� rise3 ����
	static void rise2(int[] arr)
	{
		for (int m = 1; m < arr.length; m ++ )
		{
			for (int index = m; index < arr.length; index ++ )
			{
				if (arr[m - 1] > arr[index])
				{
					swap(arr, m - 1, index);
				}
			}
		}
	}

	// ѡ������
	static void rise3(int[] arr)
	{
		for (int i = 1; i <= arr.length - 1; i ++ )
		{
			int j = i - 1;
			for (int index = i; index <= arr.length - 1; index ++ )
			{
				if (arr[index] < arr[j])
				{
					j = index;
				}
			}
			swap(arr, i - 1, j);
		}
	}


	//��д���ַ�����
	static int binarySearch(int[] arr, int key)
	{
		int left = 0;
		int right = arr.length - 1;
		while (left <= right)
		{
			int min = (left + right) / 2;
			int minNum = arr[min];
			if (minNum == key)
			{
				return min;
			}else if (minNum > key)
			{
				right = min - 1;
			}else if (minNum < key)
			{
				left = min + 1;
			}
		}
		return -1;
	}

	//��ȡ���ֵ����
	static int getMax(int[] nums)
	{
		int max = nums[0];//
		for (int index = 1; index < nums.length; index ++ )
		{
			if (nums[index] > max)
			{
				max = nums[index];
			}
		}
		return max;
	}

	//��ȡ��Сֵ����
	static int getMin(int[] nums)
	{
		int min = nums[0];//
		for (int index = 1; index < nums.length; index ++ )
		{
			if (nums[index] < min)
			{
				min = nums[index];
			}
		}
		return min;
	}

	//���������ĳһλ�õ����ֵķ���
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
	
	//������ǵĶ�ά���鷽��(��ӡ)

	static int[][] yangHui(int m1)
	{
		int[][] arr = new int[m1][m1];
		for (int n = 0; n < m1; n ++ )
		{
			for (int j = n; j < m1; j ++ )
			{
				System.out.print(" ");
			}

			for (int i = 0; i < n + 1; i ++ )
			{
				arr[n][i] = sumC(n, i);
				if (sumC(n, i) != 0)
				{
					System.out.print(sumC(n, i) + " "); //��ӡ����
				}

			}
			System.out.println("\r");
		}
		return arr;
	}

}

