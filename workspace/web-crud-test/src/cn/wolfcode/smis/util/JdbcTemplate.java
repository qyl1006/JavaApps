package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wolfcode.smis.handler.IResultSetHandler;
import lombok.Cleanup;

//JDBC操作的模板
public abstract class JdbcTemplate {
	
	public static<T> T query(String sql,IResultSetHandler<T> rsh,Object... params) {
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符参数
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			@Cleanup
			ResultSet rs = ps.executeQuery();//没有参数
			return rsh.handle(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * DML操作的模板
	 * @param sql SQL模板
	 * @param params SQL语句对应占位符的值
	 */
	public static void update(String sql,Object... params) {
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			//设置占位符参数的值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			ps.executeUpdate();//没有参数
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
