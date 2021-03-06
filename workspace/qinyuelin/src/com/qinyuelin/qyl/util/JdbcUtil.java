package com.qinyuelin.qyl.util;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public abstract class JdbcUtil {
	private static DataSource ds;
	
	//静态代码块
	static{
		try {
			ClassLoader loader = JdbcUtil.class.getClassLoader();
			
			InputStream in = loader.getResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(in); //加载资源
			
			//工厂方式
			ds = DruidDataSourceFactory.createDataSource(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//公共静态方法, 提供连接对象
	public static Connection getConn() throws Exception{
		return ds.getConnection();
	}
}
