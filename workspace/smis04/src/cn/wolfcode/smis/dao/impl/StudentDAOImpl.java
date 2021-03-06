package cn.wolfcode.smis.dao.impl;

import java.util.List;

import cn.wolfcode.smis.dao.IStudentDAO;
import cn.wolfcode.smis.domain.Student;
import cn.wolfcode.smis.handler.impl.BeanListHandler;
import cn.wolfcode.smis.util.JdbcTemplate;

//生成一个DAO接口的实现类
public class StudentDAOImpl implements IStudentDAO {

	@Override
	public void save(Student stu) {
		String sql = "insert t_student (name, age) values (?, ?)";
		JdbcTemplate.update(sql, stu.getName(),stu.getAge()); //最后个参数是可变参数--数组
//		try {
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS ); //后面的参数表示返回主键
//			//设置占位符的值
//			ps.setObject(1, stu.getName());
//			ps.setObject(2, stu.getAge());
//			ps.executeUpdate();   //不需要参数  执行SQL语句
//			
//			//获取主键
//			ResultSet rs = ps.getGeneratedKeys();
//			if(rs.next()){
//				Object key = rs.getObject(1);
//				System.out.println("主键: " + key);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	}

	@Override
	public void update(Student stu) {
		String sql = "update t_student set name = ?, age = ? where id = ?";
		JdbcTemplate.update(sql, stu.getName(), stu.getAge(), stu.getId());
//		try {
//			//获取连接对象
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql);
//			//设置占位符的值
//			ps.setObject(1, stu.getName());
//			ps.setObject(2, stu.getAge());
//			ps.setObject(3, stu.getId());
//			//执行SQL语句
//			ps.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	@Override
	public void delete(Long id) {
		String sql = "delete from t_student where id = ?";
		JdbcTemplate.update(sql, id);
//		try {
//			//获取连接对象
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setObject(1, id);
//			ps.executeUpdate();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	}

	public List<Student> get(Long id){
		return list(id);
	}
	public List<Student> list(Long id) {
		String sql = "select * from t_student where id = ?";
		return JdbcTemplate.query(sql,new BeanListHandler<>(Student.class), id);
//		try {
//			//获取连接对象
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql);
//			//设置占位符的值
//			ps.setObject(1, id);
//			@Cleanup
//			ResultSet rs = ps.executeQuery(); //执行SQL查询语句, 返回一个数据库结果集
//			if(rs.next()){
//				//拿到domain类型的属性
//				Class<Student> clz = Student.class;
//				Student stu = clz.newInstance(); //反射创建该类的对象
//				BeanInfo bea = Introspector.getBeanInfo(clz, Object.class);//使用内省,获取JavaBean获取其所有属性和方法
//				PropertyDescriptor[] pds = bea.getPropertyDescriptors();//获取Java描述--数组的形式
//
//				//迭代操作每一个属性
//				for (PropertyDescriptor pd : pds) {
//					String columnName = pd.getName();//属性名作为列名使用
//					Object value = rs.getObject(columnName);
//					//调用属性的写死亡方法setter方法-->写入
//					pd.getWriteMethod().invoke(stu, value);
//				}
//				return stu;
//			}
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
//		
//		try {
//			//获取连接对象
//			@Cleanup
//			Connection conn = JdbcUtil.getConn();
//			@Cleanup
//			PreparedStatement ps = conn.prepareStatement(sql);
//			
//			@Cleanup
//			ResultSet rs = ps.executeQuery(); //没有参数
//			
//			//拿到domain类型的属性
//			Class<Student> clz = Student.class;
//			BeanInfo bea = Introspector.getBeanInfo(clz, Object.class);//使用内省,获取JavaBean获取其所有属性和方法
//			PropertyDescriptor[] pds = bea.getPropertyDescriptors();//获取Java描述--数组的形式
//			
//			while(rs.next()){
//				Student stu = clz.newInstance();
//				//迭代操作每一个属性
//				for (PropertyDescriptor pd : pds) {
//					String columnLabel = pd.getName();//属性名作为列名使用
//					Object value = rs.getObject(columnLabel);
//					//调用属性的写死亡方法setter方法-->写入
//					pd.getWriteMethod().invoke(stu, value);
//				}
//				list.add(stu);
//			}
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
	}

}
