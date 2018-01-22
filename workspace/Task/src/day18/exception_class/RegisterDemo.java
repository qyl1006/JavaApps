package day18.exception_class;
/*
 * ����û����ظ�
 * 
 * �ܽ�: �����Զ�����쳣��,����ҵ������-->�߼��ϵ��쳣-->���׳��Զ����쳣����ʾ���û�--��ʾ
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
				throw new LogicException(obj + "��ע��");
			}
		}
		System.out.println("ע��ɹ�");
	}
}