package cn.wolfcode.smis.dao;

import java.util.List;

import cn.wolfcode.smis.domain.Student;

//2) 根据DAO规范写出DAO接口中的CRUD(增删改查)方法

/**
 * 操作学生对象的DAO接口
 * @author Qyuelin
 */
public interface IStudentDAO {
	/**
	 * 保存一个学生对象
	 * @param stu 被保存的学生对象
	 */
	void save(Student stu);  //因为保存,所以需要传入一个学生对象(操作的是学生表)
	
	/**
	 * 更新一个学生对象
	 * @param stu 被更新的学生对象 该对象必须有一个ID(不然无法确定更新表中哪一行的信息)
	 */
	void updata(Student stu);
	
	/**
	 * 删除一个学生信息
	 * @param id 被删除学生对象的ID
	 */
	void delete(Long id);
	
	/**
	 * 查询一个学生信息
	 * @param id 被查询学生的ID 
	 * @return 返回一个学生对象 若查询不到则返回null
	 */
	Student get(Long id);  //因为表中的列和列的值 与 Java类的属性 和值 是一一对应的关系
	
	/**
	 * 查询全部学生信息
	 * @return 返回所有学生对象的集合 如表中无数据,则返回空集合
	 */
	List<Student> list();
}
