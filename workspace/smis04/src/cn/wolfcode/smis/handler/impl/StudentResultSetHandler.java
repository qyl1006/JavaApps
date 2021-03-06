package cn.wolfcode.smis.handler.impl;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wolfcode.smis.domain.Student;
import cn.wolfcode.smis.handler.IResultSetHandler;

//处理学生结果集的实现类
public class StudentResultSetHandler implements IResultSetHandler<List<Student>>{

	public List<Student> handle(ResultSet rs) throws Exception {
		List<Student> list = new ArrayList<>();
		Class<Student> clz = Student.class;
		PropertyDescriptor[] pds = null;
		while(rs.next()){
			if(pds == null){
				pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
			}
			
			Student stu = clz.newInstance();
			for (PropertyDescriptor pd : pds) {
				String columnLabel = pd.getName();
				Object args = rs.getObject(columnLabel);
				pd.getWriteMethod().invoke(stu, args);
			}
			list.add(stu);
		}
		return list;
	}

}


