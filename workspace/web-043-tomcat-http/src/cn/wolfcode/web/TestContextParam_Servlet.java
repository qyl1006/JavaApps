package cn.wolfcode.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/contextParam")
public class TestContextParam_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//测试-->配置全局初始化参数后的--值获取测试
		System.out.println("service1_值1: " + req.getServletContext().getInitParameter("test_name"));
		System.out.println("service1_值2: " + getServletContext().getInitParameter("test2_name"));
		
		System.out.println("-------------------------------------");
		
		Enumeration<String> names = getServletContext().getInitParameterNames();
		while(names.hasMoreElements()){
			String name = names.nextElement();
			System.out.println(name + "---" + getServletContext().getInitParameter(name));
		}
	}

}
