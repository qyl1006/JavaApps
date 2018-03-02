package cn.wolfcode.smis.test;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;

public class StudentDAOTest {
	private IStudentDAO dao = new StudentDAOImpl();
	
	@Test
	public void testSave() {
		Student stu = new Student(null, "insert", 18, new BigDecimal("10086"), Date.valueOf("1111-11-11"));
		dao.save(stu);
	}

	@Test
	public void testUpdate() {
		Student stu = new Student(1L, "update", 18, new BigDecimal("10086"), Date.valueOf("1111-11-11"));
		dao.update(stu);
		
	}

	@Test
	public void testDelete() {
		dao.delete(2L);
	}

	@Test
	public void testGet() {
		Student stu = dao.get(1L);
		System.out.println(stu);
	}

	@Test
	public void testList() {
		List<Student> list = dao.list();
		list.forEach(System.out::println);
	}

}
