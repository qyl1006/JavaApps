/*
	需求: 创建四个学生对象存放到数组中，遍历数组中的学生对象对未缴学费的学生调用其缴费的方法
	
	步骤: 1 定义一个Student类,里面有学生的姓名 年龄等字段, 并定义缴费的方法
          2  创建4个学生对象 定义一个数组用于存放
		  3  遍历数组--->for循环每个学生对象---->if判断是否缴费--->调用方法缴费
			
*/
//定义学生类
class Student
{
	String name; //姓名
	int    age;   //年龄
	boolean ifPay; //缴费状态  默认初始化false

	//缴费方法--
	void payment()
	{
		ifPay = true;// -----> 更改ifPay状态(boolean)
	}
}


//测试类
public class StudentDemo
{
	public static void main(String[] args)
	{
		//创建四个学生对象 ifPay状态使用默认初始化的false
		Student s1 = new Student();
		s1.name = "小明";
		s1.age = 12;

		Student s2 = new Student();
		s2.name = "张三";
		s2.age = 14;

		Student s3 = new Student();
		s3.name = "李琳";
		s3.age = 11;

		Student s4 = new Student();
		s4.name = "李四";
		s4.age = 12;

		//创建一个数组 并存放学生对象
		Student[] arr = new Student[]{s1, s2, s3, s4};

		//遍历数组并判断是否缴费---->若false---->调用方法缴费
		
		for (int i = 0;i < arr.length ; i ++)
		{
			System.out.println("姓名: " + arr[i].name + " 年龄: " + arr[i].age + " 缴费状态:"+ arr[i].ifPay);
			if (!arr[i].ifPay)
			{
				arr[i].payment();
			}
			System.out.println("姓名: " + arr[i].name + " 年龄: " + arr[i].age + " 缴费状态:"+ arr[i].ifPay);
		}
		
	}
}

//z总结: 定义数组接收存放Student对象时,需要注意元素类型为Student