package cn.wolfcode.smis.test;

import java.sql.ResultSet;
import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;
import cn.wolfcode.smis.handler.IResultSetHandler;
import cn.wolfcode.smis.util.JdbcTemplate;

//4) 生成一个测试类,用于测试DAO接口中每个方法
public class StudentDAOTest {
	private IStudentDAO dao = new StudentDAOImpl();
	
	
	@Test
	public void testSave(){
		Student stu = new Student(null, "123insert", 17);
		dao.save(stu);
	}
	
	@Test
	public void testUpdate(){
		Student stu = new Student(1L, "555update", 22);
		dao.updata(stu);
	}
	
	@Test
	public void testDelete(){
		dao.delete(5L);
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
	
	@Test
	public void testCount(){
		String sql = "select count(id) from test";
		Integer count = JdbcTemplate.query(sql, new IResultSetHandler<Integer>() {
			public Integer handler(ResultSet rs) throws Exception {
				rs.next();
				return rs.getInt(1);
			}
		});
		System.out.println(count);
	}
}
