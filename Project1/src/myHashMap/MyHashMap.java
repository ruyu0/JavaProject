package myHashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashMap<T, E> {
	//�����ϣ��Ҳ����������
	private ArrayList<LinkedList<MyEntry<T, E>>> hashTable;
	public MyHashMap() {
		// TODO Auto-generated constructor stub
		hashTable = new ArrayList<>();
		//��ϣ���СΪ20000
		for (int i = 0; i < 20000; i++)
			hashTable.add(new LinkedList<MyEntry<T, E>>());
	}
	
	//�������� key ��Ӧ�� value �Ѿ����ڣ���ִ�� value �滻���������ؾɵ� value ֵ�������������ִ�в��룬���� null��
	public E put(T t, E e) {
		MyEntry<T, E> entry = new MyEntry<>(t, e);
		LinkedList<MyEntry<T, E>> list = hashTable.get((t == null ? 0 : t.hashCode()) % 20000);
		for (MyEntry<T, E> element : list) {
			//�滻����
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
