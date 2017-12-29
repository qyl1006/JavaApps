/*
	需求:定义一个发送信息的方法
			返回参数: 1 表示   发送成功
					  0  表示  发送失败	
					  -1  表示 信息已查阅
*/					  	

//自定义
class Test
{
	public int message(int i, String s)
	{
		//TODO
		System.out.println("信息内容: " + s + " 接收人:" + i + " 状态:成功");
		return 1;
	}
}

//测试类
public class SendMessageDemo
{
	public static void main(String[] args)
	{
		//调用方法
		new Test().message(10086, "错过");
	}
}