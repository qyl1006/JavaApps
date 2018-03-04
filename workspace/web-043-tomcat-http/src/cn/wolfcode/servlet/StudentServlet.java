package cn.wolfcode.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Enumeration;
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
public class StudentServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	private IStudentDAO dao;
	
	@Override
	public void init() throws ServletException {
		dao = new StudentDAOImpl();
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//测试-->配置全局初始化参数后的--值获取测试
				System.out.println("service2_值1: " +  getServletContext().getInitParameter("test_name"));
				System.out.println("service2_值2: " + req.getServletContext().getInitParameter("test2_name"));
				
				System.out.println("-------------------------------------");
				
				Enumeration<String> names = getServletContext().getInitParameterNames();
				while(names.hasMoreElements()){
					String name = names.nextElement();
					System.out.println(name + "---" + getServletContext().getInitParameter(name));
				}
		
		
	//--------------------CRUD-----------------------------------------
		req.setCharacterEncoding("utf-8");
		
		String cmd = req.getParameter("cmd");
		System.out.println("test_cmd: " + cmd);
		
		if("delete".equals(cmd)){
			delete(req, resp);
		}else if("edit".equals(cmd)){
			edit(req, resp);
		}else if("saveOrUpdate".equals(cmd)){
			save(req, resp);
		}
		else{
			list(req, resp);
		}
	}
	
	//save
	protected void save(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		System.out.println("编辑/增加tets_id:" + id);
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
//		System.out.println("test_age_String: " + age);
//		Integer i = Integer.valueOf(age);
//		System.out.println("test_String__Integer: " + i);
		
		String salary = req.getParameter("salary");
		String hiredate = req.getParameter("hiredate");
		
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(Integer.valueOf(age));
		
		if(salary != null && salary.length() > 0 ){
			stu.setSalary(new BigDecimal(salary));
		}
		
		if(hiredate != null && hiredate.length() > 0){
			stu.setHiredate(Date.valueOf(hiredate));
		}
		
		if(id != null && id.length() > 0){
			stu.setId(Long.valueOf(id));
			dao.update(stu);
		}else{
			
			dao.save(stu);
		}
		resp.sendRedirect("/student");
	}
	//edit
	protected void edit(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id = req.getParameter("id");
		if(id != null && id.length() > 0 ){
			Student stu = dao.get(Long.valueOf(id));
			req.setAttribute("student", stu);
		}
		req.getRequestDispatcher("WEB-INF/views/student/edit.jsp").forward(req, resp);
	}
	//delete
	protected void delete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		dao.delete(Long.valueOf(req.getParameter("id")));
		resp.sendRedirect("/student");
	}
	//list
	protected void list(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Student> list = dao.list();
		
		req.setAttribute("students", list);
		
		req.getRequestDispatcher("/WEB-INF/views/student/list.jsp").forward(req, resp);
	}
}
