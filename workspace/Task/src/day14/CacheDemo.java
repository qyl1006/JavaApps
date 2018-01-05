package day14;
/*
 *  演示-->包装类的缓存----通过几个例子对比(Integae装箱)
 *  
 *  总结: 包装类中的缓存设计(享元模式),本质就是缓存设计:
			Byte、Short、Integer、Long：缓存[-128，127]区间的数据；
			Character：缓存[0，127]区间的数据
 * */

public class CacheDemo {
	public static void main(String[] args) {
		//方式1 装箱
		Integer a1 = new Integer(120);
		Integer a2 = new Integer(120);
		System.out.println(a1 == a2);//false == 比较的是内存地址值 每次new 所以不等于
		
		//方式2 装箱
		Integer a3 = Integer.valueOf(120);
		Integer a4 = Integer.valueOf(120);
		System.out.println(a3 == a4); //true--> valueOf()方法先到缓冲区[-128 127]去找,如果不在缓冲区范围中,那么新new一块空间
									
		System.out.println("================================================");
		
		//方式1 装箱
		Integer a11 = new Integer(130);
		Integer a21 = new Integer(130);
		System.out.println(a11 == a21);//false 
		
		//方式2 装箱
		Integer a31 = Integer.valueOf(130);
		Integer a41 = Integer.valueOf(130);
		System.out.println(a31 == a41); //false
	}
}
