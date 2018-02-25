package cn.wolfcode.smis.util;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public abstract class JdbcUtil {
	private static DataSource ds;
	
	static {
		try {
			//注册驱动
			ClassLoader loader = JdbcUtil.class.getClassLoader();
			InputStream in = loader.getResourceAsStream("db.properties"); 
			Properties p = new Properties();
			p.load(in);
			ds = DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() throws Exception{
		return ds.getConnection();
	}
}
