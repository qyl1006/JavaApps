package cn.wolfcode.smis.dao;

import java.util.List;

import cn.wolfcode.smis.domain.Student;

/**
 * 处理学生数据的接口
 * @author Qyuelin
 *
 */
public interface IStudentDAO {
	/**
	 * 保存一个学生信息
	 * @param stu 被保存的学生对象
	 */
	void save(Student stu);
	
	/**
	 *更新一个学生信息
	 * @param stu 被更新的学生对象,该对象中必须有一个ID
	 */
	void update(Student stu);
	
	/**
	 * 删除一个学生信息
	 * @param id 被删除的学生ID
	 */
	void delete(Long id);
	
	/**
	 * 查询一个学生信息
	 * @param id 被查询学生的ID
	 * @return 返回一个学生对象,若查询不到,则返回null
	 */
	Student get(Long id);
	
	/**
	 * 查询所有学生信息
	 * @return 所有学生对象的List集合,若表中无数据,则返回空集合
	 */
	List<Student> list();
}
