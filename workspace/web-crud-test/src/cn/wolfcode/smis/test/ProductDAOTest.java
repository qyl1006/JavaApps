package cn.wolfcode.smis.test;

import java.sql.ResultSet;
import java.util.List;

import org.junit.Test;

import cn.wolfcode.smis.dao.IProductDAO;
import cn.wolfcode.smis.dao.impl.ProductDAOImpl;
import cn.wolfcode.smis.domain.Product;
import cn.wolfcode.smis.handler.IResultSetHandler;
import cn.wolfcode.smis.util.JdbcTemplate;

//DAO接口的测试类
public class ProductDAOTest {	
	//面向接口编程
	private IProductDAO dao = new ProductDAOImpl();
	
	@Test
	public void testSave() {
		Product stu = new Product(null, "xxx", "xxx");
		dao.save(stu);
	}
	@Test
	public void testUpdate() {
		Product stu = new Product(1L, "bunny", "xxx");
		dao.update(stu);
	}
	@Test
	public void testDelete() {
		dao.delete(1L);
	}
	@Test
	public void testGet() {
		Product stu = dao.get(1L);
		System.out.println(stu);
	}
	@Test
	public void testList() {
		List<Product> list = dao.list();
		list.forEach(System.out::println);
	}
	
	@Test
	public void testCount() {
		String sql = "select count(id) from product";
		Integer count = JdbcTemplate.query(sql, new IResultSetHandler<Integer>() {
			public Integer handle(ResultSet rs) throws Exception {
				rs.next();//光标往下移动
				return rs.getInt(1);
			}
		});
		System.out.println(count);
	}
}
