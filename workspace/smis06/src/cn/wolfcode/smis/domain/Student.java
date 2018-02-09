package cn.wolfcode.smis.domain;
//domain组件

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Student {
	private Long id;
	private String name;
	private Integer age;
}
