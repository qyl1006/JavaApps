package cn.wolfcode.smis.test;

import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;

/*
 * 生成一个OAD接口的测试类
 */
public class StudentDAOTest {
	private IStudentDAO dao = new StudentDAOImpl();
	
	@Test
	public void testSave(){
		Student stu = new Student(null, "11insert", 17);
		dao.save(stu);
	}

	@Test
	public void testUpdate(){
		Student stu = new Student(7L, "update", 12345);
		dao.update(stu);
	}
	
	@Test
	public void testDelete(){
		dao.delete(7L);
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
