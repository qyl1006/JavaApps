package cn.wolfcode.smis.test;
//DAO接口的测试类

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;

public class StudnetDAOTest {
	private IStudentDAO dao = new StudentDAOImpl();
	
	@Test
	public void testSave(){
		Student stu = new Student(null, "BigDecimal", 22, new BigDecimal("10000"));
		dao.save(stu);
	}
	
	@Test
	public void testUpdate(){
		Student stu = new Student(5L, "qyl", 17, new BigDecimal("110"));
		dao.update(stu);
	}
	
	@Test
	public void testDelete(){
		dao.delete(1L);
	}
	
	@Test
	public void testGet(){
		Student stu = dao.get(2L);
		System.out.println(stu);
	}
	
	@Test
	public void testList(){
		List<Student> list = dao.list();
		list.forEach(System.out::println);
	}
}
