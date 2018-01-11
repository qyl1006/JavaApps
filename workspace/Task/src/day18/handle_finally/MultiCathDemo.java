package day18.handle_finally;
/*
 * 演示捕捉多个异常
 * 总结:  try-catch语法格式:
 * 		try{
 * 			编写可能会出现的异常代码
 * 			)catch(异常类型 e){
 * 				处理异常的代码
 *				//记录日记//打印异常信息//继续抛出异常
 * 			}
      注意:   出现异常之后,程序会中断,所以必须处理异常.
      		代码执行流程问题,, 任何东西都是有它自有规律-->这里就是代码执行步骤 原则
 */

public class MultiCathDemo {
	public static void main(String[] args) {
		try{
			System.out.println(10 / 0);
		}catch (ArithmeticException e){
			System.out.println("除数不能为零");
		}catch(NullPointerException e){
			System.out.println("这里编写处理异常的代码 如打印信息给用户或打印详细信息调试用");	
		}
	}
}
