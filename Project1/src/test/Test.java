package test;

import java.util.Locale;

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
		
		
		//专题一
		//基本类型转封装类
		int b1 = 10;
		Integer a1 = new Integer(b1);
		//封装类转基本类型
		int c1 = a1.intValue();
		//自动装箱
		a1 = b1;
		//自动拆箱
		c1 = a1;
		//获取int最值
		c1 = Integer.MIN_VALUE;
		//格式化输出(换行可以三种表达)
		System.out.printf("%s killed %s, \r获得 %d金币\n", "盖伦", "提莫", 100); 
		System.out.format("%s killed %s, %n获得 %d金币\n", "盖伦", "提莫", 100); 
		//总长度、左对齐、补0、千分位分隔符、小数点位数、本地化表达
		System.out.printf("%,-8d", 45632);//千分位分隔符、总长度8、左对齐
		System.out.printf("%.5f%n", 456.32);//小数点位数5
		System.out.printf("%010d%n", 452);//补0
		//不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
        //常见转义字符，'\\'用来输出字符'\'
        System.out.println("使用空格无法达到对齐的效果");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");
          
        System.out.println("使用\\t制表符可以达到对齐的效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");
         
        System.out.println("一个\\t制表符长度是8");
        System.out.println("12345678def");
          
        System.out.println("换行符 \\n");
        System.out.println("abc\ndef");
 
        System.out.println("单引号 \\'");
        System.out.println("abc\'def");
        System.out.println("双引号 \\\"");
        System.out.println("abc\"def");
        System.out.println("反斜杠本身 \\");
        System.out.println("abc\\def");
		
        //比较String和StringBuffer性能
		char d1[] = new char[10];
		for (int i = 0; i < d1.length; i++) {
			d1[i] = (char)(Math.random() * 100); 
		}
		System.out.println(d1);
		String e1 = new String(d1);
		StringBuffer f1 = new StringBuffer(e1);
		String g1 = e1;
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			g1 += e1;
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.printf("String + 10000 次 所用时间为 %d毫秒 %n", (end - begin));
		begin = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			f1.append(e1);
			i++;
		}
		end = System.currentTimeMillis();
		System.out.printf("StringBuffer append 1000000 次 所用时间为 %d毫秒 %n", (end - begin));
	}
}
