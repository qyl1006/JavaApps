//�ж�������һ��
//����
class WuZiQi
{

	public static void wuZi1(int[][] arr)
	{
		for (int index = 0;index <= 4; index ++ )
		{
			if (arr[index][0] == arr[0][0])
			{
				arr[0][0] ++;
				System.out.println("X��");
				
			}else
			{
				System.out.println("X-1");
				
				
				return;
			}
			
		}
	}

	public static void wuZi2(int[][] arr)
	{
		for (int index = 0;index <= 4 ; index ++ )
		{
			if (arr[index][1] == arr[0][1])
			{
				arr[0][1] ++;
				System.out.println("Y��");
				
			}else
			{
				System.out.println("Y-1");
				return;
			}
		}
	}

}

//��ʾ������
public class WuZiQiDemo

{

	public static void main(String[] args)
	{
		int[][] arr = new int[][]{
						{0, 0},
						{1, 1},
						{2, 2},
						{3, 3},
						{4, 8}
		};
		WuZiQi.wuZi1(arr);
		WuZiQi.wuZi2(arr);

	}

}
