package com.qinyuelin.qyl.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.qinyuelin.qyl.handler.IResultSetHandler;

//实现类
public class BeanListHandler <T> implements IResultSetHandler<List<T>> {
	private Class<T> clz;
	
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
			
			for (PropertyDescriptor pd : pds) {
				String columnLabel = pd.getName();
				Object args = rs.getObject(columnLabel);
				pd.getWriteMethod().invoke(obj, args);
			}
			list.add(obj);
		}
		
		return list;
	}

}
