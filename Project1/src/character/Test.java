package character;

public class Test {
	public static void main(String[] args) {
//		//二、数值默认值
//		int a[] = new int[10];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
//		//三、枚举
//		//Season season = Season.valueOf("Sprin");//限制了值范围
//		Season season = Season.valueOf("Spring");
//		System.out.println(season);
//		//遍历枚举
//		for (Season season2 : Season.values()) {
//			System.out.println(season2);
//		}
		
		
//		//四、类型转换
//		//子类转父类
//		Hero b4 = new ADHero("寒冰");
//		//父类转子类
////		ADHero d4 = (ADHero)a4;//无法转型
//		ADHero e4 = (ADHero)b4;
//		System.out.println(b4 = e4);
//		//实现类转接口
//		AD f4 = new ADHero("ez");
//		//接口转实现类
////		ADAPHero g4 = (ADAPHero)f4;//无法转型
//		ADHero h4 = (ADHero)f4;
//		System.out.println(h4 == f4);
		
		//七、多态
		Hero a7 = new ADHero("寒冰");
		Item b7 = new LifePotion();
		Item c7 = new MagicPotion();
		a7.useItem(b7);
		a7.useItem(c7);
		
	}
}
