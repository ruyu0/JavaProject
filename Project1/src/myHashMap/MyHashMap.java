package myHashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashMap<T, E> {
	//定义哈希表，也可以用数组
	private ArrayList<LinkedList<MyEntry<T, E>>> hashTable;
	public MyHashMap() {
		// TODO Auto-generated constructor stub
		hashTable = new ArrayList<>();
		//哈希表大小为20000
		for (int i = 0; i < 20000; i++)
			hashTable.add(new LinkedList<MyEntry<T, E>>());
	}
	
	//如果插入的 key 对应的 value 已经存在，则执行 value 替换操作，返回旧的 value 值，如果不存在则执行插入，返回 null。
	public E put(T t, E e) {
		MyEntry<T, E> entry = new MyEntry<>(t, e);
		LinkedList<MyEntry<T, E>> list = hashTable.get((t == null ? 0 : t.hashCode()) % 20000);
		for (MyEntry<T, E> element : list) {
			//替换操作
			if (element.getT() == null ? t == null : element.getT().equals(t)) {
				E tempE = element.getE();
				element.setE(e);
				return tempE;
			}
		}
		list.add(entry);
		return null;
	}
	
	public E get(T t) {
		LinkedList<MyEntry<T, E>> list = hashTable.get((t == null ? 0 : t.hashCode()) % 20000);
		for (MyEntry<T, E> element : list) {
			if (element.getT() == null ? t == null : element.getT().equals(t)) {
				return element.getE();
			}
		}
		return null;
	}
}
