/** if-else结构
	语法:	if(boolean表达式){
				 条件执行体A
			}else{
				 条件执行体B
			}

	需求: 求最大值最少值
*/

//测试类
public class IfElseDemo
{
	public static void main(String[] args)
	{
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

/*总结: 从语义上二者的含义相同.
			从本质上说,if-else是语句结构,三元运算符是一种运算符号.
			三元 运算符必须有一个结果,表达式必须有结果,必须有返回.
			而if-else,不能返回什么结果,只能控制语句的结构.
 
*/