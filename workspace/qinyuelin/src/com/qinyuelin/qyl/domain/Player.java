package com.qinyuelin.qyl.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor @NoArgsConstructor
public class Player {
	private Long id;
	private String nickname; //昵称
	private String password;//密码
	private String sex;//性别 
}
