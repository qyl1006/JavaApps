package cn.wolfcode.shop.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data 
public class Product {
	private Long id;
	private String productName;
	private Long dir_id;
	private BigDecimal salePrice ;
	private String supplier;
	private String brand;
	private BigDecimal cutoff;
	private BigDecimal costPrice;
}
