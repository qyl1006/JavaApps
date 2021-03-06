package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wolfcode.smis.handler.IResultSetHandler;
import lombok.Cleanup;

//抽取JDBCTemplate模板
public abstract class JdbcTemplate {
	//DML模板
	public static void update(String sql, Object... params) {
		try {
			//获取连接对象
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			//获取语句对象
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//给占位符设值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			//执行sql语句
			ps.executeUpdate(); //不需要参数
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//DQL模板
	public static<T> T query(String sql, IResultSetHandler<T> rsh, Object... params) {
		try {
			//获取连接对象
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			
			//获取语句对象
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//给占位符设值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			//执行sql语句, 返回一个结果集
			ResultSet rs = ps.executeQuery(); //不需要参数
			
			//调用结果集处理的方法
			return rsh.handler(rs);
//			Class<Student> clz = Student.class; //返回类型的字节码对象
//			PropertyDescriptor[] pds = null;
//			
//			while(rs.next()){
//				if(pds == null){
//					pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
//				}
//				
//				Student obj = clz.newInstance();
//				for (PropertyDescriptor pd : pds) {
//					String columnLabel = pd.getName();
//					Object args = rs.getObject(columnLabel);
//					pd.getWriteMethod().invoke(obj, args);
//				}
//				list.add(obj);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
