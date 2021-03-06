package cn.wolfcode._1_hello;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("你好! 师姐!"); 
		
		System.out.println("测试init初始化参数作用域: "); //已证明作用域
		System.out.println(getServletName()); //获取<servlet-name> 中的名字
		System.out.println(getInitParameter("name")); //  获取初始化参数的值
		System.out.println("密码:" + getInitParameter("pwd")); //获取初始化参数的值.
		
		Enumeration<String> names = getInitParameterNames();  //获取所有的参数名.
		while(names.hasMoreElements()){
			String nextElement = names.nextElement();
			System.out.println(nextElement + ": " + getInitParameter(nextElement));
		}
	}
}
