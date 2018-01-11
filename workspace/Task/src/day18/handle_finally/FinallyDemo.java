package day18.handle_finally;
/*
 * 演示 fianlly的使用及特性
 * 总结: finally的两种语法:
  1):try...finally: 此时没有catch来捕获异常,因为此时根据应用场景,我们会抛出异常,自己不处理.
  2):try...catch....finally:自身需要处理异常,最终还得关闭资源.

		注意:finally不能单独使用.
		finally语句块表示最终都会执行的代码,无论有没有异常.

 */
public class FinallyDemo {
	public static void main(String[] args) {
		try{
			System.out.println("可能会会出现异常的执行代码");
		}catch(ArithmeticException e){
			System.out.println("catch(异常类型(异常类/自定义的) e)");
		}finally{
			System.out.println("该处代码块 不管有木有异常都会停止,除非JVM停止");
		}
		
	}
}
