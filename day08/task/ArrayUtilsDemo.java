/*
	//��ӡ���� ˼·: ����������Ҫ��ӡ�Ľ��Ϊ{a, b, c..}��ʽ��,---String�ַ���----1) ����һ��String�ַ��� 2)forѭ����������,
						ʹÿ��Ԫ����֮ǰ�����String�ı������һ�����ַ���,֮���ӡ
	
	������������  ˼·: �ڶ���ķ������¶���һ��������������ԭ������������ĸ���Ԫ��,��ΪҪ�������ʱ������������,������Ҫ���Ÿ�ֵ.
*/

//������
public class ArrayUtilsDemo
{
	public static void main(String[] args)
	{
		//���� ��ӡ����
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		arrayPrint(arr);

		//������������
		int[] arrs = arrayReverseOrder(arr);
		arrayPrint(arrs);
		
	}

	//�����ӡ����
	public static void arrayPrint(int[] arr)
	{
		if (arr == null)
		{
			System.out.println("������Ϊ������null");
		}else
		{
			String s = "{";
			for (int i = 0;i < arr.length ;i ++ )
			{
				if (i == arr.length - 1)
				{
					s += arr[i] + "}";
				}else
				{
					s += arr[i] + ", ";
				}
			}
			System.out.println(s);
		}

	}

	//������������Ԫ�ط���
	public static int[] arrayReverseOrder(int[] arr)
	{
		int[] newArray = new int[arr.length];
		for (int i = 0 ; i < arr.length;i ++ )
		{
			newArray[arr.length - 1 - i] = arr[i];
		}
		return newArray;
	}
}