//��ǿforѭ��-foreach
public class ForEachDemo
{
	public static void main(String[] args)
	{
		int[] nums = new int[]{10, 20, 30, 40, 50};

		//��forѭ�������������е�ÿһ��Ԫ��
		for (int index = 0; index < nums.length ; index ++ )
		{
			System.out.println(nums[index]);
		}
		System.out.println("==========");

		/*�﷨: for(����Ԫ������ ����  :   ������)
				{
					 ѭ����
				}
 
			ʹ����ǿforѭ��-foreach �﷨ ʵ��
		*/
		for(int eles : nums)
		{
			System.out.println(eles);
		}
	}
}