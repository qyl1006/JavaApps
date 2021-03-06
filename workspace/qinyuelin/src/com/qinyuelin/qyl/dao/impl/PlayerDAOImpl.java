package com.qinyuelin.qyl.dao.impl;

import java.util.List;

import com.qinyuelin.qyl.dao.IPlayerDAO;
import com.qinyuelin.qyl.domain.Player;
import com.qinyuelin.qyl.handler.impl.BeanListHandler;
import com.qinyuelin.qyl.util.JdbcTemplate;

public class PlayerDAOImpl implements IPlayerDAO {

	public void save(Player p) {
		String sql = "insert t_player (nickname, password, sex) values (?, ?, ?)";
		JdbcTemplate.update(sql, p.getNickname(), p.getPassword(), p.getSex());
	}

	public void update(Player p) {
		String sql = "update t_player set nickname = ?, password = ?, sex = ? where id = ?";
		JdbcTemplate.update(sql, p.getNickname(), p.getPassword(), p.getSex(), p.getId());
	}

	public void delete(Long id) {
		String sql = "delete from t_player where id = ?";
		JdbcTemplate.update(sql, id);
	}

	public Player get(Long id) {
		String sql = "select * from t_player where id = ?";
		List<Player> list = JdbcTemplate.query(sql, new BeanListHandler<>(Player.class), id);
		return list.size() == 1 ? list.get(0) : null;
	}

	public List<Player> list() {
		String sql = "select * from t_player";
		return JdbcTemplate.query(sql, new BeanListHandler<>(Player.class));
	}

}
