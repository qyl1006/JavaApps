package cn.wolfcode.smis.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.Cleanup;

public abstract class jdbcUtil {
	private static String driverClassName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/jdbcdemo";
	private static String username = "root";
	private static String password = "qqaz4020723629";
	
	static{
		try {
			
			Class.forName(driverClassName);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//获取对象
	public static Connection getConn() throws Exception{
		return DriverManager.getConnection(url, username, password);
	}
}