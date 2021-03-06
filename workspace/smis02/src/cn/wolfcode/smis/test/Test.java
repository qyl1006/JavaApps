package cn.wolfcode.smis.test;

import java.beans.BeanInfo;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import cn.wolfcode.smis.domain.Student;

public class Test {
	@org.junit.Test
	public void test() throws Exception{
		BeanInfo b = Introspector.getBeanInfo(Student.class, Object.class);//第二个参数决定从哪里停止找属性
        PropertyDescriptor[] ps = b.getPropertyDescriptors();
        System.out.println(ps.length);
        
        //循环获到的属性ps[]  得到Person类中的各种属性并打印
        for (PropertyDescriptor propertyDescriptor : ps) {
              System.out.println("属性的类型:" + propertyDescriptor.getPropertyType());
              System.out.println("属性的名字:" + propertyDescriptor.getName());
              System.out.println("属性读的方法" + propertyDescriptor.getReadMethod());
              System.out.println("属性写的方法" + propertyDescriptor.getWriteMethod());

	}
	}
}
