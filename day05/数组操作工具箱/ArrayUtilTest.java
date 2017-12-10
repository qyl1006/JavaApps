//测试自定义的ArrayUtil类的方法
public class ArrayUtilTest
{
	public static void main(String[] args)
	{
		int[] nums = new int[]{-1, -2, 3, 8, 2, 90, 4, 7, 5, 12, 14, 19, 22,15, 18};
		//打印
		ArrayUtil.printArray(nums);

		//数组元素互换
		ArrayUtil.swap(nums, 0, 4);
		System.out.println("排序前:");
		ArrayUtil.printArray(nums);
		System.out.println("========================================");

		//数据组升序1
		
		ArrayUtil.rise1(nums);
		ArrayUtil.printArray(nums);

		ArrayUtil.rise2(nums);
		ArrayUtil.printArray(nums);

		ArrayUtil.rise3(nums);
		ArrayUtil.printArray(nums);

		//使用二分法 查找元素 22 的索引
		int index = ArrayUtil.binarySearch(nums, 22);
		System.out.println(index);

		//求数组nums的最大值及最少值
		System.out.println("最大值:" + ArrayUtil.getMax(nums));
		System.out.println("最小值:" + ArrayUtil.getMin(nums));


		//打印杨辉三角前10行的数,,
		ArrayUtil.yangHui(10);
	}
}