import java.util.ArrayList;
import java.util.LinkedList;
public class test{
	public static void main(String args[]){
		//ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++){
			list.addLast(1);
		}
		long end = System.currentTimeMillis();
		System.out.println(start - end);
	}
}