package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wolfcode.smis.handler.IResultSetHandler;
import lombok.Cleanup;

//提供模板功能的工具类
public abstract class JdbcTemplate {
	//DML模板方法
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

	//DQL模板方法
	public static <T> T query(String sql, IResultSetHandler<T> rsh, Object... params) {
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
			
			//执行查询sql语句, 返回一个结果集
			@Cleanup
			ResultSet rs = ps.executeQuery(); //不需要参数
			
			return rsh.handler(rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}
}
