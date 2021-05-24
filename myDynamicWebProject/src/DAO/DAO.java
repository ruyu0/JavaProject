package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
	//��ȡ
	public T get(int id) ;
	//��ѯ
	public List<T> query();
	//��ҳ��ѯ
	public List<T> query(int start, int length);
	//ɾ��
	public boolean delete(String id);
	//���
	public boolean add(T t);
	//�޸�
	public boolean update(T t);
}
