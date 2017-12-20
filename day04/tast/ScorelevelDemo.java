/** 成绩案例
		需求: 分别查询语文 数学 英语得成绩.[100 90]优 (90 80]良 (80 60]及格 其它不及格
	    解决:  利用接口来实现
*/



//查询接口规范
interface Querys
{
	void print();
}

//语文成绩查询实现类
class Language implements Querys
{
	public void print()
	{
		System.out.println("语文成绩为:");
	}
}

//数学成绩查询实现类
class Mathematics implements Querys
{
	public void print()
	{
		System.out.println("数学成绩为:");
	}
}

//英语成绩查询实现类
class Englist implements Querys
{
	public void print()
	{
		System.out.println("英语成绩为:");
	}
}

//成绩查询
class Results
{
	public static void pass(Querys q, int num)
	{
		q.print();

		//成绩判断 if-elseif-else结构语句
		if (num >= 90)
		{
			System.out.println("优秀");
		}
		else if (num >= 80)
		{
			System.out.println("良好");
		}
		else if (num >= 60)
		{
			System.out.println("及格");
		}
		else 
		{
			System.out.println("不及格");
		}
	}
}


//测试类
public class ScorelevelDemo
{
	public static void main(String[] args)
	{
		//英语成绩查询
		Querys q1 = new Englist();
		Results.pass(q1, 56);

		//数学成绩查询
		Querys q2 = new Mathematics();
		Results.pass(q2, 79);

		//语文成绩查询
		Querys q3 = new Language();
		Results.pass(q3, 89);
	}
}


