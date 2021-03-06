package cn.wolfcode.smis.handler;

import java.sql.ResultSet;

/**
 * 处理结果集的规范
 * @author Qyuelin
 *
 * @param <T> 处理结果集后的类型
 */
public interface IResultSetHandler<T>{
	T handle(ResultSet rs) throws Exception;
}
