package cn.wolfcode.smis.dao;

import java.util.List;

import cn.wolfcode.smis.domain.Student;

//第四步 设计学生对象的DAO接口
/**
 * 操作学生的DAO接口
 * @author Qyuelin
 *
 */
public interface IStudentDAO {
	/**
	 * 保存一个学生对象
	 * @param stu 被保存的学生对象
	 */
	void save(Student stu);
	
	/**
	 * 更新一个学生对象
	 * @param stu 被更新的学生信息,该对象必须有一个ID
	 */
	void update(Student stu);
	
	/**
	 * 删除一个学生对象
	 * @param id 被删除的学生的ID
	 */
	void delete(Long id);
	
	/**
	 * 查询一个学生对象信息
	 * @param id 被查询的学生ID
	 * @return 返回查询到的学生对象 若查询对象不存在时返回null
	 */
	List<Student> get(Long id);
	
	/**
	 * 查询所有学生的信息
	 * @return 返回所有学生信息的集合,若表无数据时返回空集合
	 */
	List<Student> list();

	
}
