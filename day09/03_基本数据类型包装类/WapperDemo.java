//包装类的操作----Integer类
public class WapperDemo
{
	public static void main(String[] args)
	{
		//十进制转换二进制
		System.out.println(Integer.toBinaryString(78)); //十进制转换二进制 1001

		//十进制转换十六进制
		System.out.println(Integer.toHexString(78));// 4e
		
		//十进制转换八进制
		System.out.println(Integer.toOctalString(78));


	}


// Integer与int 不是相同的数据类型
	public void abc(int q)
	{
	}

	/*
	public void abc(int q)
	{
	}
	*/  

	public void abc(Integer q)
	{
	}

}