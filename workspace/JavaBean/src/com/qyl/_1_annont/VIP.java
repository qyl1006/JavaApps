package com.qyl._1_annont;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 自定义VIP注解
 */


@Retention(RetentionPolicy.RUNTIME)//表示当前的注解可以加载到JVM中
@Target(ElementType.TYPE) //表示当前注解可以贴在类上
public @interface VIP {
	//设置一些属性
	String value();
	int age();
	Gender gender();
	int[] measurements();  //可以使用一维数组
	
//	Double height();   ---->不能使用包装类用作属性返回值类型  
	
}
