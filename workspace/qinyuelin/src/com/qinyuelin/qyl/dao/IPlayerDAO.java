package com.qinyuelin.qyl.dao;

import java.util.List;

import com.qinyuelin.qyl.domain.Player;

/**
 * 处理Player类的DAO接口
 * @author Qyuelin
 *
 */
public interface IPlayerDAO {
	/**
	 * 增加一个游戏玩家信息
	 * @param p 被增加玩家对象
	 */
	void save(Player p);
	
	/**
	 * 更新一个玩家信息
	 * @param p 被更新的玩家对象
	 */
	void update(Player p);
	
	/**
	 * 删除一个玩家信息
	 * @param id 被删除玩家的ID
	 */
	void delete(Long id);
	
	/**
	 * 查询一个玩家信息
	 * @param id 被查询的玩家对象,该对象必须有一个ID
	 * @return 返回一个玩家对象, 若查询不到,则返回null
	 */
	Player get(Long id);
	
	/**
	 * 查询所有玩家信息
	 * @return 返回所有玩家对象的List集合,若表中无数据,则返回空集合
	 */
	List<Player> list();
}
