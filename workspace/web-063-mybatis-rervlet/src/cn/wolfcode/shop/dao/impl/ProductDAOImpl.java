package cn.wolfcode.shop.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.wolfcode.shop.dao.IProductDAO;
import cn.wolfcode.shop.domain.Product;
import cn.wolfcode.shop.util.MyBatisUtil;
import lombok.Cleanup;

public class ProductDAOImpl implements IProductDAO {

	public void save(Product p) {
		//获取SqlSession对象
		@Cleanup
		SqlSession session = MyBatisUtil.getSession();
		session.update("cn.wolfcode.shop.domain.ProductMapper.save", p);
		session.commit();
	}

	public void update(Product p) {
		//获取SqlSession对象
		SqlSession session = MyBatisUtil.getSession();
		session.update("cn.wolfcode.shop.domain.ProductMapper.update", p);
		session.commit();
	}

	public void delete(Long id) {
		//获取SqlSession对象
		@Cleanup
		SqlSession session = MyBatisUtil.getSession();
		session.delete("cn.wolfcode.shop.domain.ProductMapper.delete", id);
		session.commit();
	}

	public Product get(Long id) {
		//获取SqlSession对象
		@Cleanup
		SqlSession session = MyBatisUtil.getSession();
		Product p = session.selectOne("cn.wolfcode.shop.domain.ProductMapper.get", id);
		
		return p;
	}

	@Override
	public List<Product> listAll() {
		//获取SqlSession对象
		@Cleanup
		SqlSession session = MyBatisUtil.getSession();
		List<Product> list = session.selectList("product.list");
		return list;
	}

}
