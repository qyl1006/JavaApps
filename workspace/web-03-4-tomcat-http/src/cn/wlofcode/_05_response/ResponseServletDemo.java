package cn.wlofcode._05_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")


@WebServlet("/resp")
public class ResponseServletDemo extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=utf-8"); //设置MIME类型和编码 不然中文会出乱码  iso-8859-1 <---> utf-8
		
		PrintWriter writer = resp.getWriter();
		
		writer.println("hello world!");
		writer.println("你好师姐!");
		writer.println("这是测试响应");
		
	}
}
