package day18.throw_thows;
/*
 * ��ʾ thow��ʹ��
 * �ܽ�:     throw:   �����ڷ����ڲ�,���ڸ������߷���һ���쳣����,��returnһ���������ǰ����.
			throw���:
		  �����ڷ����ڲ�,�׳�һ��������쳣����.
		                throw  new  �쳣��("�쳣��Ϣ"); ��ֹ����.

		һ���,��һ���������ֲ������������ʱ��,���ǲ�֪���÷���Ӧ�÷���ʲô,��ʱ�ͷ���һ������,��catch�����м��������׳��쳣.
   			return �Ƿ���һ��ֵ,throw �Ƿ���һ������,���ظ��÷����ĵ�����
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
			
			throw new ArithmeticException("����Ϊ��");
		}
		return a / b;
	}
}