package cn.wolfcode.shop.test;

import java.util.List;

import org.junit.Test;

import cn.wolfcode.shop.domain.Product;
import cn.wolfcode.shop.service.IProductService;
import cn.wolfcode.shop.service.impl.ProductServiceImpl;

public class ProductServiceTest {
	private IProductService ps = new ProductServiceImpl(); 
	
	@Test
	public void testSave() {
		Product p = new Product();
		p.setUproductName("测试保存");
		ps.save(p);
	}

	@Test
	public void testUpdate() {
		Product p = new Product();
		p.setUproductName("测试更新");
		p.setUid(31L);
		ps.update(p);
	}

	@Test
	public void testDelete() {
		ps.delete(29L);
	}

	@Test
	public void testGet() {
		Product product = ps.get(1L);
		System.out.println(product);
	}

	@Test
	public void testListAll() {
		List<Product> list = ps.listAll();
		list.forEach(System.out::println);
		
	}

}
