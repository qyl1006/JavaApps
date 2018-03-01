package cn.wolfcode.smis.dao;

import java.util.List;

import cn.wolfcode.smis.domain.Student;

public interface IStudentDAO {
	void save(Student stu);
	
	void update(Student stu);
	
	void delete(Long id);
	
	Student get(Long id);
	
	List<Student> list();
}
