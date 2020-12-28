package myStringBuffer;

public interface IStringBuffer {
	void append(String s);
	void append(char c);
	void insert(int index, String s);
	void insert(int index, char c);
	void delete(int start);
	void delete(int start, int end);
	void reverse();
	int length();
}
