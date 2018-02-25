package cn.wolfcode.smis.util;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

/*
 * 第四步  生成一个工具类 用于注册驱动,提供与数据库连接对象----德鲁伊连接池
 */
public abstract class JdbcUtil {
	private static DataSource ds;
	
	static {
		try {
			//注册驱动
			ClassLoader loader = JdbcUtil.class.getClassLoader();
			InputStream in = loader.getResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(in); //加载资源
			//创建DBCP连接池对象
			ds = DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//静态方法,提供数据库连接对象
	public static Connection getConn() throws Exception{
		return ds.getConnection();
	}
	
}
