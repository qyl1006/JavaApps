package cn.wolfcode._5_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resp")
public class ResponseServletDemo extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = resp.getWriter();
		writer.println("Hello");
		writer.println("Java");
		writer.println("你好");
		writer.println("师姐");
		
	}
}
