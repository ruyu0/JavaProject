package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
	//获取
	public T get(int id) ;
	//查询
	public List<T> query();
	//分页查询
	public List<T> query(int start, int length);
	//删除
	public boolean delete(String id);
	//添加
	public boolean add(T t);
	//修改
	public boolean update(T t);
}
