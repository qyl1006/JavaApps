package cn.wolfcode.shop.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class MyBaitsUtil {
	private static SqlSessionFactory factory;
	
	static{
		try {
			InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
			
			//获取factory对象
			factory = new SqlSessionFactoryBuilder().build(in);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
		return factory.openSession();
	}

}
