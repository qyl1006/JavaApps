package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wolfcode.smis.handler.IResultSetHandler;
import lombok.Cleanup;

//模板设计
public abstract class JdbcTemplate {
	//DML模板
	public static void update(String sql, Object... params) {
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
			ps.executeUpdate(); //不需要参数
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//DQL模板
	public static<T> T query(String sql, IResultSetHandler<T> rsh, Object...params){
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
			@Cleanup
			ResultSet rs = ps.executeQuery(); //不需要参数
			return rsh.handler(rs);
			
			
//			Class<Student> clz = Student.class;
//			PropertyDescriptor[] pds = null;
//			
//			while(rs.next()){
//				if(pds == null){
//					pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
//				}
//				
//				Student obj = clz.newInstance(); //反射创建该类的对象
//				
//				//循环遍历操作每一个属性
//				for (PropertyDescriptor pd : pds) {
//					String columnLabel = pd.getName(); //属性名作为列名
//					Object args= rs.getObject(columnLabel);// 通过列名获取值
//					pd.getWriteMethod().invoke(obj, args); //JavaBean获取写的方法 调用seeter 写入数据
//				}
//				list.add(obj);  //把封装好的对象数据存到list集合中, 最后返回list
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
