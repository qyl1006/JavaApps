package cn.wolfcode.smis.dao.impl;

import java.util.List;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.domain.Student;
import cn.wolfcode.smis.handler.impl.BeanListHandler;
import cn.wolfcode.smis.util.JdbcTemplate;

public class StudentDAOImpl implements IStudentDAO {

	public void save(Student stu) {
		String sql = "insert t_student (name, age, salary, hiredate) values (?, ?, ?, ?)";
		JdbcTemplate.update(sql, stu.getName(), stu.getAge(), stu.getSalary(), stu.getHiredate());
	}

	public void update(Student stu) {
		String sql = "update t_student set name=?, age=?, salary=?, hiredate=? where id=?";
		JdbcTemplate.update(sql, stu.getName(), stu.getAge(), stu.getSalary(), stu.getHiredate(), stu.getId());
	}

	public void delete(Long id) {
		String sql = "delete from t_student where id = ?";
		JdbcTemplate.update(sql, id);
	}

	public Student get(Long id) {
		String sql = "select * from t_student where id = ?";
		List<Student> list = JdbcTemplate.query(sql, new BeanListHandler<>(Student.class), id);
		return list.size() == 1 ? list.get(0) : null;
	}

	public List<Student> list() {
		String sql = "select * from t_student";
		return JdbcTemplate.query(sql, new BeanListHandler<>(Student.class));
	}

}
