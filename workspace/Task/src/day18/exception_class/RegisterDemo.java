package day18.exception_class;
/*
 * 检查用户名重复
 * 
 * 总结: 利用自定义的异常类,根据业务需求-->逻辑上的异常-->来抛出自定义异常类显示给用户--提示
 */

public class RegisterDemo {
	private static Object[] value = new Object[]{"Will", 12306,};
	public static void main(String[] args) {
		try{
			RegisterDemo.test(12306);
		}catch(LogicException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void test(Object obj){
		for(Object name : value){
			if(name.equals(obj)){
				throw new LogicException(obj + "已注册");
			}
		}
		System.out.println("注册成功");
	}
}
