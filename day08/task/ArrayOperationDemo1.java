/*
	����: ��һ����������С/���ֵ��Ԫ��
	˼·: ����һ��Ԫ��Ϊ��Сֵmin/���ֵmax,ѭ������ʹ����Ԫ����֮�Ƚ�,����Ԫ��С��/���ڸ�
			����ֵ,�ͰѸ�Ԫ�ظ�ֵ��min/max.
*/		




//������
public class ArrayOperationDemo1
{
	public static void main(String[] args)
	{
		//����һ������
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, -1, -2, -6, 0};

		//���÷���
		System.out.println(getMax(arr));// 11  ���Ԫ��
		System.out.println(getMin(arr)); // -6 ��СԪ��
		

	}


	//������������СԪ�صķ���
	static int getMin(int[] arr)
	{
		int min = arr[0];
		for (int i = 0;i < arr.length ;i ++ )
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	//�������������Ԫ�صķ���
	static int getMax(int[] arr)
	{
		int max = arr[0];
		for (int i = 0;i < arr.length ;i ++ )
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
}

//�ܽ�: 