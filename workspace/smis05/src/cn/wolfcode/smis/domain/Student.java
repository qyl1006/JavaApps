package cn.wolfcode.smis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/*先导包,把项目需要的包准备好
 * 1)根据表结构在Java中建立daomain----一个类,用于封装信息和数据
 */
@Setter @Getter @ToString @NoArgsConstructor @AllArgsConstructor
public class Student {
	private Long id;
	private String name;
	private Integer age;
}
