/*
	boolean���ͣ�ͨ�������߼�����ͳ������̿���(����ѡ��/ѭ��)

	����: ��ʾboolean�÷�

*/

//��ʾ��
public class BooleanDemo
{
	public static void main(String[] args)
	{
		int[] arrs = new int[]{1, 2, 3, 4, 5, 119, 120, 110, 12306};
		
		//��ʾboolean���÷�
		Test.print(arrs);

	}
}

//������
class Test
{
	//���徲̬����
	public static void print(int[] arr)
	{
		int i = 0; //ͳ��ѭ������
		for (int index = 0; index < arr.length; index ++ )
		{
			if (arr[index] == 110) //booleanΪtrue ����
			{
				System.out.println(arr[index]);
			}
			i ++;
			
		}
		System.out.println("ѭ������: " + i);
	}
}

/*
	�ܽ�: false��true��boolean�ĳ���  ���ܸ�ֵ������ֵ��boolean ���򱨴�
*/