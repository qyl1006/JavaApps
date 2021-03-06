package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wolfcode.smis.handler.IResultSetHandler;
import lombok.Cleanup;

/*
 * 抽取JDBCTemplate
	先抽取DML操作,根据重复的内容抽取出来作为模板,不同的找共同点
	再抽取DQL操作基础版
	再抽取DQL操作带泛型的版本
	最后完成BeanListHandler

 */
public  abstract class JdbcTemplate {
	//DML模板
	public static void update(String sql, Object...params){
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符参数的值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			//执行sql语句
			ps.executeUpdate(); //没有参数
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//DQL模板
	public static<T> T query(String sql, IResultSetHandler<T> rsh, Object...params){
//		List<Student> list = new ArrayList<>();
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符的值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			//执行sql语句
			@Cleanup
			ResultSet rs = ps.executeQuery(); // 不需要参数
			return rsh.handle(rs);
			
//			Class<Student> clz = Student.class;
//			PropertyDescriptor[] pds = null;
//			
//			while(rs.next()){
//				if(pds == null){
//					pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
//				}
//				Student stu = clz.newInstance();
//				for (PropertyDescriptor pd : pds) {
//					String columnLabel = pd.getName(); //属性作为列名
//					Object obj = rs.getObject(columnLabel); //通过列名获取值
//					
//					pd.getWriteMethod().invoke(stu, obj);//JavaBean获取写的方法写入
//				}
//				list.add(stu);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

