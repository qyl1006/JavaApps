//���� ��ά������Ŀ�����

class A
{
	private Integer[][] arr;

	A(Integer[][] arr)
	{
		this.arr = arr;
	}

}



//
public class Test
{
	public static void main(String[] args)
	{
		int[][] arr = new int[][]{
			{1, 5},
			{2}
		};
		A a = new A(arr);
	}
}
