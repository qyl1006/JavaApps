package cn.wolfcode.smis.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

//加载注册驱动,对外通过连接对象的工具类--围绕连接数据库的4要素
public class JdbcUtil {
	private static DataSource ds;
	
	static {
		try {
			//注册驱动
			ClassLoader loader = JdbcUtil.class.getClassLoader();
			InputStream in = loader.getSystemResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(in);// 加载资源
			ds = DruidDataSourceFactory.createDataSource(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() throws Exception{
		return ds.getConnection();
	}
}