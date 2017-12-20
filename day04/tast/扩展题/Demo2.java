////需求5: 打印所有的水仙花数，所谓水仙花数是指一个三位数[100, 999]，其各位数字的立方之和等于该数本身。 114  == 1^3 + 1^3 + 4^3

//思考: 解决问题得关键是: 如何把一个三位数各拆成 百位上得数 十位上得数 个位上得数 

//测试类
public class Demo2
{
	public static void main(String[] args)
	{
		for (int i = 100;i <= 999;i ++ )
		{
			// 利用两个int相除得整数
			int nnn = i / 100;             // i的百位上的数
			int nn = (i - nnn * 100) / 10; // i的十位上的数

			int n = i % 10;					// i的个位上的数

			if (i == nnn * nnn * nnn + nn * nn * nn + n * n *n)
			{
				System.out.println("水仙花数为" + i);
			}
		}

	}
}
