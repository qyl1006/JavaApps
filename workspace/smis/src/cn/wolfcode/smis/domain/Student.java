package cn.wolfcode.smis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * 第三步) 根据数据表建立domain组件-->一个类(封装信息和数据)
 */
@Setter @Getter @ToString @NoArgsConstructor
@AllArgsConstructor
public class Student {
	private Long id;
	private String name;
	private Integer age;
}
