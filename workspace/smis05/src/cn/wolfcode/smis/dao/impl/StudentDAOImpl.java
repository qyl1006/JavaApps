package cn.wolfcode.smis.dao.impl;

import java.util.List;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.domain.Student;
import cn.wolfcode.smis.handler.impl.BeanListHandler;
import cn.wolfcode.smis.util.JdbcTemplate;

//3)生成一个DAO接口的实现类, 内部方法暂时空实现,测试先行
//5) 编写具体实现,并进行测试-------
public class StudentDAOImpl implements IStudentDAO {

	public void save(Student stu) {
		String sql = "insert t_student (name, age) values (?, ?)";
		
		JdbcTemplate.update(sql, stu.getName(), stu.getAge());
		
//		try {
////			//加载注册驱动(贾)
////			Class.forName("com.mysql.jdbc.Driver");
////			//获取连接对象(链)
////			@Cleanup
////			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root",
////									"qqaz4020723629");
//			
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			//获取语句对象(会话)
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql);
//			//设置占位符的值
//			ps.setObject(1, stu.getName());
//			ps.setObject(2, stu.getAge());
//			//执行SQL语句
//			ps.executeUpdate(); //没有参数的
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}

	public void updata(Student stu) {
		String sql = "update t_student set name = ?, age = ? where id = ?";
		JdbcTemplate.update(sql, stu.getName(), stu.getAge(), stu.getId());
		
//		try {
////			//加载注册驱动
////			Class.forName("com.mysql.jdbc.Driver");
////			//获取连接对象
////			@Cleanup
////			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root", "qqaz4020723629");
//			
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			//获取/创建语句对象
//			PreparedStatement ps = conn.prepareStatement(sql);
//			//设置占位符的值
//			ps.setObject(1, stu.getName());
//			ps.setObject(2, stu.getAge());
//			ps.setObject(3, stu.getId());
//			//执行sql语句
//			ps.executeUpdate(); //没有参数
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	public void delete(Long id) {
		String sql = "delete from t_student where id = ?";
		JdbcTemplate.update(sql, id);
		
//		try {
////			//加载注册驱动
////			Class.forName("com.mysql.jdbc.Driver");
////			//获取连接对象
////			@Cleanup
////			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root", "qqaz4020723629");
//			
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			//获取语句对象
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setObject(1, id);
//			//执行sql
//			ps.executeUpdate();  //不需要参数
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	public Student get(Long id) {
		String sql = "select * from t_student where id = ?";
		List<Student> list = JdbcTemplate.query(sql, new BeanListHandler<>(Student.class), id);
		return list.size() == 1 ? list.get(0) : null;
		
//		try {
////			//加载注册驱动
////			Class.forName("com.mysql.jdbc.Driver");
////			//获取连接对象
////			@Cleanup
////			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root", "qqaz4020723629");
//			
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			//获取语句对象
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql);
//			//给占位符设值
//			ps.setObject(1, id);
//			//执行sql语句
//			@Cleanup
//			ResultSet rs = ps.executeQuery(); //不需要参数
//
//			Class<Student> clz = Student.class;
//			Student stu = clz.newInstance();
//			//JavaBean
//			PropertyDescriptor[] pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
//			if(rs.next()){
//				for (PropertyDescriptor pd : pds) {
//					String columnLabel = pd.getName();//属性名作为列名
//					Object obj = rs.getObject(columnLabel); //根据列名获取值
//					pd.getWriteMethod().invoke(stu, obj);  //Bean获取写的方法写入
//				}
//			}
//			return stu;
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
	}

	@Override
	public List<Student> list() {
		String sql = "select * from t_student";
		
		return JdbcTemplate.query(sql, new BeanListHandler<>(Student.class));
		
//		List<Student> list = new ArrayList<>();
//		try {
////			//加载注册驱动
////			Class.forName("com.mysql.jdbc.Driver");
////			//获取连接对象
////			@Cleanup
////			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root", "qqaz4020723629");
//			
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			//获取语句对象
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql);
//			//执行sql语句
//			ResultSet rs = ps.executeQuery();
//			Class<Student> clz = Student.class;
//			PropertyDescriptor[] pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
//			
//			while(rs.next()){
//				Student stu = clz.newInstance();
//				for (PropertyDescriptor pd : pds) {
//					String columnLabel = pd.getName();
//					Object obj = rs.getObject(columnLabel);
//					pd.getWriteMethod().invoke(stu, obj);
//				}
//				list.add(stu);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
	}
	

}

