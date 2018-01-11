package day18.throw_thows;
/*
 * 演示 thow的使用
 * 总结:     throw:   运用于方法内部,用于给调用者返回一个异常对象,和return一样会结束当前方法.
			throw语句:
		  运用于方法内部,抛出一个具体的异常对象.
		                throw  new  异常类("异常信息"); 终止方法.

		一般的,当一个方法出现不正常的情况的时候,我们不知道该方法应该返回什么,此时就返回一个错误,在catch语句块中继续向上抛出异常.
   			return 是返回一个值,throw 是返回一个错误,返回给该方法的调用者
 */
public class ThowDemo {
	public static void main(String[] args) {
		try{
			System.out.println(Test.test(10 , 0));
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}

class Test{
	public static int test(int a, int b){
		if(b == 0){
			
			throw new ArithmeticException("不能为零");
		}
		return a / b;
	}
}