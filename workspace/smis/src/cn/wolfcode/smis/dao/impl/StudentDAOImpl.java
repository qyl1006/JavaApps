package cn.wolfcode.smis.dao.impl;
/*
 * 第五步: 生成一个OAD接口的实现类(内部总空实现)
 * 
 * 第七步: 真正实现OAD接口中的实现类方法
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.domain.Student;
import lombok.Cleanup;

public class StudentDAOImpl implements IStudentDAO {
   //增加方法
	public void save(Student stu){
		String sql = "insert t_student(name, age) values (?, ?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			@Cleanup
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo",
					"root", "qqaz4020723629");
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位参数的值
			ps.setObject(1, stu.getName());
			ps.setObject(2, stu.getAge());
			ps.executeUpdate();  //没有参数的
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//更新数据方法
	public void update(Student stu){
		String sql = "update t_student set name = ?, age = ? where id = ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			@Cleanup
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo",
					"root", "qqaz4020723629");
			
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位参数的值
			ps.setObject(1, stu.getName());
			ps.setObject(2, stu.getAge());
			ps.setObject(3, stu.getId());
			ps.executeUpdate();//没有参数
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//删除数据的方法
	public void delete(Long id){
		String sql = "delete from t_student where id = ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			@Cleanup
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo",
					"root", "qqaz4020723629");
			
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符
			ps.setObject(1, id);
			ps.executeUpdate();  //没有参数
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//查询一行数据的方法
	public Student get(Long id){
		String sql = "select * from t_student where id = ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			@Cleanup
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo",
					"root", "qqaz4020723629");
			
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符
			ps.setObject(1, id);
			@Cleanup
			ResultSet res = ps.executeQuery();  //没有参数
			
			Student stu = null;
			if(res.next()){
				String name = res.getString("name");
				Integer age = res.getInt("age");
				stu = new Student(id, name, age);
				return stu;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//查询全部数据的方法
	public List<Student> list(){
		List<Student> list = new ArrayList<>();
		String sql = "select * from t_student";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			@Cleanup
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo",
					"root", "qqaz4020723629");
			
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//这个不需要设值
			ResultSet res = ps.executeQuery(); //不需要参数
			Student stu = null;
			while(res.next()){
				Long id = res.getLong("id");
				String name = res.getNString("name");
				Integer age = res.getInt("age");
				stu = new Student(id, name, age);
				list.add(stu);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
