package cn.wolfcode.smis.util;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

//操作JDBC的工具类
public abstract class JdbcUtil {
	private static DataSource ds;
	
	//只在类加载时执行1次
	static {
		try {
			//读取属性文件,获取4要素信息
			ClassLoader loader = JdbcUtil.class.getClassLoader();
			//在输出路径中找db.properties
			InputStream in = loader.getResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(in);//从流中读取属性信息
			//使用工厂的方式来创建德鲁伊连接池
			ds = DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//获取一个连接对象
	public static Connection getConn() throws Exception {
		return ds.getConnection();
	}
	
	
}
