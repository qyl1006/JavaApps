package cn.wolfcode.smis.test;
/*
 * 第六步 生成一个DAO接口的测试类
 */

import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;

public class StudentDAOTest {
	//面向接口编程
	private IStudentDAO dao = new StudentDAOImpl();
	
	@Test  //测试增加数据的方法
	public void testSave(){
		Student stu = new Student(null, "test小明", 19);
		dao.save(stu);
	}
	
	@Test //测试更新数据的方法
	public void testUpdate(){
		Student stu = new Student(1L, "update", 22);
		dao.update(stu);
	}
	
	@Test  //测试删除数据的方法
	public void testDelete(){
		dao.delete(5L);
	}
	
	@Test  //测试返回一条数据的方法
	public void testGet(){
		Student stu = dao.get(2L);
		System.out.println(stu);
	}
	
	@Test  //测试 返回全部数据的 方法
	public void testList(){
		List<Student> list = dao.list();
		list.forEach(System.out::println);
	}
	
}
