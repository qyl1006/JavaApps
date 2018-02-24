package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wolfcode.smis.handler.IResultSetHandler;
import lombok.Cleanup;

//提供模板功能的工具类
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
			//设置占位符的值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			//执行sql语句
			ps.executeUpdate();
			
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
			//设置占位符的值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			//执行sql语句进行查询,并返回一个结果集
			ResultSet rs = ps.executeQuery();
			
			return rsh.handler(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
