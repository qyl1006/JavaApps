package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wolfcode.smis.handler.IResultSetHandler;
import lombok.Cleanup;

//模板功能的工具类
public abstract class JdbcTemplate {
	//DML模板
	public static void update(String sql, Object...params){
		try {
			//获取连接对象
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			
			//获取会话对象
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//给占位符设置值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			
			//执行sql语句
			ps.executeUpdate();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	//DQL模板
	public static <T> T query(String sql, IResultSetHandler<T> rsh, Object...params){
		try {
			//获取连接对象
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			
			//获取会话对象
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//给占位符设置值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			
			//执行sql查询语句,返回一个结果集
			@Cleanup
			ResultSet rs = ps.executeQuery();

			return rsh.handler(rs);
			
//			Class<Student> clz = Student.class;
//			PropertyDescriptor[] pds = null;
//			
//			while(rs.next()){
//				if(pds == null){
//					pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
//				}
//				
//				Student obj = clz.newInstance();
//				
//				//循环操作每一个属性
//				for (PropertyDescriptor pd : pds) {
//					String columnLabel = pd.getName();//获取属性名作为列名
//					Object args = rs.getObject(columnLabel);//通过列名获取值
//					pd.getWriteMethod().invoke(obj, args); //获取写的方法,调用方法写入数据
//				}
//				list.add(obj);//把封装好的数据保存到list,最后返回
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
