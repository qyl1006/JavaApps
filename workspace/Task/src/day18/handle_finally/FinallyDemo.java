package day18.handle_finally;
/*
 * ��ʾ fianlly��ʹ�ü�����
 * �ܽ�: finally�������﷨:
  1):try...finally: ��ʱû��catch�������쳣,��Ϊ��ʱ����Ӧ�ó���,���ǻ��׳��쳣,�Լ�������.
  2):try...catch....finally:������Ҫ�����쳣,���ջ��ùر���Դ.

		ע��:finally���ܵ���ʹ��.
		finally�����ʾ���ն���ִ�еĴ���,������û���쳣.

 */
public class FinallyDemo {
	public static void main(String[] args) {
		try{
			System.out.println("���ܻ������쳣��ִ�д���");
		}catch(ArithmeticException e){
			System.out.println("catch(�쳣����(�쳣��/�Զ����) e)");
		}finally{
			System.out.println("�ô������ ������ľ���쳣����ֹͣ,����JVMֹͣ");
		}
		
	}
}
