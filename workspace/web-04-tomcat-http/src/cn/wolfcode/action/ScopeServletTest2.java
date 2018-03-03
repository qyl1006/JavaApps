package cn.wolfcode.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/scope2")
public class ScopeServletTest2 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	Integer temp = 0;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("第二个页面 " + temp++);
		//分别拿到第一个页面的三个作用域的数据,响应输出打印
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("<br/>request: " + req.getAttribute("test_request"));
		writer.println("<br/>session: " + req.getSession().getAttribute("test_session"));
		writer.println("<br/>context: " + req.getServletContext().getAttribute("test_context"));
	}

}
