package cn.wolfcode.shop.query;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

//多添加查询条件
@Setter @Getter
public class ProductQueryObject {
	private String productName;
	private BigDecimal minSalePrice;
	private BigDecimal maxSalePrice;
	
	private String brand;
	private Long dir_id;
	
	private int currentPage = 1;
	private int pageSize = 3;
	
	//提供一个属性,用于分页查询的开始值获取
	public int getStartIndex(){
		return (currentPage - 1) * pageSize;
	}

	
	//以下属性为什么没有作用??
	
//	//提供一个属性 用于dir_id=1时, 表示全部鼠标
////	public Boolean isDir_id(){
////		if(dir_id == 1L){
////			return false;
////		}else{
////			return dir_id > 0L;
////		}
////	}
//
//	//用于判断查询拼接条件字符串---是否为空
//	public boolean isProductNameEmpty1(){
//	     return isEmpty(productName);
//	}
//	public boolean isEmpty(String str){
//		return str == null || "".equals(str.trim());
//	}
//	
}
