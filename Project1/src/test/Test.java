package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import character.AD;
import character.ADHero;
import character.APHero;
import character.Hero;
import character.Hero.EnemyCrystal;
import character.Hero.BattleScore;
import character.Item;
import character.Season;
import myException.EnemyHeroIsDeadException;
import myStringBuffer.MyStringBuffer;

public class Test {
	public static void main(String[] args){
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
		
		
//		//专题一
//		//基本类型转封装类
//		int b1 = 10;
//		Integer a1 = new Integer(b1);
//		//封装类转基本类型
//		int c1 = a1.intValue();
//		//自动装箱
//		a1 = b1;
//		//自动拆箱
//		c1 = a1;
//		//获取int最值
//		c1 = Integer.MIN_VALUE;
//		//格式化输出(换行可以三种表达)
//		System.out.printf("%s killed %s, \r获得 %d金币\n", "盖伦", "提莫", 100); 
//		System.out.format("%s killed %s, %n获得 %d金币\n", "盖伦", "提莫", 100); 
//		//总长度、左对齐、补0、千分位分隔符、小数点位数、本地化表达
//		System.out.printf("%,-8d", 45632);//千分位分隔符、总长度8、左对齐
//		System.out.printf("%.5f%n", 456.32);//小数点位数5
//		System.out.printf("%010d%n", 452);//补0
//		//不同国家的千位分隔符
//        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
//        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
//        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
//        //常见转义字符，'\\'用来输出字符'\'
//        System.out.println("使用空格无法达到对齐的效果");
//        System.out.println("abc def");
//        System.out.println("ab def");
//        System.out.println("a def");
//          
//        System.out.println("使用\\t制表符可以达到对齐的效果");
//        System.out.println("abc\tdef");
//        System.out.println("ab\tdef");
//        System.out.println("a\tdef");
//         
//        System.out.println("一个\\t制表符长度是8");
//        System.out.println("12345678def");
//          
//        System.out.println("换行符 \\n");
//        System.out.println("abc\ndef");
// 
//        System.out.println("单引号 \\'");
//        System.out.println("abc\'def");
//        System.out.println("双引号 \\\"");
//        System.out.println("abc\"def");
//        System.out.println("反斜杠本身 \\");
//        System.out.println("abc\\def");
//		
//        //比较String和StringBuffer性能
//		char d1[] = new char[10];
//		for (int i = 0; i < d1.length; i++) {
//			d1[i] = (char)(Math.random() * 100); 
//		}
//		System.out.println(d1);
//		String e1 = new String(d1);
//		StringBuffer f1 = new StringBuffer(e1);
//		String g1 = e1;
//		long begin = System.currentTimeMillis();
//		for (int i = 0; i < 10000; i++) {
//			g1 += e1;
//		}
//		long end = System.currentTimeMillis();
//		System.out.printf("String + 10000 次 所用时间为 %d毫秒 %n", (end - begin));
//		begin = System.currentTimeMillis();
//		for (int i = 0; i < 10000000; i++) {
//			f1.append(e1);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("StringBuffer append 10000000 次 所用时间为 %d毫秒 %n", (end - begin));
//		//MyStringBuffer append性能
//		MyStringBuffer myStringBuffer = new MyStringBuffer(e1);
//		begin = System.currentTimeMillis();
//		for (int i = 0; i < 10000000; i++) {
//			myStringBuffer.append(e1);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("MyStringBuffer append 10000000次 所用时间为 %d毫秒 %n", (end - begin));
//		//MyStringBuffer delete性能
//		begin = System.currentTimeMillis();
//		int length = myStringBuffer.length();
//		for (int i = 0; i < 10000000; i++) {
//			length -= 10;
//			myStringBuffer.delete(length, length + 10);
////			//用delete（length）最快
////			myStringBuffer.delete(length);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("MyStringBuffer delete 10000000 次 所用时间为 %d毫秒 %n", (end - begin));
//		System.out.println(myStringBuffer);
//		//MyStringBuffer reverse
//		begin = System.currentTimeMillis();
//		StringBuffer stringBuffer = new StringBuffer(e1);
//		for (int i = 0; i < 10000000; i++) {
//			myStringBuffer.reverse();
////			//比较StringBuffer
////			stringBuffer.reverse();
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("MyStringBuffer reverse 10000000 次所用时间为 %d 毫秒 %n", (end - begin));
		
//		//专题二 日期和日历
//		//日期转字符串 y代表年, M代表月份，d代表，H代表24小时制的时，h代表12小时制的时，m代表分，s代表秒，S代表毫秒
//		SimpleDateFormat a2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		Date b2 = new Date();
//		System.out.println(a2.format(b2));//调整字母个数看看格式的变化，最后使用常用的个数
//		//字符串转日期
//		try {
//			b2 = a2.parse("2012-10-32 17:59:22.352");//变成11月1日！！！
//			System.out.println(b2);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Error");
//		}
//		//Calendar与Date的互相转换
//		Calendar c2 = Calendar.getInstance();
//		b2 = c2.getTime();
//		System.out.println(b2);
//		c2.setTime(b2);
//		//翻日历
//		c2.add(Calendar.DAY_OF_WEEK, 2);
//		System.out.println(c2.getTime());
//		c2.set(Calendar.YEAR, 2015);
//		System.out.println(c2.getTime());
		
//		//专题三 异常处理
////		//多异常分开catch
////		try {
////			InputStream a3 = new FileInputStream(new File("abc"));
////		} catch (IOException e) {
////			// TODO: handle exception
////		}catch (ClassCastException e) {
////			// TODO: handle exception
////		}
//		//多异常一起catch
//		try {
//			InputStream a3 = new FileInputStream(new File("abc"));
//		} catch (IOException | ClassCastException e) {
//			// TODO: handle exception
//		}
//		//throw 和 throws
//		try {
//			openAFile(new File("abc"));
//		}catch (IOException e) {
//			// TODO: handle exception
//			System.out.println("Error");
//		}
//		//自定义异常类
//		Hero b3 = new ADHero("盖伦");
//		Hero c3 = new APHero("提莫");
//		try {
//		b3.attack(c3);
//		}catch (EnemyHeroIsDeadException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
//		//专题四
//		File a4 = new File("Directory1");
//		File b4 = new File("Directory/b4.txt");
//		//创建a4,用mkdirs创建父文件，不用mkdir
//		b4.getParentFile().mkdirs();
//		try {
//			b4.createNewFile();
////			//在jvm结束删除文件
////			b4.deleteOnExit();
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		//最后修改时间
//		System.out.println(new Date(b4.lastModified()));
//		b4.setLastModified(400);
//		//重命名
//		b4.renameTo(new File("Directory/b4rename.txt"));
//		//字节流的读取和写入
//		//使用try()的方式关闭流
//		//测试文件c4.txt是utf-8编码
//		try (
//				InputStream c4 = new FileInputStream(new File("c4.txt"));
//				OutputStream e4 = new FileOutputStream("c4.txt", true);//true参数kong控制写入开头和结尾
//				){
//			//不同方式写入
//			e4.write("写入一行数据\n".getBytes(Charset.forName("utf-8")));
//			e4.write("写入一行数据\n".getBytes());
//			byte[] d4 = new byte[(int)new File("c4.txt").length()];
//			c4.read(d4);//写入是立刻写到文件中的，所以可以立刻读取到
//			//不同方式编码读取的字节数组
//			System.out.println(new String(d4));
//			System.out.println(new String(d4, Charset.forName("utf-8")));
//		}catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		//字符流的读取和写入
//		//在try中关闭
//		try {
//			Writer g4 = new FileWriter("f4.txt", true);
//			Reader f4 = new FileReader("f4.txt");
//			g4.write("写入一行数据\n".toCharArray());
//			//写入的内容暂时没有写到文件中，要关闭写才行,或者使用flush
//			g4.close();
//			char[] h4 = new char[(int)new File("f4.txt").length() / 2];
//			f4.read(h4);
//			System.out.println(h4);
//			f4.close();
//		}catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		//字符流正确读写中文
//		//使用OutputStreamWriter,OutputStreamWriter
//		//在finally中关闭
//		//测试文件i4.txt是utf-8编码
//		InputStreamReader i4 = null;
//		OutputStreamWriter j4 = null;
//		try {
//			j4 = new OutputStreamWriter(new FileOutputStream("i4.txt", true), Charset.forName("utf-8"));
//			j4.write("写入一行数据\n");
//			
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			if (j4 != null) {
//				try {
//					j4.close();
//				} catch (IOException e2) {
//					// TODO: handle exception
//					e2.printStackTrace();
//				}
//			}
//		}
//		try {
//			i4 = new InputStreamReader(new FileInputStream("i4.txt"), Charset.forName("utf-8"));
////			//比较使用默认编码gbk
////			i4 = new InputStreamReader(new FileInputStream("i4.txt"));
//			char[]	k4 = new char[(int)new File("i4.txt").length() / 2];
//			i4.read(k4);
//			System.out.println(new String(k4));
//		}catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			if (null != i4) {
//				try {
//					i4.close();
//				} catch (IOException e2) {
//					// TODO: handle exception
//					e2.printStackTrace();
//				}
//			}
//		}
//		//缓存流读写
//		try(
//
//				//使用PrintWriter写入
//				PrintWriter m4 = new PrintWriter(new File("l4.txt"));
////				BufferedWriter m4 = new BufferedWriter(new FileWriter("l4.txt"));
//				BufferedReader l4 = new BufferedReader(new FileReader("l4.txt"));
////				//使用utf-8来读取缓存流
////				BufferedReader l4 = new BufferedReader(
////						new InputStreamReader(
////								new FileInputStream("l4.txt"), 
////								Charset.forName("utf-8")));
//				){
//			m4.write("写入一行数据\n");
//			m4.flush();
//			char[] n4 = new char[(int)new File("l4.txt").length() / 2];
//			l4.read(n4);
//			
//			System.out.println(n4);
//		}catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		//对象流
//		try(
//				ObjectOutputStream o4 = new ObjectOutputStream(new FileOutputStream("o4.data"));
//				ObjectInputStream p4 = new ObjectInputStream(new FileInputStream("o4.data"));
//				){
//			Hero[] q4 = new Hero[] {
//					new ADHero("ez"),
//					new APHero("提莫"),
//					new ADHero("盖伦"),
//					null//添加null来判断流读取完!!!!
//			};
//			for (Hero e : q4) {
//				o4.writeObject(e);
//			}
//			Hero r4 = (Hero)p4.readObject();
//			while (r4 != null) {
//				System.out.println(r4);
//				r4 = (Hero)p4.readObject();
//			}
//		}catch (IOException | ClassNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		
		
		
		
	}
	
	private static void openAFile(File f) throws IOException{
		try {
			InputStream inputStream = new FileInputStream(f);
			
		} catch (IOException e) {
			// TODO: handle exception
			throw e;
		}
		
	}
}
