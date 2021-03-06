package cn.wolfcode.smis.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.handler.IResultSetHandler;

/*
 * 把每一行数据处理成一个JavaBean, 最后以List的形式返回多个JavaBean
 * 泛型T表示用户来决定每一行数据处理什么类型的JavaBean
 */
public class BeanListHandler<T> implements IResultSetHandler<List<T>>{
	//JavaBean的类型
	private Class<T> clz;
	
	public BeanListHandler(Class<T> clz){
		this.clz = clz;
	}
	
	public List<T> handle(ResultSet rs) throws Exception {
		List<T> list = new ArrayList<>();
		PropertyDescriptor[] pds = null;
		
		while(rs.next()){
			if(pds == null){
				pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
			}
			T obj = clz.newInstance();  //反射创建该类的对象
			
			//迭代操作每一个属性
			for (PropertyDescriptor pd : pds) {
				String columnLabel = pd.getName(); //属性作为列名使用
				Object args = rs.getObject(columnLabel);
				//调用属性写的方法setter方法 写入
				pd.getWriteMethod().invoke(obj, args);
			}
			list.add(obj); //把封装好的对象存入list中, 最后返回
			
		}
		return list;
	}

}
