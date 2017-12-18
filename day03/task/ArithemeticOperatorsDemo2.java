/*
	test ++ --
	++和--详解: 都只能操作变量,不能操作常量.
			++: 表示当前操作变量自己累加1.
			--:   表示当前操作变量自己减去1.
			--------------------------------------------------------------------
			自增：++，递增操作符，使变量值增加1，有前置和后置之分，只能操作变量。
			自减： -- ，递减操作符，使变量值减去1，有前置和后置之分，只能操作变量。
			自增和自减具体操作是一样的，仅仅是一个是加1，一个是减1而已，现在单讲++：
			代码 result ++和 ++result，都将使result变量的值加1。
			唯一的区别是：
			前置（++result）:   表示对result加1之后的结果进行运算，
			后置（result++）:   表示对result变量加1之前的值（原始值）进行运算。
			如果仅仅执行简单的递增操作（只写result++或++result），那么选用任意一个都可以。

	
	需求: Test 
*/

//演示类
public class ArithemeticOperatorsDemo2
{
	public static void main(String[] args)
	{
		int i = 5;
		i++;
		System.out.println("i= " + i);// 6
		++i;
		System.out.println("i= " + i);// 7

		int a = ++i;
		System.out.println("a= " + a);// 8
		System.out.println("i= " + i);// 8
		int b = i++;
		System.out.println("b= " + b);// 9 错误  正确是8  后++ 做运算的是原值
		System.out.println("i= " + i);// 9
		
		//测试 打印 操作 是否 使用 原始值 运算?
		int iii = 10;
		System.out.println(iii ++); // 10 证明 打印动作 属于运算  
		iii ++;  //  iii = 11 在加1
		System.out.println(iii); // 12

		
	}
}

//总结: 唯一需要注意的地方就是 后置 ++ 或-- 它是先自身 增1 或 减 1 但用之前的原始值来做运算 例如 赋值运算 打印运算等 