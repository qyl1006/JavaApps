package cn.wolfcode.smis.dao;

import java.util.List;

import cn.wolfcode.smis.domain.Product;

/**
 * 操作学生对象的DAO接口 
 */
public interface IProductDAO {
	/**
	 * 保存一个学生对象
	 * @param stu 被保存的学生对象
	 */
	void save(Product stu);
	/**
	 * 更新一个学生对象
	 * @param stu 被更新学生信息,该对象必须有id
	 */
	void update(Product stu);
	/**
	 * 删除一个学生对象
	 * @param id 被删除的学生的ID
	 */
	void delete(Long id);
	/**
	 * 查询一个学生对象信息
	 * @param id 被查询的学生的ID
	 * @return 查询到的学生对象,查询对象不存在时返回null
	 */
	Product get(Long id);
	/**
	 * 查询所有学生的信息
	 * @return 所有学生信息的集合,表中无数据时返回空白集合
	 */
	List<Product> list();
}
