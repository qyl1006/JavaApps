/*
	����: ʹ����ǿforѭ��������ӡ����Ԫ��
*/

//������
public class ForEachDemo
{
	public static void main(String[] args)
	{
		//����
		int[] arr = new int[]{1, 2, 3, 4, 5, 6};	

		//��ǿforѭ��
		for(int a : arr )
		{
			System.out.println(a);
		}

		System.out.println("=================================");
		//��ά����
		int[][] arrs = new int[][]{
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9},
			{10, 11}
		};

		

		//��ǿforѭ����ά����
		for(int[] i : arrs)     //i Ϊ��ά�����е� ����һά����������ڴ�ռ���ڴ��ֵַ 
		{                        // ��ʵ����ͨ�������Բ�������һά����Ķ���洢��ֵ
			for (int ii : i)
			{
				System.out.println(ii);
			}
		}
	}
}

//�ܽ�: ��ǿforѭ�����ܲ������������, ����˵�����Ҫ��������Ļ�,��Ӧ��ʹ��forѭ��