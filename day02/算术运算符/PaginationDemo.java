//利用三元运算符进行分页的逻辑
public class PaginationDemo
{
	public static void main(String[] args) 
	{
		/*
			问题:给出一个344条数据,要求每一页最多10条数据,总页数多少?
		*/
		int total_data = 344; //总数据量
		int data = 20;		//每页最多20条数据

		int total_pages = total_data / data == 0 ? total_data / data : total_data / data + 1; //总页数
		System.out.println("总页数:" + total_pages);


		//需要: 计算上一页多少?
		int current_page = 1;// 给出当前页数
		System.out.println("当前页:" + current_page);
		int previous_page = current_page - 1 >= 1 ? current_page - 1 : 1;
		System.out.println("上一页:" + previous_page);
		System.out.println("======================");

		//需求: 计算下一页多少?
		int current_page2 = 18;// 给出当前页数
		System.out.println("当前页:" + current_page2);
		int next_page = current_page2 + 1 <= total_pages ? current_page2 + 1 : total_pages;
		System.out.println("下一页:" + next_page);
	}
}