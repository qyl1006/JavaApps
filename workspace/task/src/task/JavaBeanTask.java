package task;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

public class JavaBeanTask {
	public static void main(String[] args) throws Exception {
		//测试
		Test2 t = new Test2(1L, "tets", 1228);
		Map<String, Object> map = bean2Map(t);
		System.out.println(map);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("id", 2L);
		map2.put("name", "qyl");
		map2.put("age", 222);
		System.out.println(map2);
		Test2 t2 = map2Bean(map2, Test2.class);
		System.out.println(t2);
		
		
	}
	
	//JavaBean转Map
	public static  Map<String, Object> bean2Map(Object bean) throws Exception{
		Map<String, Object> map = new HashMap<>();
		
		Class<?> clz = bean.getClass();
		PropertyDescriptor[] pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
		
		for (PropertyDescriptor pd : pds) {
			String key = pd.getName();
			Object value = pd.getReadMethod().invoke(bean);
			map.put(key, value);
		}
		
		return map;
	}
	
	//Map转JavaBean
	public static <T> T map2Bean(Map<?,?> map, Class<T> clz) throws Exception{
		T obj = clz.newInstance();
		
		PropertyDescriptor[] pds = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
		
		for (PropertyDescriptor pd : pds) {
			String key = pd.getName();
			Object value = map.get(key);
			pd.getWriteMethod().invoke(obj, value);
		}
		
		return obj;
	}
}

