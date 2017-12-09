//���ֲ��ҷ�
public class FindTwoPointsDemo
{
	public static void main(String[] args)
	{
		//ǰ������:����Ԫ�ر�����˳���---��  �������Ԫ��û��˳��,��ô��?--����֪��--����������
		int[] nums = new int[]{-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		//������arr�в���Ԫ��3������
		System.out.println(binarySearch(nums, -2));

	}

	//��д���ַ�����
	static int binarySearch(int[] arr, int key)
	{
		int left = 0;
		int right = arr.length - 1;
		while (left <= right)
		{
			System.out.println(left + "==========" + right);
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
}