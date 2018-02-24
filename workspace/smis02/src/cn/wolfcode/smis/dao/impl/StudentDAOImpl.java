package cn.wolfcode.smis.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.domain.Student;
import cn.wolfcode.smis.util.jdbcUtil;
import lombok.Cleanup;

/*
 *第五步 生成一个OAD接口的实现类 (暂内部方法空实现)
 *第七步 真正实现OAD接口中的方法
 */
public class StudentDAOImpl implements IStudentDAO{
	//保存数据的方法
	public void save(Student stu) {
		String sql = "insert t_student (name, age) values (?, ?)";
		try {
			@Cleanup
			Connection conn = jdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位参数的值
			ps.setObject(1, stu.getName());
			ps.setObject(2, stu.getAge());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//更新数据的方法
	public void update(Student stu) {
		String sql = "update t_student set name = ?, age = ? where id = ?";
		try {
			@Cleanup
			Connection conn = jdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位参数的值
			ps.setObject(1, stu.getName());
			ps.setObject(2, stu.getAge());
			ps.setObject(3, stu.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//删除数据的方法
	public void delete(Long id) {
		String sql = "delete from t_student where id = ?";
		try {
			@Cleanup
			Connection conn = jdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位参数的值
			ps.setObject(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	//查询一条记录的方法
	public Student get(Long id) {
		String sql = "select * from t_student where id = ?";
		try {
			@Cleanup
			Connection conn = jdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位参数的值
			ps.setObject(1, id);
			@Cleanup
			ResultSet res = ps.executeQuery();  
			Student stu = null;
			if(res.next()){
				String name = res.getString("name");
				Integer age = res.getInt("age");
				stu = new Student(id, name, age);
				return stu;
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	//查询所有的方法
	public List<Student> list() {
		List<Student> list = new ArrayList<>();
		
		String sql = "select * from t_student";
		try {
			@Cleanup
			Connection conn = jdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位参数的值
			ResultSet res = ps.executeQuery();
			while(res.next()){
				Long id = res.getLong("id");
				String name = res.getString("name");
				Integer age = res.getInt("age");
				Student stu = new Student(id, name, age);
				list.add(stu);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
}
