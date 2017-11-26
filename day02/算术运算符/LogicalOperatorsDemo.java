//逻辑运算符
public class LogicalOperatorsDemo
{
	public static void main(String[] args)
	{	
		/*
			与(&):
			boolean ret = boolean表达式A 与 boolean表达式B.
			当两个boolean表达式都为true,结果才是true, 其它情况ret都为false
			& : 位与
			&& : 短路与

			& 和 &&的区别
			& :如果A表达式为false, 也会判断B表达式, 再返回false
			&&:如果A表达式为false,则不再判断B表达式,直接返回false 

			效率: 短路与效率高 
		*/
		System.out.println(true & true); //true
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		System.out.println("======================");

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("================");

		//System.out.println(false & 1 /0 ==1); // 1 / 0 报错, 说明&会判断B表达式, 所以报错
		System.out.println(false && 1 / 0 ==1); //结果false, 说明 && 短路与 当A表达式false时,不会再去判断表达式B,直接返回false

	}
}