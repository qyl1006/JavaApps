package cn.wolfcode.smis.dao;

import java.util.List;

import cn.wolfcode.smis.domain.Student;

/**
 * 操作学生对象的DAO接口
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
	 * 更新一个学生信息
	 * @param stu 被更新的学生对象信息, 该对象必须有一个ID,否则不知道更新哪一行数据
	 */
	void update(Student stu);
	
	/**
	 * 删除一个学生信息
	 * @param stu 被删除学生的ID
	 */
	void delete(Long id);
	
	/**
	 * 查询一个学生信息
	 * @param id 被查询学生的ID
	 * @return 返回一个学生对象,若表中查询不到,则返回null
	 */
	Student get(Long id);
	
	/**
	 * 查询表中所有的学生信息
	 * @return 返回所有学生信息,若表中无数据,则返回空集合
	 */
	List<Student> list();
}
