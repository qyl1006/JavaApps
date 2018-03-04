package cn.wolfcode.web.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IStudentDAO dao;
	
	public void init() throws ServletException {
		dao = new StudentDAOImpl();
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String cmd = req.getParameter("cmd");
		if("delete".equals(cmd)){
			delete(req, resp);
		}else if("edit".equals(cmd)){
			edit(req, resp);
		}else if("saveOrUpdate".equals(cmd)){
			saveOrUpdate(req, resp);
		}
		else{
			list(req, resp);
		}
		
	}
	
	//list
	protected void list(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Student> list = dao.list();
		req.setAttribute("students", list);
		
		req.getRequestDispatcher("/WEB-INF/views/student/list.jsp").forward(req, resp);
	}
	
	protected void delete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		dao.delete(Long.valueOf(req.getParameter("id")));
		
		resp.sendRedirect("/student");
		
	}
	protected void edit(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id = req.getParameter("id");
		if(id != null && id.length() > 0){
			Student stu = dao.get(Long.valueOf(id));
			req.setAttribute("stu", stu);
		}
		
		req.getRequestDispatcher("/WEB-INF/views/student/edit.jsp").forward(req, resp);
		
	}
	protected void saveOrUpdate(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String salary = req.getParameter("salary");
		String hiredate = req.getParameter("hiredate");
		
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(Integer.valueOf(age));
		stu.setSalary(new BigDecimal(salary));
		stu.setHiredate(Date.valueOf(hiredate));
		
		if(id != null && id.length() > 0){
			stu.setId(Long.valueOf(id));
			dao.update(stu);
		}else{
			dao.save(stu);
		}
		
		resp.sendRedirect("/student");
	}

}
