package cn.wlofcode._04_request;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/req")
public class RequestServletDemo extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//解决POST方式中文乱码问题
		req.setCharacterEncoding("utf-8");//Tomcat服务器(老外写的)编码格式为: iso-8859-1
		
	//	getRequestURI:返回请求行中的资源名字部分:如/test/index.html
		System.out.println("资源名: " + req.getRequestURI());
		
	//	getRequestURL:返回浏览器地址栏中的所有信息
		System.out.println("浏览器地址栏中的所有信息: " + req.getRequestURL());
		
	//	getContextPath:获取当前项目的上下文路劲<Context />元素的path属性值
		System.out.println("上下文元素path属性值: " + req.getContextPath());
		
	//	getRemoteAddr:返回发出请求的客户机的IP地址
		System.out.println("客户机IP/浏览器的: " + req.getRemoteAddr());
		

	//	String getParameter(String name):返回指定名字参数的值。
		System.out.println("用户名: " + req.getParameter("username"));
		System.out.println("密码: " + req.getParameter("pwd"));
		System.out.println("手机: " + req.getParameter("phoneNumber"));
		System.out.println("性别: " + req.getParameter("gender"));
		System.out.println("城市: " + req.getParameter("city"));
		System.out.println("Text文本: " + req.getParameter("onfo"));
		
		
	//	String[] getParameterValues(String name):返回指定名字参数的多个参数值。
		String[] values = req.getParameterValues("hobby");
		System.out.println("爱好: " + Arrays.toString(values));
	}

}
