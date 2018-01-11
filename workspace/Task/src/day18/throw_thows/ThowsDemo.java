package day18.throw_thows;
/*
 * 演示: throws的使用
 * 总结: throws: 运用于方法声明之上,用于表示当前方法不处理异常,而是提醒该方法的调用者来处理异常(抛出异常).
		RuntimeException是运行异常,建议throws这里 省事 方便
 */

public class ThowsDemo {
	public static void main(String[] args) {
		try{
			System.out.println(Test1.test(10 , 0));
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}

class Test1{
	public static int test(int a, int b) throws ArithmeticException{
		return a / b;
	}
}