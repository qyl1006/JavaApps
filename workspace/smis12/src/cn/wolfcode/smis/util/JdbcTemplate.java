package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wolfcode.smis.handler.IResultSetHandler;
import lombok.Cleanup;

public abstract class JdbcTemplate {
	//DML
	public static void update(String sql, Object...params){
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//DQL
	public static <T> T query(String sql, IResultSetHandler<T> rsh, Object...params){
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			
			@Cleanup
			ResultSet rs = ps.executeQuery();
			
			return rsh.handler(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
