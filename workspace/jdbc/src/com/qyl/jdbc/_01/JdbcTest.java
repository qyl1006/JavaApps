package com.qyl.jdbc._01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import org.junit.Test;

//import com.mysql.jdbc.Driver;

/*
 * 练习jdbc练习
 */
public class JdbcTest {
	@Test
	public void test() throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//连接数据库
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbcdemo", "root", "qqaz4020723629");
		System.out.println(conn);
		
		
	}
}
