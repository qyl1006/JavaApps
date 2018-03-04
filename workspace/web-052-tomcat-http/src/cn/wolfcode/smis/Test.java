package cn.wolfcode.smis;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@ToString @Getter
public class Test {
	private Long id = 1L;
	private String name = "小明";
	private Integer age = 22;
	
	List<?> list = Arrays.asList("啊", 123, "qaz");
}
