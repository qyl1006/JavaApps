package task;

public class ClassTask {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		//获取字节码对象三种方式
		Class<Test2> clz = Test2.class; // 1
		
		Test2 t = new Test2();
		Class<?> clz2 = t.getClass();
		
		Class<?> clz3 = Class.forName("task.Test");
		
		Object obj = clz.getMethod("test", String.class).invoke(clz.newInstance(), "123");
		System.out.println(obj);
	}
}


class Test{
	
	public void test(){
		System.out.println("无参数方法");
	}
	public String test(String str){
		return "有一个参数方法, 参数为:" + str;
	}
	public void test(String str, Integer num){
		System.out.println("有两个参数方法, 参数为:" + str + "-" + num);
	}
	
	@SuppressWarnings("unused")
	private void test2(){
		System.out.println("无参数的私有方法");
	}
	
}