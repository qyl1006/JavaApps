package cn.wolfcode.smis.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

//抽取JDBCUtil工具类,围绕核心思想 -> 连接数据库的4要素
public abstract class JdbcUtil {
//	private static String className = "com.mysql.jdbc.Driver";
//	private static String url = "jdbc:mysql://127.0.0.1:3306/jdbcdemo";
//	private static String username = "root";
//	private static String password = "qqaz4020723629";
	private static DataSource ds;
	
	static {
		try {
			
			//读取属性文件,获取4要素信息
			ClassLoader loader = JdbcUtil.class.getClassLoader();
			InputStream in = loader.getSystemResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(in);  //加载资源
			//使用工厂的方式创建德鲁伊连接池
			ds = DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static Connection getConn() throws Exception{
		return ds.getConnection();
	}
}
