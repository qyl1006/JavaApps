package cn.wolfcode.smis.test;
//创建一个DAO接口的测试类

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.dao.impl.StudentDAOImpl;
import cn.wolfcode.smis.domain.Student;
import cn.wolfcode.smis.util.JdbcUtil;
import lombok.Cleanup;

public class StudentDAOTest {
	private IStudentDAO dao = new StudentDAOImpl();

	@Test
	public void testSave() {
		Student stu = new Student(null, "1122insert", 17);
		dao.save(stu);
	}

	@Test
	public void testUpdate() {
		Student stu = new Student(5L, "555update", 18);
		dao.update(stu);
	}

	@Test
	public void testDelete() {
		dao.delete(2L);
	}

	@Test
	public void testGet() {
		List<Student> list= dao.get(3L);
		list.forEach(System.out::println);
	}

	@Test
	public void testList() {
		List<Student> list = dao.list();
		list.forEach(System.out::println);
	}
	
//-----------------------------------------------------
	//测试事务在银行转账的应用效果
	/*
	 * 模拟案例: 从西门庆的账号上转给潘金莲1000块服务费 
	 *  +----+--------+---------+
		| id | name   | balance |
		+----+--------+---------+
		|  1 | 潘金莲 |       0 |
		|  2 | 西门庆 |   10000 |
		+----+--------+---------+ 
	 */
	@Test
	public void testTx() throws Exception {
		@Cleanup
		Connection conn = null;
		try {
			conn = JdbcUtil.getConn();
			//设置手动提交事务
			conn.setAutoCommit(false); 
			//查询西门庆的账号余额,是否满足转账的金额
			String sql = "select * from account where name = ? and balance >= ?";
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符的值
			ps.setObject(1, "西门庆");
			ps.setObject(2, 1000);
			@Cleanup
			ResultSet rs = ps.executeQuery();
	
			if (!rs.next()) {
				System.out.println(2);
				throw new RuntimeException("余额不足");
			}
			
			//2 从西门庆的账号余额中扣1000
			sql = "update account set balance = balance - 1000 where name = ? ";
			ps = conn.prepareStatement(sql);
			ps.setObject(1, "西门庆");
			ps.executeUpdate();
			
			System.out.println(1 / 0); //模拟停电效果
			
			//3 潘金莲账号中转入1000
			sql = "update account set balance = balance + 1000 where name = ?";
			ps = conn.prepareStatement(sql);
			ps.setObject(1, "潘金莲");
			ps.executeUpdate();
			
			//提交事务
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			conn.rollback(); //回滚事务
		}
	}

}
