//�����Զ����ArrayUtil��ķ���
public class ArrayUtilTest
{
	public static void main(String[] args)
	{
		int[] nums = new int[]{-1, -2, 3, 8, 2, 90, 4, 7, 5, 12, 14, 19, 22,15, 18};
		//��ӡ
		ArrayUtil.printArray(nums);

		//����Ԫ�ػ���
		ArrayUtil.swap(nums, 0, 4);
		System.out.println("����ǰ:");
		ArrayUtil.printArray(nums);
		System.out.println("========================================");

		//����������1
		
		ArrayUtil.rise1(nums);
		ArrayUtil.printArray(nums);

		ArrayUtil.rise2(nums);
		ArrayUtil.printArray(nums);

		ArrayUtil.rise3(nums);
		ArrayUtil.printArray(nums);

		//ʹ�ö��ַ� ����Ԫ�� 22 ������
		int index = ArrayUtil.binarySearch(nums, 22);
		System.out.println(index);

		//������nums�����ֵ������ֵ
		System.out.println("���ֵ:" + ArrayUtil.getMax(nums));
		System.out.println("��Сֵ:" + ArrayUtil.getMin(nums));


		//��ӡ�������ǰ10�е���,,
		ArrayUtil.yangHui(10);
	}
}