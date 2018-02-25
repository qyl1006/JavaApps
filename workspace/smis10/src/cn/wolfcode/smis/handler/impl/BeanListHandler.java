package cn.wolfcode.smis.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.handler.IResultSetHandler;

/*
 * *把每一行数据处理成一个JavaBean, 最后以List形式返回多个JavaBean
 * 泛型T表示用户来决定每一行数据处理处理成什么类型的JavaBean
 */
public class BeanListHandler <T> implements IResultSetHandler <List<T>> {
	//JavaBean类型
	private Class<T> clz;
	
	//给调用者调用时决定JavaBean是什么类型---处理数据后的类型
	public BeanListHandler(Class<T> clz){
		this.clz = clz;
	}
	
	public List<T> handler(ResultSet rs) throws Exception {
		List<T> list = new ArrayList<>();
		
		PropertyDescriptor[] pds = null;
		while(rs.next()){
			if(pds == null){
				pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
			}
			T obj = clz.newInstance();
			
			//循环操作每一个属性
			for (PropertyDescriptor pd : pds) {
				String columnLabel = pd.getName(); //获取属性名来作为列名
				Object args = rs.getObject(columnLabel);//通过列名获取值
				pd.getWriteMethod().invoke(obj, args); //获取写的方法,调用方法把 值 写入对象中
			}
			list.add(obj);//把封装好的对象(数据)保存在list, 最后返回
		}
		
		return list;
	}

}
