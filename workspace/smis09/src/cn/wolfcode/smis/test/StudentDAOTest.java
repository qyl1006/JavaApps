package cn.wolfcode.smis.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;

//DAO接口的测试类
public class StudentDAOTest {
	private IStudentDAO dao = new StudentDAOImpl();
	
	@Test
	public void testSave(){
		Student stu = new Student(null, "insert", 18, new BigDecimal("110"));
		dao.save(stu);
	}
	
	@Test
	public void testUpdate(){
		Student stu = new Student(3L, "update", 17, new BigDecimal("1220"));
		dao.update(stu);
	}
	
	@Test
	public void testDelete(){
		dao.delete(1L);
	}
	
	@Test
	public void testGet(){
		Student stu = dao.get(3L);
		System.out.println(stu);
	}
	
	@Test
	public void testList(){
		List<Student> list = dao.list();
		list.forEach(System.out::println);
	}
}
