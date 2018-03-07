package cn.wolfcode.shop.service;

import java.util.List;

import cn.wolfcode.shop.domain.Product;

public interface IProductService {
void save(Product p);
	
	void update(Product p);
	
	void delete(Long id);
	
	Product get(Long id);
	
	List<Product> listAll();
}
