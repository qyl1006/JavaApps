/*
	����: ��һ��������ĳԪ�س�������(��һ��/���һ��)
	˼·: ���һ�γ��ֵ�����: �������ͷ(����0��ʼ)����,Ȼ�����Ԫ������Ҫ���ҵ�key���Ƚ� ������ �ʹ�ӡ��Ӧ������ֵ

		 �����һ�ε�����: �������β(����Ϊarr.length - 1)��ʼ����, Ȼ�����Ԫ������Ҫ���ҵ�key���Ƚ� ������ �ʹ�ӡ��Ӧ������ֵ

		����: ���� -1
*/

//������
public class ArraySearchDemo
{
	public static void main(String[] args)
	{
		//����һ������
		int[] arr = new int[]{0, 3, 3, 7, 9, 1, 5, 2, 6, 8, 10, 11, 23, 65, 0, 3};

		//Ԫ��3��һ�γ��ֵ�����
		int i = TestDemo.arrayFirst(arr, 65);
		System.out.println(i);

		//Ԫ��3���һ�γ��ֵ�����
		int j = TestDemo.arrayLast(arr, 3);
		System.out.println(j);
		
	}
}

class TestDemo
{
	//keyԪ�ص�һ�γ��ֵ�����
	// arrΪҪ����Ԫ�ص�����;  keyΪ��Ҫ���ҵ�Ԫ��
	public static int arrayFirst(int[] arr, int key)
	{
		for (int i = 0;i < arr.length ;i ++ )
		{
			if (arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}

	//keyԪ�����һ�γ��ֵ�����
	// arrΪҪ����Ԫ�ص�����;  keyΪ��Ҫ���ҵ�Ԫ��
	public static int arrayLast(int[] arr, int key)
	{
		for (int i = arr.length - 1; i >= 0; i -- )
		{
			if (arr[i] == key)
			{
				return i;
			}
		}
		return -1;
		
	}
}