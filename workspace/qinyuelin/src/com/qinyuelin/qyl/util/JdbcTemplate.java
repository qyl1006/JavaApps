package com.qinyuelin.qyl.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.qinyuelin.qyl.handler.IResultSetHandler;

import lombok.Cleanup;

//模板
public abstract class JdbcTemplate {
	//DML
	public static void update(String sql, Object...params){
		try {
			//获取连接池对象
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//给占位符设置值
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			
			//执行sql语句
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	//DQL
	public static <T> T query(String sql, IResultSetHandler<T> rsh,  Object...params){
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			
			//执行查询sql
			@Cleanup
			ResultSet rs = ps.executeQuery();
			
			return rsh.handler(rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
