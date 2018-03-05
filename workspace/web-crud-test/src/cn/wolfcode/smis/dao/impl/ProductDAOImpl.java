package cn.wolfcode.smis.dao.impl;

import java.util.List;

import cn.wolfcode.smis.dao.IProductDAO;
import cn.wolfcode.smis.domain.Product;
import cn.wolfcode.smis.handler.impl.BeanListHander;
import cn.wolfcode.smis.util.JdbcTemplate;

//学生DAO接口的实现类
public class ProductDAOImpl implements IProductDAO {
	
	public void save(Product stu) {
		String sql = "insert into t_product(name,dirname) values(?,?)";
		Object[] params = {stu.getName(),stu.getDirname()};
		JdbcTemplate.update(sql, params);
	}

	public void update(Product stu) {
		String sql = "update t_product set name = ?, dirname = ? where id = ?";
		Object[] params = {stu.getName(),stu.getDirname(),stu.getId()};
		JdbcTemplate.update(sql, params);
	}

	public void delete(Long id) {
		String sql = "delete from t_product where id = ?";
		JdbcTemplate.update(sql, id);
	}

	public Product get(Long id) {
		String sql = "select * from t_product where id = ?";
		List<Product> list = JdbcTemplate.query(sql, new BeanListHander<>(Product.class), id);
		return list.size() == 1 ? list.get(0) : null;
	}

	public List<Product> list() {
		String sql = "select * from t_product";
		return JdbcTemplate.query(sql,new BeanListHander<>(Product.class));
	}
}
