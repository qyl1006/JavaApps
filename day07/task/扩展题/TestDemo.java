/*
	����: ������һ������,����һ�� int ��������,���������������ż��λ��Ԫ��֮��
												�������������������λ��Ԫ��֮��
																
*/

//������
public class TestDemo
{
	public static void main(String[] args)
	{
		//���÷�������
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		
		//����Ϊż����Ԫ�غ�
		System.out.println(Test.getSumEven(arr));

		//����Ϊ������Ԫ�غ�
		System.out.println(Test.getSumOdd(arr));

		//����  ��ӡ���� Ч��
		int[] arrs = Test.test(arr);
		for (int i = 0 ;i < arrs.length ; i ++ )
		{
			System.out.println(arrs[i]);
		}
	}
}


//���巽��
class Test
{
	//����������������ż��λ��Ԫ��֮��
	public static int getSumEven(int[] arr)
	{
		int sumEven = 0;
		for (int index = 0; index < arr.length ;index ++ )
		{
			if (index != 0 && index % 2 == 0)
			{
				sumEven += arr[index];
				
			}
		}
		return sumEven;
	}

	//��������������������λ��Ԫ��֮��
	public static int getSumOdd(int[] arr)
	{
		int sumOdd = 0;
		for (int index = 0;index < arr.length ;index ++ )
		{
			if (index != 0 && index % 2 == 1)
			{
				sumOdd += arr[index];
			}
		}
		return sumOdd;
	}

	//���鵹�򷽷�
	public static int[] test(int[] arr)
	{
		int[] newArr = new int[arr.length];
		for (int i = 0;i < arr.length ; i ++)
		{
			newArr[arr.length - 1 - i] = arr[i];
		}
		return newArr;
	}

}