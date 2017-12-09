//二分查找法
public class FindTwoPointsDemo
{
	public static void main(String[] args)
	{
		//前提条件:数组元素必须有顺序的---呃  如果数组元素没有顺序,怎么玩?--还不知道--保留好奇心
		int[] nums = new int[]{-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		//从数组arr中查找元素3的索引
		System.out.println(binarySearch(nums, -2));

	}

	//编写二分法方法
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