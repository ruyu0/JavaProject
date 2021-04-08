package myHashMap;

//这是保护键值的实体类用于MyHashMap
public class MyEntry<T, E>{
	private T t;
	private E e;
	public MyEntry(T t, E e) {
		// TODO Auto-generated constructor stub
		this.t = t;
		this.e = e;
	}
	
	public E getE() {
		return e;
	}
	
	public T getT() {
		return t;
	}
	
	public void setE(E e) {
		this.e = e;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (t == null ? 0 : t.hashCode()) ^ (e == null ? 0 : e.hashCode());
	}
	
	//重写equals方法，原则见笔记和Object
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && obj.getClass().equals(MyEntry.class)) {
			@SuppressWarnings("unchecked")
			MyEntry<T, E> temp = (MyEntry<T, E>)obj;
			if ((t == null ? temp.t == null : t.equals(temp.t)) && 
					(e == null ? temp.e == null : e.equals(temp.e))) {
				return true;
			}
		}
		return false;
	}
}
