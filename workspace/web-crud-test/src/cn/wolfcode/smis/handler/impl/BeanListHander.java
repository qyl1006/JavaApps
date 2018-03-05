package cn.wolfcode.smis.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.handler.IResultSetHandler;

//把每一行数据处理成一个JavaBean,最后以List的形式返回多个JavaBean
//泛型T表示用户来决定每一行数据处理成什么类型的JavaBean
public class BeanListHander<T> implements IResultSetHandler<List<T>> {
	//JavaBean的类型
	private Class<T> clz;
	
	public BeanListHander(Class<T> clz) {
		this.clz = clz;
	}

	public List<T> handle(ResultSet rs) throws Exception {
		List<T> list = new ArrayList<>();
		PropertyDescriptor[] pds = null;
		while (rs.next()) {
			T obj = clz.newInstance();//反射创建该类的对象
			if (pds == null) {
				pds = Introspector.getBeanInfo(clz, Object.class)
						.getPropertyDescriptors();
			}
			//迭代操作每一个属性
			for (PropertyDescriptor pd : pds) {
				String columnName = pd.getName();//属性名作为列名来使用
				Object value = rs.getObject(columnName);
				//调用属性的写的方法setter方法
				pd.getWriteMethod().invoke(obj, value);
			}
			list.add(obj);//把封装好的对象存入list中,最后返回
		}
		return list;
	}
}
