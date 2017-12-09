//���鿽��
public class ArrayCopyDemo
{
	/*��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
	�� src ���õ�Դ���鵽 dest ���õ�Ŀ�����飬���������һ�������б�����������
	�����Ƶ�����ı�ŵ��� length(����ճ��Ԫ�صĳ��Ȼ��߸���) ������
	Դ������λ���� srcPos �� srcPos+length-1 ֮���������ֱ��Ƶ�Ŀ�������е� destPos �� destPos+length-1 λ�á�
	*/
	
	static void arrayCopy(int[] src, int srcPos, int[] dest, int destPos, int length)
	{
		for (int index = srcPos; index < length + srcPos; index ++ )
		{
			dest[destPos] = src[index];
			destPos ++;
		}
	}

	//��ӡ����Ԫ�صķ���
	static void printArray(double[] arr)
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


	//���÷�������
	public static void main(String[] args)
	{
		double[] srcs = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double[] dests = new double[10];
		
		System.out.println("Դ����:");
		printArray(srcs);
		System.out.println("����ǰĿ������:");
		printArray(dests);
		//����
		//arrayCopy(srcs, 2, dests, 6, 3);
		System.arraycopy(srcs, 2, dests, 6, 3); //ֱ�ӵ���JDK�ײ��д�õķ��� �ɲ�ѯAPI����ȡ����

		System.out.println("��Դ��������λ�� 2 ��ʼ,����Ԫ�ظ���Ϊ 3, ��Ŀ����������λ�� 6 ճ��");
		System.out.println("������Ŀ������:");
		printArray(dests);

	}
}