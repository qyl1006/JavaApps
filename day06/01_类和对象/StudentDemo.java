//创建描述学生对象的类?
class Student
{
	String name;
	int age;
	boolean ifPayment;

	void payment()
	{
		ifPayment = true;
		int a = 110;
		System.out.println(a);
	}
}


//测试类
public class StudentDemo
{
	public static void main(String[] args)
	{
		//创建4个Student类对象
		Student s1 = new Student();
		s1.name = "小明";
		s1.age = 13;

		Student s2 = new Student();
		s2.name = "张三";
		s2.age = 12;
		s2.ifPayment = true;

		Student s3 = new Student();
		s3.name = "李四";
		s3.age = 13;
		s3.ifPayment = true;

		Student s4 = new Student();
		s4.name = "王麻子";
		s4.age = 13;

		//创建一个数组存储Student类对象
		Student[] arr = new Student[]{s1, s2, s3, s4};
		
		//判断每个学生缴费情况, 没有缴费的调用方法payment()缴费
		for (Student ele : arr)
		{
			if (!ele.ifPayment)
			{
				ele.payment();
				
			}
			System.out.println(ele.ifPayment);
			//int b = ele.payment(); //每个方法都有一个栈帧 所以main栈帧需要变量接收payment栈帧return变量a的值 ------内存模型
			
			ele.payment();
		}
		
		//分析JAVA内存模型里它们发生了什么...
		System.out.println("==================");
		//这个说明数组的元素就是对应元素所用的内存空间的地址值
		System.out.println(s1);
		System.out.println(arr[0]);  

		//这个说明数组的操作与对象的操作 都是操作地址值所对应的内存空间
		s1.name = "test";  
		System.out.println(arr[0].name);
		arr[0].name = "test02";
		System.out.println(s1.name);

	}
}