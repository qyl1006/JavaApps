package cn.wolfcode.smis.domain;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor @NoArgsConstructor
public class Student {
	private Long id;
	private String name;
	private Integer age;
	private BigDecimal salary;
	private Date hiredate;
	
}
