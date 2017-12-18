/*
	1) 三元运算符，表示有三个元素参与的表达式，所以又称为三目运算符，其语义表示if-else.
		重点:	语法格式：X  ?  Y ：Z， 及 解决问题的思考过程 思维
		其中x为boolean类型表达式，先计算X的值，若X结果为true则整个三目运算表达式的结果是Y，否则就是Z。三目运算符结果的类型由Y和Z决定。
	2) if语句

	需求: 用以上两种 语法结构 解决 总页数 上一页 下一页 问题
	PS:  使用三元运算可能无法解决当前页大于 总页数 或 小于 总页数的情况 可 使用 if 控制解决

	总结: 记住 语法格式
*/

//测试类
public class TernaryOperatorDemo
{
	public static void main(String[] args)
	{

		//三元运算 语句
		//总页数
		int i = 100; //总数量
		int m = 15; // 每页最多的数量

		int j = i % m == 0 ? i / m : i / m + 1;
		System.out.println("总页数: " + j);

		//上一页
		int n = 7; //当前页 
		
		int ii = n - 1 > 0 ? n - 1 : n;
		System.out.println("上一页: " + ii);

		//下一页
		int iii = n < j ? n + 1 : n;
		System.out.println("下一页: " + iii);

		System.out.println("===============");
		//if 语句

		///判断最大值
		int a = 20;
		int b = 100;

		if (a > b)
		{
			System.out.println("最大值是:" + a);
		}
		else
		{
			System.out.println("最大值是:" + b);
		}

		//需要: 计算分页数
		int totalData = 3423;  //总数据量
		int data = 50;  //每页最多的数据量
		int totalPages; //总页数

		if (totalData % data == 0)
		{
			totalPages = totalData / data;
		}
		else
		{
			totalPages = totalData / data + 1;
		}
		System.out.println("总页数:" + totalPages);

		//需要: 计算上一页 和 下一页
		int currentPage = 18; //当前页
		int previousPage; //上一页
		int nextPage;     //下一页
		// 计算上一页
		if (currentPage <= totalPages)
		{
			if (currentPage - 1 >= 1)
			{
				previousPage = currentPage - 1;
			}
			else
			{
				previousPage = 1;
			}
			//计算下一页
			if (currentPage + 1 <= totalPages)
			{
				nextPage = currentPage + 1;
			}
			else
			{
				nextPage = totalPages;
			}
			System.out.println("当前页为:" + currentPage);
			System.out.println("上一页为:" + previousPage);
			System.out.println("下一页为:" + nextPage);
		}
		else
		{
			System.out.println("报错:当前页大于总页数");
		}
	}
}