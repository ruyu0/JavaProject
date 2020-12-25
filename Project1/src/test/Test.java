package test;

import character.AD;
import character.ADHero;
import character.APHero;
import character.Hero;
import character.Hero.EnemyCrystal;
import character.Hero.BattleScore;
import character.Item;
import character.Season;

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
		
//		//七、多态
//		Hero a7 = new ADHero("寒冰");
//		Item b7 = new LifePotion();
//		Item c7 = new MagicPotion();
//		a7.useItem(b7);
//		a7.useItem(c7);
		
//		//十二、内部类
//		//非静态内部类、成员内部类
//		Hero a12 = new ADHero("寒冰");
//		//成员内部类必须有对应外部类实例才能创建和初始化
//		Hero.BattleScore b12 = a12.new BattleScore();
//		//成员内部类可以访问外部类的所有成员
//		b12.legendary();
//		//当内部类和外部类出现同名成员时
//		b12.showHeroName();
//		//外部类访问内部类成员
//		a12.getKill();
//		
//		//静态内部类
//		EnemyCrystal c12 = new EnemyCrystal();
//		//静态内部类可以访问外部类的私有静态成员；
//		c12.checkIfVictory();
//		
//		//匿名类
//        Hero h12 = new Hero("ez"){
//            //当场实现attack方法
//        	@Override
//            public void attack() {
//                System.out.println("新的进攻手段");
//            }
//        };
//        h12.attack();
//        //通过打印h，可以看到h这个对象属于test.Test$1这么一个系统自动分配的类名
//        System.out.println(h12);
		
		
	}
}
