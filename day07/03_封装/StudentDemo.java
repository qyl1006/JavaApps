//理解封装的概念
class Student
{
	String name;
	private int age;

	int set(int i)
	{
		if (i < 0)
		{
			System.out.println("年龄不能为负数");
		}
		age = i;
		return age;
	}
	
}


//演示类
public class StudentDemo
{
	public static void main(String[] args)
	{
		Student a = new Student();
		a.name = "小明";
		a.set(-17);
		//System.out.println(a.name + " , " + a.age);
		System.out.println(a.set(17));
	}
}