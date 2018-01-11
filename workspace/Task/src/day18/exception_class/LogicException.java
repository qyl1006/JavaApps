package day18.exception_class;
/*
 * 自定义异常类
 * 
	总结: Java中不同的异常类,分别表示着某一种具体的异常情况,那么在开发中总是有些异常情况是SUN没有定义好的,此时我们根据自己业务的异常情况来定义异常类.

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
