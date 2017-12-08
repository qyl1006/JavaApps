//增强for循环-foreach
public class ForEachDemo
{
	public static void main(String[] args)
	{
		int[] nums = new int[]{10, 20, 30, 40, 50};

		//用for循环迭代出数组中的每一个元素
		for (int index = 0; index < nums.length ; index ++ )
		{
			System.out.println(nums[index]);
		}
		System.out.println("==========");

		/*语法: for(数组元素类型 变量  :   数组名)
				{
					 循环体
				}
 
			使用增强for循环-foreach 语法 实现
		*/
		for(int eles : nums)
		{
			System.out.println(eles);
		}
	}
}