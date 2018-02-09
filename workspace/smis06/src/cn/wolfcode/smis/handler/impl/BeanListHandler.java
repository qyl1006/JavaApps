package cn.wolfcode.smis.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.handler.IResultSetHandler;

//
public class BeanListHandler<T> implements IResultSetHandler<List<T>> {
	//JavaBean类型
	private Class<T> clz;
	
	//构造器
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
			//循环遍历操作每一个属性
			for (PropertyDescriptor pd : pds) {
				String columnLabel = pd.getName(); //属性作为列名
				Object args = rs.getObject(columnLabel); //根据列名来获取值
				pd.getWriteMethod().invoke(obj, args); //获取写的方法seeter, 调用方法写入从表中获取的值
			}
			list.add(obj);//把数据封装成对象,添加到list集合中, 最后返回list
		}
		return list;
	}
	
}
