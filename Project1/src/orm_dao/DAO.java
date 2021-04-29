package orm_dao;

import java.util.List;

public interface DAO<T> {
	//����
    public void add(T t);
    //�޸�
    public void update(T t);
    //ɾ��
    public void delete(int id);
    //��ȡ
    public T get(int id);
    //��ѯ
    public List<T> list();
    //��ҳ��ѯ
    public List<T> list(int start, int count);

}
