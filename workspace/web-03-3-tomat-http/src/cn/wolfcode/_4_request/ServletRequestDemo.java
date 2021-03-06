package cn.wolfcode._4_request;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(value=("/req"), initParams={@WebInitParam(name="pwd", value="test")})
public class ServletRequestDemo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//req.setCharacterEncoding("utf-8");
		
		//getRequestURI:返回请求行中的资源名字部分:如/test/index.html
		System.out.println("URI: " + req.getRequestURI());// 返回String类型
		
		//getRequestURL:返回浏览器地址栏中的所有信息
		System.out.println("URL: " + req.getRequestURL());// 返回StringBuffer类型
		
		
		//getContextPath:获取当前项目的上下文路劲<Context />元素的path属性值
		System.out.println("Context: " + req.getContextPath());
		
		//getRemoteAddr:返回发出请求的客户机的IP地址
		System.out.println("IP: " + req.getRemoteAddr());
		System.out.println("host: " + req.getRemoteHost());
		System.out.println("port端口: " + req.getRemotePort());
		System.out.println("User: " + req.getRemoteUser());
		

		//String getParameter(String name):返回指定名字参数的值。
		System.out.println("用户名: " + req.getParameter("username"));
		System.out.println("密码: " + req.getParameter("pwd"));
		System.out.println("城市: " + req.getParameter("city"));
		
		//String[] getParameterValues(String name):返回指定名字参数的多个参数值。
		System.out.println("返回指定名字参数的多个参数值:");
		String[] parameterValues = req.getParameterValues("gender");
		System.out.println(Arrays.toString(parameterValues));
		
	//	Enumeration<String> getParameterNames():返回所有参数名的Enumeration对象
		System.out.println("-------------分割线--------");
		Enumeration<String> parameterNames = req.getParameterNames();
		while(parameterNames.hasMoreElements()){
			String nextElement = parameterNames.nextElement();
			System.out.println("request: " + nextElement + " - " + getInitParameter(nextElement));
			
		}
		
		//Map<String,String[]> getParameterMap():返回所有的参数和值所组成的Map对象
	}
}
