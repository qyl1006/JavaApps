package day18.exception_class;
/*
 * �Զ����쳣��
 * 
	�ܽ�: Java�в�ͬ���쳣��,�ֱ��ʾ��ĳһ�־�����쳣���,��ô�ڿ�����������Щ�쳣�����SUNû�ж���õ�,��ʱ���Ǹ����Լ�ҵ����쳣����������쳣��.

 */

public class LogicException extends RuntimeException {

	public LogicException() {
		super();
	}

	public LogicException(String message) {
		super(message);
	}
	public LogicException(String message, Throwable cause) {
		super(message, cause);

	}
	
}
