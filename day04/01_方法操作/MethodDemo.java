public class MethodDemo
{
	//���巽��
	static void common()
	{
		System.out.println("200�й�ͬ����");
	}


	public static void main(String[] args)
	{
		System.out.println("����Ƭ��A");
		MethodDemo.common();  // ���÷���

		System.out.println("����Ƭ��B");
		Common.common();   // ���÷���

		System.out.println("����Ƭ��C");
		

		System.out.println("����Ƭ��D");
		
	}
}