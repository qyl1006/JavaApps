package cn.wolfcode.smis.test;
//DAO接口的测试类

import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;

public class StudentDAOTest {
	private IStudentDAO dao = new StudentDAOImpl();
	
	@Test
	public void testSave(){
		Student stu = new Student(null, "Will", 22);
		dao.save(stu);
	}
	
	@Test
	public void testUpdate(){
		Student stu = new Student(1L, "QYL", 17);
		dao.update(stu);
	}
	
	@Test
	public void testDelete(){
		dao.delete(1L);
	}
	
	@Test
	public void testGet(){
		Student stu = dao.get(1L);
		System.out.println(stu);
	}
	
	@Test
	public void testList(){
		List<Student> list = dao.list();
		list.forEach(System.out::println);
	}
}	
