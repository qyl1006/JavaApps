package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.PreparedStatement;

import lombok.Cleanup;

public abstract class JdbcTemplate {
	public static void update(String sql, Object ...params){
		try {
			@Cleanup
			Connection conn = JdbcUtil.getConn();
			@Cleanup
			PreparedStatement ps = conn.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
