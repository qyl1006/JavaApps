package cn.wolfcode.shop.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import cn.wolfcode.shop.domain.Product;
import cn.wolfcode.shop.service.IProductService;
import cn.wolfcode.shop.service.impl.ProductServiceImpl;

public class ProductServiceTest{
	private IProductService p = new ProductServiceImpl();
	
	@Test
	public void testSave() {
		Product product = new Product();
		product.setProductName("测试2");
		product.setDir_id(1L);
		product.setSalePrice(new BigDecimal("100"));
		product.setSupplier("小米");
		product.setBrand("小米");
		product.setCutoff(new BigDecimal("0.8"));
		product.setCostPrice(new BigDecimal("40"));
		p.save(product);
		
	}

	@Test
	public void testUpdate() {
		Product product = new Product();
		product.setProductName("更新测试");
		product.setDir_id(1L);
		product.setSalePrice(new BigDecimal("100"));
		product.setSupplier("小米");
		product.setBrand("小米");
		product.setCutoff(new BigDecimal("0.8"));
		product.setCostPrice(new BigDecimal("40"));
		product.setId(28L);
		p.update(product);
	}

	@Test
	public void testDelete() {
		p.delete(21L);
		
	}

	@Test
	public void testGet() {
		Product product = p.get(2L);
		System.out.println(product);
	}
	@Test
	public void testListAll() {
		List<Product> list = p.listAll();
		list.forEach(System.out::println);
		
	}

}
