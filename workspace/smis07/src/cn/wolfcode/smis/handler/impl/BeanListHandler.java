package cn.wolfcode.smis.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.handler.IResultSetHandler;

public class BeanListHandler<T> implements IResultSetHandler<List<T>>{
	private Class<T> clz;
	
	public BeanListHandler(Class<T> clz){
		this.clz = clz;
	}
	
	public List<T> handler(ResultSet rs) throws Exception {
		List<T> list = new ArrayList<>();
		
		PropertyDescriptor[] pds = null;
		while(rs.next()){
			T obj = clz.newInstance(); //反射创建该类的对象
			if(pds == null){
				pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
			}
			//循环遍历  操作每一个属性
			for (PropertyDescriptor pd : pds) {
				String columnLabel = pd.getName(); //属性名作为列名<-->一一对应
				Object args = rs.getObject(columnLabel); //通过列名获取值
				pd.getWriteMethod().invoke(obj, args); //获取写的方法setter, 调用方法写入数据
			}
			list.add(obj); //把封装好的数据add到list,最后返回list
		}
		
		return list;
	}

}
