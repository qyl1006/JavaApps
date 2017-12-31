package com._520it._03abnormal;


//自定义异常类  用户已注册异常
public class AbnormalDemo extends RuntimeException{

	public AbnormalDemo(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AbnormalDemo(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AbnormalDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
