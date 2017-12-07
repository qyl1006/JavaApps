//�������2
public class ArrayOperationDemo2 
{
	//����: ��ȡ�����������ֵ�ķ���
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

	//��ӡ����Ԫ�صķ���
	static void printArray(String[] arr)
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

	/*
		������������Ԫ��:
        ԭ����:[A, B, C, D, E]
        �������
        ������:[E, D, C, B, A]

		int������String���͸÷���ͨ�� ֻ����ķ������� ����ֵ��������
	*/
	//������������Ԫ�صķ���1
	static String[] reverseArray(String[] oldArr)
	{
		String[] newArr = new String[oldArr.length];
		for (int index = oldArr.length - 1; index >= 0 ; index -- )
		{
			newArr[oldArr.length - 1 - index] = oldArr[index];
		}
		return newArr;
	}

//������������Ԫ�صķ���2
	static String[] reverseArray2(String[] oldArr)
	{
		String[] newArr = new String[oldArr.length];
		for (int index = 0; index < oldArr.length ; index ++ )
		{
			newArr[oldArr.length - 1 - index] = oldArr[index];
		}
		return newArr;
	}

	/*
		Ԫ�س�������(��һ��/���һ��),�������� �ķ���
		����:
			arr: ָ���ĸ�������ȥ����ѯ
			key: ��ǰ��Ҫȥ��ѯ��Ԫ��
			���� :���key����arr������,�򷵻���Ӧ������; key������arr�������򷵻�-1
	*/
	//��ȡԪ��key��arr�����г��ֵ�һ�ε�����
	static int indexOf(int[] arr, int key)
	{
		for (int index = 0; index < arr.length; index ++)
		{
			if (arr[index] == key)
			{
				return index;
			}
		}
		return -1;
	}

	//��ȡԪ��key��arr�����г������һ�ε�����
	static int lastIndexOf(int[] arr, int key)
	{
		for (int index = arr.length - 1; index >= 0; index --)
		{
			if (arr[index] == key)
			{
				return index;
			}
		}
		return -1;
	}


// main���
	public static void main(String[] args) 
	{
		int[] nums = new int[]{-2, 3, 7, 0, 3, 4, 3, 3};

		// ���÷���
		int max = ArrayOperationDemo2.getMax(nums); 
		int min = ArrayOperationDemo2.getMin(nums);

		System.out.println("nums�������ֵ:" + max);
		System.out.println("nums������Сֵ:" + min);

		//����printArray����
		String[] arr = new String[]{"1", "3", "5", "7", "9"};
		//String[] arr = null;

		ArrayOperationDemo2.printArray(arr);

		//����reeverseArray���� 
		arr = ArrayOperationDemo2.reverseArray(arr);
		System.out.println("��ӡarr������������Ϊ:");
		ArrayOperationDemo2.printArray(arr);
		System.out.println("===========================");
	
		//����indexOf����,,��ȡԪ�س��ֵ�����
		System.out.println("��һ�γ�������: " + ArrayOperationDemo2.indexOf(nums, 3));
		System.out.println("���һ�γ�������: " + ArrayOperationDemo2.lastIndexOf(nums, 3));

		
		//����: ������return ����ĳ��ֵ���ǲ��Ǿ�ִֹͣ����һ����? �淵����?  

		
	}



}
