package character;

public class Test {
	public static void main(String[] args) {
//		//������ֵĬ��ֵ
//		int a[] = new int[10];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		//����ö��
		//Season season = Season.valueOf("Sprin");//������ֵ��Χ
		Season season = Season.valueOf("Spring");
		System.out.println(season);
		//����ö��
		for (Season season2 : Season.values()) {
			System.out.println(season2);
		}
	}
}
