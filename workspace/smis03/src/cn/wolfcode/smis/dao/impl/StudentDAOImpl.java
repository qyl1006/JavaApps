package cn.wolfcode.smis.dao.impl;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.domain.Student;
import cn.wolfcode.smis.util.JdbcTemplate;
import cn.wolfcode.smis.util.JdbcUtil;
import lombok.Cleanup;

/*
 * 1 ) 生成OAD接口的实现类 (内部方法空实现)
 * 
 * 	内省在查询中注意的事项一些约定:
 * 		1)表 和 domain对应
 * 		2) 列名 = 属性名
 * 		3) 列的类型 = 属性的类型
 * 		4) 列的值 = 属性的值  ---->值也是一一对应的  如id<-->id name对应name
 */
public class StudentDAOImpl implements IStudentDAO {
	//保存数据
	public void save(Student stu) {
		String sql = "insert t_student (name, age) values (?, ?)";
		Object[] params = {stu.getName(), stu.getAge()};
		JdbcTemplate.update(sql, params);
	}

	//更新数据
	public void update(Student stu) {
		String sql = "update t_student set name = ?, age = ? where id = ?";
		Object[] params = {stu.getName(), stu.getAge(), stu.getId()};
		JdbcTemplate.update(sql, params);
	}

	//删除一条数据
	public void delete(Long id) {
		String sql = "delete from t_student where id = ?";
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符的值
			ps.setObject(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	//查询数据并返回一条数据
	public Student get(Long id) {
		String sql = "select * from t_student where id = ?";
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符
			ps.setObject(1, id);
			@Cleanup
			ResultSet res = ps.executeQuery();  //不需要参数
			if(res.next()){
//				String name = res.getString("name");
//				Integer age = res.getInt("age");
//				Student stu = new Student(id, name, age);
//				return stu;
				
				//拿到domain类型的属性
				Class<Student> clz = Student.class;
				Student	s = clz.newInstance(); //反射创建该类的对象
				
				//迭代操作每个属性
				PropertyDescriptor[] pds = Introspector.getBeanInfo(clz,Object.class).getPropertyDescriptors();
				for (PropertyDescriptor pd : pds) {
					String columnName = pd.getName();
					Object value = res.getObject(columnName);
					pd.getWriteMethod().invoke(s, value);
				}
				return s;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	//查询数据并返回全部
	public List<Student> list() {
		String sql = "select * from t_student";
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			@Cleanup
			ResultSet re = ps.executeQuery();
			
			List<Student> list = new ArrayList<>();
			while(re.next()){
//				Long id = re.getLong("id");
//				String name = re.getString("name");
//				Integer age = re.getInt("age");
//				Student stu = new Student(id, name, age);
//				list.add(stu);
				Class<Student> clz = Student.class;
				Student s = clz.newInstance();
				BeanInfo b = Introspector.getBeanInfo(clz, Object.class);
				PropertyDescriptor[] pds =	b.getPropertyDescriptors();
				
				for (PropertyDescriptor pd : pds) {
					String columnName = pd.getName();
					Object value = re.getObject(columnName);
					pd.getWriteMethod().invoke(s, value);
				}
				list.add(s);
			}
			 return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
