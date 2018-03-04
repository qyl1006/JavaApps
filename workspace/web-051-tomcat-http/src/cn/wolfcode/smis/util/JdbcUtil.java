package cn.wolfcode.smis.util;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

//对外提供连接池对象的工具
public abstract class JdbcUtil {
	private static DataSource ds;
	
	//静态代码块
	static{
		try {
			//读取属性文件, 获取4要素信息
			ClassLoader loader = JdbcUtil.class.getClassLoader();
			
			//在输入路径中找db.properties
			InputStream in = loader.getResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(in);//加载资源
			
			//使用工厂的方式创建德鲁伊连接池
			ds = DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//公共静态方法,用于获取连接对象
	public static Connection getConn() throws Exception{
		return ds.getConnection();
	}
}
