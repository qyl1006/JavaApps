package cn.wlofcode._02_init;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyInitServlet extends HttpServlet {
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		
		System.out.println("01" + getServletName());
		System.out.println("021" + getInitParameter("name"));
		System.out.println("022" + getInitParameter("test"));
		
		Enumeration<String> names = getInitParameterNames();
		while(names.hasMoreElements()){
			String name = names.nextElement();
			System.out.println(name + "--" + getInitParameter(name));
		}
		
		
		
	}
}
