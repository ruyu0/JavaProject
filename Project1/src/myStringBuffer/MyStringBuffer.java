package myStringBuffer;

public class MyStringBuffer implements IStringBuffer{
	private int length = 0;
	private int capacity = 50;
	private char values[];
	
	public MyStringBuffer() {
		// TODO Auto-generated constructor stub
		values = new char[capacity];
	}
	
	public MyStringBuffer(String str) {
		if (str != null) {
			values = str.toCharArray();
			length = str.length();
			capacity = length;
		}else {
		}

	}
	
	@Override
	public void append(char c) {
		// TODO Auto-generated method stub
		append(c + "");
	}
	
	@Override
	public void append(String s) {
		// TODO Auto-generated method stub
		insert(length, s);
	}
	
	@Override
	public void insert(int index, char c) {
		// TODO Auto-generated method stub
		insert(index, c + "");
	}
	
	@Override
	public void insert(int index, String s) {
		// TODO Auto-generated method stub
		//报错
		if (index < 0) return;
		if (index > length) return;
		if (s == null) return;
		
		if (length + s.length() > capacity) {
			capacity = (int)((length + s.length()) * 3);
			char newValues[] = new char[capacity];
			System.arraycopy(values, 0, newValues, 0, length);
			values = newValues;
		}
		System.arraycopy(values, index, values, index + s.length(), length - index);
		System.arraycopy(s.toCharArray(), 0, values, index, s.length());
		
		length = length + s.length();
	}
	
	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub
		if (start < 0) return;
		if (start >= length) return;
		length = start;
	}
	
	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub
		if (start < 0) return;
		if (start >= length) return;
		if (end < start) return;
		if (end > length) return;
		//使用for循环替换(更快）
		for (int i = 0; i < length - end; i++) {
			values[start + i] = values[end + i]; 
		}
//		//比较使用arrayCopy方法
//		System.arraycopy(values, end, values, start, length - end);
		length -= end - start;
	}
	
	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		//使用临时元素（更快）
		for (int i = 0; i < length / 2; i++) {
			char temp = values[i];
			values[i] = values[length - i - 1]; 
			values[length - i - 1] = temp;
		}
//		//使用临时数组
//		char newValues[] = new char[length];
//		for (int i = 0; i < length; i++) {
//			newValues[i] = values[length - 1 -i]; 
//		}
//		System.arraycopy(newValues, 0, values, 0, length);
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return length;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		char newValue[] = new char[length];
		System.arraycopy(values, 0, newValue, 0, length);
		return new String(newValue);
	}

}
