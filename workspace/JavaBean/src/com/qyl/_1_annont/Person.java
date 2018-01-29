package com.qyl._1_annont;

import javax.annotation.Generated;
import javax.annotation.processing.SupportedAnnotationTypes;

import com.sun.xml.internal.ws.developer.Serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//定义一个描述人的类
//  1) 多个参数之间不能使用";"分开    2)参数之间没有先后顺序


@VIP(value="Will", gender=Gender.SECRECY, age=17, measurements={1, 2, 3})   
@Getter @Setter @NoArgsConstructor @ToString @AllArgsConstructor 
public class Person {
	private String name;
	private Long id;
	private Integer age;
	
}
