package day18.throw_thows;
/*
 * ��ʾ: throws��ʹ��
 * �ܽ�: throws: �����ڷ�������֮��,���ڱ�ʾ��ǰ�����������쳣,�������Ѹ÷����ĵ������������쳣(�׳��쳣).
		RuntimeException�������쳣,����throws���� ʡ�� ����
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