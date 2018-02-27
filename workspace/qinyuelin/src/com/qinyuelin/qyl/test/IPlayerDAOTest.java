package com.qinyuelin.qyl.test;

import java.util.List;

import org.junit.Test;

import com.qinyuelin.qyl.dao.IPlayerDAO;
import com.qinyuelin.qyl.dao.impl.PlayerDAOImpl;
import com.qinyuelin.qyl.domain.Player;

public class IPlayerDAOTest {
	private IPlayerDAO dao = new PlayerDAOImpl();
	
	
	@Test
	public void testSave() {
		Player p = new Player(null, "xiangxiang", "3333333", "女");
		dao.save(p);
	}

	@Test
	public void testUpdate() {
		Player p = new Player(4L, "update", "11-11", "保密");
		dao.update(p);
	}

	@Test
	public void testDelete() {
		dao.delete(5L);
	}

	@Test
	public void testGet() {
		Player p = dao.get(7l);
		System.out.println(p);
	}

	@Test
	public void testList() {
		List<Player> list = dao.list();
		list.forEach(System.out::println);
	}

}
