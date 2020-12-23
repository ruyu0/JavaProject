package character;

public class Test {
	public static void main(String[] args) {
//		//二、数值默认值
//		int a[] = new int[10];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		//三、枚举
		//Season season = Season.valueOf("Sprin");//限制了值范围
		Season season = Season.valueOf("Spring");
		System.out.println(season);
		//遍历枚举
		for (Season season2 : Season.values()) {
			System.out.println(season2);
		}
	}
}
