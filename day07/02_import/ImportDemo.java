//语法格式:  import   需要导入类的全限定名;
//import    包名.子包名.*;   表示会引入该包下的所有的在当前文件中使用到的类.适用于需要导入多个类的时候


import java.util.Arrays;
import java.lang.reflect.Method;


/*
	类的名称:
    类的简单名称:           定义类的名称.  PackageDemo.
    类的全限定名称:       包名.类名;         com._520it.hello.PackageDemo
*/
public class ImportDemo
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{0,5,6,3,7,9,2,6};

		//打印数组
		String a = Arrays.toString(arr);
		System.out.println(a);

		//排序
		Arrays.sort(arr);
		a = Arrays.toString(arr);
		System.out.println(a);

		Method m;
	}
}