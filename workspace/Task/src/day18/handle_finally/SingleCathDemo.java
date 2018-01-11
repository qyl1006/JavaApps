package day18.handle_finally;
/*演示使用try--catch来捕捉单个异常
 * 总结:  try-catch语法格式:
 * 		try{
 * 			编写可能会出现的异常代码
 * 			)catch(异常类型 e){
 * 				处理异常的代码
 *				//记录日记//打印异常信息//继续抛出异常
 * 			}
 * 		
 */
public class SingleCathDemo {
	public static void main(String[] args) {
		try{
			int i = 10 / 0;
			System.out.println(i);
		}catch(ArithmeticException e){
			System.out.println("除数不能为零");
		}
	}
}
