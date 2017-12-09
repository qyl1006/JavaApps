//������������
public class AscendingOrderDemo
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


	//���÷�������
	public static void main(String[] args)
	{
		int[] arrs = new int[]{5, 7, 4, 9, 1, 3, 10, 2, 12, 6};

		System.out.println("�����������ǰ:");

		printArray(arrs);
		//���÷���������������
		rise3(arrs);

		System.out.println("�������������:");
		printArray(arrs);
	}
}