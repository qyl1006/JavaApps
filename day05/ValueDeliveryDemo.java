//����������ֵ���ݻ���֮ ������������
public class ValueDeliveryDemo
{
	public static void main(String[] args)
	{
		int x = 10;
		System.out.println("main����ǰ,x= " + x);
		x = ValueDeliveryDemo.change(x);
		System.out.println("main������,x= " + x);
		//System.out.println("main������,x= " + abc);

		System.out.println("===============");

		//���÷��� ----- ֵ���� ������������
		int[] arr = new int[]{11, 12, 13, 15, 18};
		printArray(arr); //��ӡ����arr  ���: [11,12,13,15,18]

		swap(arr, 1, 3);//���� swap���� ���: 12(tempֵ) [I@15db9742(˵��:����ֱ�Ӵ�ӡarrs) [11, 15, 13, 12, 18](��ӡarrs����)
		printArray(arr); //��ӡarr main������arr���� ��Ϊ����(��ֵַ)���ڴ�ռ乲���, ���� [11, 15, 13, 12, 18]

	}




	static int change(int xx)
	{
		System.out.println("change����ǰ,xx= " + xx);
		xx = 50;
		System.out.println("change������,xx= " + xx);
		return xx;
	}

	//����������ֵ���ݻ���֮ ������������
		//��ӡ����Ԫ�صķ���
	static void printArray(int[] arr)
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

		//������arrs�н���arrs[index1]��arrs[index2]��λ��
	static void swap(int[] arrs, int index1, int index2)
	{
		int temp = arrs[index1];
		arrs[index1] = arrs[index2];
		arrs[index2] = temp;

		System.out.println(temp);
		System.out.println(arrs);
		printArray(arrs);

	}
}