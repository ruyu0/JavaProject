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
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;
import java.util.stream.Stream;

import javax.net.ssl.SSLEngineResult.Status;
import javax.sql.DataSource;

import org.omg.CORBA.TIMEOUT;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import battle.Attack;
import character.AD;
import character.ADAPHero;
import character.ADHero;
import character.APHero;
import character.Hero;
import character.Hero.EnemyCrystal;
import comparator.HeroComparatorByHp;
import conneticon_pool.MyConnectionPool;
import character.Hero.BattleScore;
import character.Item;
import character.Season;
import myException.EnemyHeroIsDeadException;
import myHashMap.MyHashMap;
import myStringBuffer.MyStringBuffer;
import mytree.BTree;
import orm_dao.HeroDAO;
import produce_consumer.Consumer;
import produce_consumer.ConsumerPool;
import produce_consumer.MyBlockingStack;
import produce_consumer.MyThreadPool;
import produce_consumer.Producer;

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

//		//TODO:专题一
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

//		//TODO:专题二 日期和日历
//		//日期转字符串 y代表年, M代表月份，d代表，H代表24小时制的时，h代表12小时制的时，m代表分，s代表秒，S代表毫秒
//		SimpleDateFormat a2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		Date b2 = new Date();
//		System.out.println(a2.format(b2));//调整字母个数看看格式的变化，最后使用常用的个数
//		//字符串转日期
//		try {
//			b2 = a2.parse("2012-10-32 17:59:22.352");//变成11月1日！！！
//			System.out.println(b2);
//		} catch (Exception e) {
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

//		//TODO:专题三 异常处理
////		//多异常分开catch
////		try {
////			InputStream a3 = new FileInputStream(new File("abc"));
////		} catch (IOException e) {
////		}catch (ClassCastException e) {
////		}
//		//多异常一起catch
//		try {
//			InputStream a3 = new FileInputStream(new File("abc"));
//		} catch (IOException | ClassCastException e) {
//		}
//		//throw 和 throws
//		try {
//			openAFile(new File("abc"));
//		}catch (IOException e) {
//			System.out.println("Error");
//		}
//		//自定义异常类
//		Hero b3 = new ADHero("盖伦");
//		Hero c3 = new APHero("提莫");
//		try {
//		b3.attack(c3);
//		}catch (EnemyHeroIsDeadException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

//		//TODO:专题四
//		File a4 = new File("Directory1");
//		File b4 = new File("Directory/b4.txt");
//		//创建a4,用mkdirs创建父文件，不用mkdir
//		b4.getParentFile().mkdirs();
//		try {
//			b4.createNewFile();
////			//在jvm结束删除文件
////			b4.deleteOnExit();
//		} catch (IOException e) {
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
//			e.printStackTrace();
//		}finally {
//			if (j4 != null) {
//				try {
//					j4.close();
//				} catch (IOException e2) {
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
//			e.printStackTrace();
//		}finally {
//			if (null != i4) {
//				try {
//					i4.close();
//				} catch (IOException e2) {
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
//			e.printStackTrace();
//		}

//		//TODO:专题五
//		//数组和ArrayList的互换
//		ArrayList<Hero> a5 = new ArrayList<>();
//		a5.add(new ADHero("ez"));
//		a5.add(new APHero("提莫"));
//		//ArrayList转数组
//		Hero[] b5 = a5.toArray(new Hero[] {});
//		//数组转ArrayList
//		//方法一
//		a5 = new ArrayList<Hero>(Arrays.asList(b5));
//		//方法二
//		Collections.addAll(a5, b5);
//		//方法三
//		a5.addAll(Arrays.asList(b5));
//		//方法四：使用Spring框架将数组转换为List?????
//		//Spring框架中的CollectionUtils提供了几个方法来将数组转换为Arraylist。
//		//例如：CollectionUtils.arrayToList()。当然，返回的List是不可修改的，不能add()或remove()元素。
//		for (Hero e : b5) {
//			System.out.println(e);
//		}
//		for (Hero eHero : a5) {
//			System.out.println(eHero);
//		}
//		//Iterator方法遍历
//		System.out.println("iterator方法遍历");
//		Iterator<Hero> c5 = a5.iterator();
//		while(c5.hasNext()) {
//			System.out.println(c5.next());
//		}

//		BTree<Integer> e5 = new BTree<Integer>();
//		Integer f5[] = new Integer[100];
//		for (int i = 0; i < f5.length; i++) {
////			f5[i] = new Integer((int)(Math.random() * 100));
//			f5[i] = i;
//		}
//		
//		long g5 = System.currentTimeMillis();
//		e5.createBTreesec(f5);
//		long h5 = System.currentTimeMillis();
//		System.out.println("used " + (h5 - g5) + "ms");
//		System.out.println(e5.data);
//		//三大遍历
//		e5.postOrderTraverse();
//		//层序遍历
//		e5.levelOrderTraverse();

//		// TODO:比较使用HashMap查找的方法性能，找出数量和所在位置
//		// 准备一个ArrayList其中存放3000000(三百万个)Integer对象，其名称是随机的,格式是[4位随机数]
//		ArrayList<Integer> i5 = new ArrayList<>();
//		for (int i = 0; i < 3000000; i++) {
//			// eclipse输出有限制，没办法只能是6622，具体可以通过cmd测试
//			i5.add((int) (Math.random() * 6622));
//		}
//		//把值相同的数据所在的ArrayList的位置存在一个List中，这个List作为一个value，这个数据值作为一个key，存入HashMap中
//		HashMap<Integer, List<Integer>> j5 = new HashMap<>();
//		for (int i = 0; i < 3000000; i++) {
//			Integer temp = i5.get(i);
//			if (j5.containsKey(temp)) {
//				j5.get(temp).add(i);
//			}
//			else {
//				List<Integer> tempList = new ArrayList<>();
//				tempList.add(i);
//				j5.put(temp, tempList);
//			}
//		}
//		//测试ArrayList的查找
//		int k5 = (int)(Math.random() * 10000);
//		int l5 = 0;
//		long m5 = System.currentTimeMillis();
//		for (int i = 0; i < 3000000; i++) {
//			if (i5.get(i) == k5) {
////				System.out.print(i + " ");
//				l5++;
//			}
//		}
//		System.out.println(l5);
//		long n5 = System.currentTimeMillis();
//		System.out.println("used " + (n5 - m5) + "ms");
//		//测试HashMap的查找
//		m5 = System.currentTimeMillis();
//		List<Integer> o5 = j5.get(new Integer(k5));
////		for (int i = 0; i < o5.size(); i++) {
////			System.out.print(o5.get(i) + " ");
////		}
//		System.out.println(o5.size());
//		n5 = System.currentTimeMillis();
//		System.out.println("used " + (n5 - m5) + "ms");

//		//HashSet顺序不确定，不同jvm版本顺序不同
//		Set<Integer> p5 = new HashSet<>();
//		//从10 到 1插入
//		for (int i = 10; i > 0; i--) {
//			p5.add(i);
//		}
//		//Set没有get方法，用迭代遍历
//		//从1 到10 输出
//		for (int e : p5) {
//			System.out.print(e + " ");
//		}
//		System.out.println();
//		//找出重复数据的数据种数
//		long q5 = System.currentTimeMillis();
//		p5 = new HashSet<>();
//		p5.addAll(i5);
//		for (Integer e : p5)
//			System.out.print(e + " ");
//		System.out.println();
//		System.out.println("total " + p5.size());
//		System.out.println("used " + (System.currentTimeMillis() - q5) + "ms");

//		//Collections
//		//不能用基本类型的数组转list，会识别成数组的list表
//		List<Integer> r5 = Arrays.asList(7, 2, 3, 4, 6, 5, 8);
//		for (Integer integer : r5) {
//			System.out.print(integer + " ");
//		}
//		System.out.println();
////		Collections.reverse(r5);
////		Collections.shuffle(r5);
////		Collections.sort(r5);
////		Collections.swap(r5, 0, r5.size() - 1);
////		Collections.rotate(r5, 2);
//		for (Integer integer : r5) {
//			System.out.print(integer + " ");
//		}
//		System.out.println();
//		//synchronizedList 把非线程安全的List转换为线程安全的List（未完成）

////		比较ArrayList和LinkedList的插入性能，在不同情况下，两者的性能不同
//		//未完成，见cmd运行文件
//		ArrayList<Integer> s51 = new ArrayList<>();
//		LinkedList<Integer> s52 = new LinkedList<>();
//		long t51 = System.currentTimeMillis();
//		//循环会影响其他测试？？？？？
//		for (int i = 0; i < 2000000; i++) {
//			s51.add(1);
//		}
//		System.out.println("used " + (System.currentTimeMillis() - t51) + "ms");
//		long t52 = System.currentTimeMillis();
//		//会受到上面循环数量的影响？？？？？？
//		for (int i = 0; i < 10000000; i++) {
//			s52.addFirst(1);
//		}
//		System.out.println("used " + (System.currentTimeMillis() - t52) + "ms");

//		//HashMap中get和containKey的使用
//		//要先判断是否存在key用containKey再用get，因为HashMap存在value为null
//		HashMap<Integer, String> u5 = new HashMap<>();
//		u5.put(1, null);
//		if (u5.containsKey(1))
//			System.out.println(u5.get(1));
//		if (u5.containsKey(2))
//			System.out.println(u5.get(2));

//		//反转HashMap
//		HashMap<String,String> map = new HashMap<>();
//        HashMap<String,String> temp = new HashMap<>();
//        map.put("adc", "物理英雄");
//        map.put("apc", "魔法英雄");
//        map.put("t", "坦克");
//        System.out.println("初始化后的Map:");
//        System.out.println(map);
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            String value = map.get(key);
//            temp.put(value, key);
//        }
//        //清除原map
//        map.clear();
//        //将临时map导入原map
//        map.putAll(temp);
//        System.out.println("反转后的Map:");
//        System.out.println(map);

//        //比较三种set
//        //把Math.PI中的数字，按照出现顺序打印出来，相同数字，只出现一次
//        double v5 = Math.PI;
//        Set<Integer> v51 = new HashSet<>();
//        Set<Integer> v52 = new LinkedHashSet<>();
//        Set<Integer> v53 = new TreeSet<>();
//        for (int i = 0; i < 10;) {
//        	Integer temp = (int)v5;
//        	v5 = (v5 - temp) * 10;
//        	System.out.println(v5);
//        	if (v51.add(temp)) {
//        		v52.add(temp);
//        		v53.add(temp);
//        		i++;
//        	}
//        }
//        for (Integer e : v51) {
//        	System.out.print(e + " ");
//        }
//        System.out.println();
//        for (Integer e : v52) {
//        	System.out.print(e + " ");
//        }
//        System.out.println();
//        for (Integer e : v53) {
//        	System.out.print(e + " ");
//        }
//        System.out.println();

//		//自定义字符串的hashcode
//		String w5 = new Scanner(System.in).nextLine();
//		myHashcode(w5);
//		System.out.println(w5.hashCode());

//		// TODO:自定义HashMap(myHashMap)并由此和ArrayList(x5)比较查找性能
//		MyHashMap<Integer, LinkedList<Integer>> myHashMap = new MyHashMap<>();
//		ArrayList<Integer> x5 = new ArrayList<>();
//		for (int i = 0; i < 3000000; i++) {
//			int temp = (int) (Math.random() * 30000);
//			x5.add(temp);
//			LinkedList<Integer> list = myHashMap.get(temp);
//			if (list == null) {
//				list = new LinkedList<>();
//				list.add(i);
//				myHashMap.put(temp, list);
//			} else {
//				list.add(i);
//			}
//		}
//		//随机拿十个数来测试查找性能，查找第一个查到的
//		for (int i = 0; i < 10; i++) {
//			int temp = (int)(Math.random() * 30000);
//			long start = System.currentTimeMillis();
//			System.out.print(x5.indexOf(temp));
//			System.out.println("使用indexOf耗时" + (System.currentTimeMillis() - start) + "毫秒");
//			start = System.currentTimeMillis();
//			LinkedList<Integer> list = myHashMap.get(temp);
//			System.out.print(list == null ? null : list.getFirst());
//			System.out.println("使用MyHashMap耗时" + (System.currentTimeMillis() - start) + "毫秒");
//		}

//		// 两种比较定义
//		Hero[] y5 = new Hero[] { new ADHero("timo", 10), new APHero("jialiao", 20), new ADAPHero("xiaopao", 2) };
//		ArrayList<Hero> z5 = new ArrayList<>();
//		z5.addAll(Arrays.asList(y5));
//		//使用comparable
//		System.out.print("未排序数组：");
//		for (Hero h : y5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		//可以排序
//		Arrays.sort(y5);
//		System.out.print("排序后数组：");
//		for (Hero h : y5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		z5.add(new ADHero("gailun", 1));
//		System.out.print("未排序集合：");
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		Collections.sort(z5);
//		System.out.print("排序集合：");
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		//使用比机器比较
//		Collections.shuffle(z5);
//		y5[0].setHp(100);
//		Arrays.sort(y5, new HeroComparatorByHp());
//		System.out.print("排序数组：");
//		for (Hero h : y5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		System.out.print("未排序集合：");
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		Collections.sort(z5, new HeroComparatorByHp());
//		System.out.print("排序集合：");
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();

		// 耦合操作

//		//TODO:专题六
//		//上界通配符和泛型方法
//		ArrayList<ADHero> c6 = new ArrayList<>();
//		c6.add(new ADHero("gailun", 100));
//		c6.add(new ADHero("ez", 10));
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		for (Hero h : c6) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		//泛型方法的调用
//		//支持泛型的类作为参数时，泛型使用受限通配符可以接受不同泛型类的参数
//		Test.<Hero>a6(z5, c6);
////		//或者
////		a6(z5, c6);
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		for (Hero h : c6) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();

//		//多重边界限定
//		Test.<Integer>b6(new Integer(10));
//		b6(new Integer(20));

//		//Class<T>和Class<?>的区别
//		try {
//			//对比两者的返回类型
//			Date d6 = Date.class.newInstance();
//			d6 = (Date)Class.forName("java.util.Date").newInstance();
//			System.out.println(d6);
//		}catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
//			e.printStackTrace();
//		}

//		// TODO:专题七
//		for (Hero h : z5) {
//			System.out.print(h + "" + h.getHp() + " ");
//		}
//		System.out.println();
//		//匿名类方式
//		//注意泛型的使用Comparator<Object>也可以
//		Comparator<? super Hero> a7 = new Comparator<Hero>() {
//			@Override
//			public int compare(Hero o1, Hero o2) {
//				return 0;
//			}
//		};
//		Collections.sort(z5, a7);
//		// Lambda方式，对比匿名类方式，作用相同的，只有一个参数时可以不用括号，只有1条语句可以不加{}
//		Collections.sort(z5, (o1, o2) -> {
//			if (o1.getHp() > o2.getHp())
//				return 1;
//			if (o2.getHp() > o1.getHp())
//				return -1;
//			else {
//				return 0;
//			}
//		});
//		//引用静态方法，参数对应
//		//lambda表达
////		Collections.sort(z5, (o1, o2) -> b7(o1, o2));
//		//方式
//		Collections.sort(z5, Test::b7);
//		//对比参数为Object和Hero，也可以编译运行
//		Collections.sort(z5, Test::b71);
//		//引用对象方法
//		//lambda表达
////		Collections.sort(z5, (o1, o2) -> new Test().c7(o1, o2));
//		//引用对象方法的方式
//		Collections.sort(z5, new Test()::c7);
//		//引用Lambda的参数中的对象方法
//		//注意compareTo的参数只有一个，只需要处理其他剩余参数
//		//lambda表达
////		Collections.sort(z5, (o1, o2) -> o1.compareTo(o2));
//		//引用Lambda的参数中的对象的方式
//		Collections.sort(z5, Hero::compareTo);
//		for (Hero h : z5) {
//			System.out.print(h + "" + h.getHp() + " ");
//		}
//		System.out.println();
//		//引用构造器
//		//lambda表达
//		System.out.println(d7(() -> new Integer(1)));
//		//引用构造器方式
//		//参数必须一致，所以此时调用的时默认构造器
//		System.out.println(d7(Date::new));
//		//聚合操作
//		//集合框架
//		z5.stream()
//		.filter(h -> h.getHp() >= 10)
//		.forEach(h -> System.out.print(h + "" + h.getHp() + " "));
//		System.out.println();
//		//数组
////		Arrays.stream(y5)
//		Stream.of(y5)
//		.filter(h -> h.getHp() >= 10)
//		.forEach(h -> System.out.print(h + "" + h.getHp() + " "));
//		System.out.println();
//		// TODO:比较串行流，并行流的聚合操作和集合的查找性能
//		for (int i = 0; i < 10; i++) {
//			int test = (int) (Math.random() * 30000);
//			long start = System.currentTimeMillis();
//			Long number = x5.stream().filter(h -> h == test).count();
//			System.out.println("使用stream测试共有" + number + "个，耗时" + (System.currentTimeMillis() - start) + "毫秒");
//			start = System.currentTimeMillis();
//			number = x5.parallelStream().filter(h -> h == test).count();
//			System.out.println("使用parallelStream测试共有" + number + "个，耗时" + (System.currentTimeMillis() - start) + "毫秒");
//			start = System.currentTimeMillis();
//			List<Integer> list = myHashMap.get(test);
//			number = list == null ? 0 : (long) list.size();
//			System.out.println("使用MyHashMap测试共有" + number + "个，耗时" + (System.currentTimeMillis() - start) + "毫秒");
//			start = System.currentTimeMillis();
//			number = 0l;
//			for (int e : x5) {
//				if (e == test)
//					number++;
//			}
//			System.out.println("使用迭代遍历测试共有" + number + "个，耗时" + (System.currentTimeMillis() - start) + "毫秒");
//			// 使用线程进行查找，速度略慢于parallelStream
//			start = System.currentTimeMillis();
//			// 用于计算数目
//			AtomicInteger numberThread = new AtomicInteger(0);
//			// 用于判断线程结束
//			AtomicInteger countThread = new AtomicInteger(10);
//			// 这个线程为了让所有线程都启动了,全部在等待访问数组列表时再开始计算
//			AtomicLong startLong = new AtomicLong(start);
//			new Thread() {
//				@Override
//				public void run() {
//					synchronized (x5) {
//						try {
//							Thread.sleep(1000);
//						} catch (InterruptedException e) {
//						}
//						startLong.set(System.currentTimeMillis());
//					}
//				}
//			}.start();
//			for (int j = 0; j < 10; j++) {
//				// m是为了让线程进行访问外部变量，因为j一直在赋值，匿名类无法将j识别成final，不能访问j。
//				int m = j;
//				new Thread() {
//					@Override
//					public void run() {
//						int l = m;
//////						查看线程是否都启动
////						System.out.println("启动线程" + m);
//						// 因为是一段一段的截取查找所以不会有竞争状态
//						for (int k = 0; k < 300000; k++) {
//							if (x5.get(l * 300000 + k) == test) {
//								numberThread.incrementAndGet();
//							}
//						}
//						// 每个线程结束都会减1
//						countThread.decrementAndGet();
//					};
//				}.start();
//			}
//			// 判断所有线程是否结束
//			// 用join会多消耗时间
//			while (countThread.get() > 0)
//				;
//
//			start = startLong.get();
//			System.out.println(
//					"使用多线程来查找测试共有" + numberThread.get() + "个，耗时" + (System.currentTimeMillis() - start) + "毫秒");
//			// 使用线程池进行查找
//			//重新设置线程计数器10和结果数目0
//			countThread.set(10);
//			numberThread.set(0);
//			//新建线程池
//			ThreadPoolExecutor q8 = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS,
//					new LinkedBlockingDeque<Runnable>());
//			start = System.currentTimeMillis();
//			for (int j = 0; j < 10; j++) {
//				int m = j;
//				q8.execute(new Thread() {
//					@Override
//					public void run() {
//						int l = m;
//////						查看线程是否都启动
////						System.out.println("启动线程" + m);
//						// 因为是一段一段的截取查找所以不会有竞争状态
//						for (int k = 0; k < 300000; k++) {
//							if (x5.get(l * 300000 + k) == test) {
//								numberThread.incrementAndGet();
//							}
//						}
//						// 每个线程结束都会减1
//						countThread.decrementAndGet();
//					};
//				});
//			}
//			while (countThread.get() > 0)
//				;
//			System.out.println(
//					"使用线程池来查找测试共有" + numberThread.get() + "个，耗时" + (System.currentTimeMillis() - start) + "毫秒");
//			System.out.println();
//
//		}

//		//TODO：专题八 多线程
//		//英雄的并行攻擊
//		Hero a81 = new ADHero("盖伦", 7, 4, 10);
//		Hero a82 = new ADHero("伊泽瑞尔", 1, 10, 3);
//		Hero a83 = new APHero("提莫", 3, 3, 11);
//		Thread b812 = new Thread(new Attack(a81, a82));
//		Thread b821 = new Thread(new Attack(a82, a81));
//		Thread b832 = new Thread(new Attack(a83, a82));
//		b812.start();
//		b821.start();
//		b832.start();
//		//使用匿名类创建多线程
//		new Thread() {
//			@Override
//			public void run() {
//				System.out.println("用Thread匿名类创建多线程");
//			};
//		}.start();
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("用Runnable匿名类创建多线程");
//			}
//		}).start();;
//		//Lambda
//		new Thread(() -> System.out.println("Lambda创建多线程"))
//		.start();
		// 使用多线程查找的性能测试
		// 代码在上一专题最后一项性能测试中
		//
//		//join 必须先start才能join
//		Thread c8 = new Thread() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++)
//					System.out.println(i);
//			}
//		};
//		c8.start();
//		//比较有无join的情况
//		try {
//			c8.join();
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(9999);
//		//线程优先级
//		//设定两个攻速都为的英雄相互攻击，这样可以看到资源争夺
//		Hero d81 = new ADHero("卡萨", 7, 10, 0);
//		d81.setHp(1000);
//		Hero d82 = new ADHero("小炮", 7, 10, 0);
//		d82.setHp(1000);
//		Thread e812 = new Thread(new Attack(d81, d82));
//		Thread e821 = new Thread(new Attack(d82, d81));
//		//在资源十分充足时无法看到效果
//		e812.setPriority(Thread.MAX_PRIORITY);
//		e821.setPriority(Thread.MIN_PRIORITY);
//		Thread f8 = new Thread() {
//			@Override
//			public void run() {
//				while (true)
//					System.out.println("This is a deamon thread");
//			}
//		};
//		//必须在启动线程前设置为守护线程才有用
//		//所有用户程序结束后会自动停止的
//		f8.setDaemon(true);
//		f8.start();
//		System.out.println("看看守护线程是不是最后");
//		// 同步问题和解决办法
//		// g8为多个线程需要近乎同时访问量
//		Hero g8 = new ADHero("gailun");
//		g8.setHp(10000);// 初始血量为10000
//		// 受伤和回血各10000个线程
//		Thread[] h8attack = new Thread[100000];
//		Thread[] h8addHp = new Thread[100000];
//		for (int i = 0; i < 10000; i++) {
//			// j代替i，使匿名类可以访问
//			int j = i;
//			h8attack[i] = new Thread() {
//				@Override
//				public void run() {
////					// 解決辦法
////					//synchronized必须在线程里面才能使线程独占
////					synchronized (g8) {
//						g8.setHp(g8.getHp() - 1);
//						System.out.println("盖伦受到英雄" + j + "的攻击，目前血量为" + g8.getHp());
////					}
//				};
//			};
//			// 启动受伤线程
//			h8attack[i].start();
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
////					// 解決辦法
////					synchronized (g8) {
//						g8.setHp(g8.getHp() + 1);
//						System.out.println("盖伦受到英雄" + j + "的治疗，目前血量为" + g8.getHp());
////					}
//				};
//			};
//			// 启动回血线程
//			h8addHp[i].start();
//		}
//		// 等待所有线程完成
//		try {
//			for (int i = 0; i < 10000; i++) {
//				h8attack[i].join();
//				h8addHp[i].join();
//			}
//		} catch (InterruptedException e) {
//		}
//		// 结果
//		System.out.println("最后盖伦的血量为" + g8.getHp());
//		//实例方法前加synchronized所对应的同步对象是this
//		for (int i = 0; i < 10000; i++) {
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//					}
//					//在实例方法中修饰为synchronized
//					g8.recover();
//				}
//			};
//			h8addHp[i].start();
//		}
//		try {
//			for (int i = 0; i < 10000; i++) {
//				h8addHp[i].join();
//			}
//		} catch (InterruptedException e) {
//		}
//		//结果，对比有无已同步
//		System.out.println("恢复10000次1点血后，血量为" + g8.getHp());
//		//线程安全类
//		//对比StringBuilder的线程操作和StringBuffer的线程操作和性能比较
//		//几乎看不出性能差别，而且脏数据不能用的。
//		String i8 = "";
//		for (int i = 0; i < 100000; i++) {
//			i8 = i8 + 'a';
//		}
//		StringBuilder i81 = new StringBuilder(i8);
//		StringBuffer i82 = new StringBuffer(i8);
//		//对StringBuilder的实例进行减少操作
//		long j8 = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
//					//延时用于产生更多同时对实例的访问机会和性能测试
//					try {
//						Thread.sleep(10);
//					}catch (InterruptedException e) {
//					}
//					i81.append('a');
//				}
//			};
//			h8addHp[i].start();
//		}
//		try {
//			for (int i = 0; i < 100000; i++) {
//				h8addHp[i].join();
//			}
//		}catch (InterruptedException e) {
//		}
//		//多试几次，会发现产生同步修改冲突的脏数据
//		System.out.println(i81.length() + "消耗时间" + (System.currentTimeMillis() - j8) + "ms");
//		//对StringBuffer实例的减少操作
//		j8 = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
//					//延时用于产生更多同时对实例的访问机会和性能测试
//					try {
//						Thread.sleep(10);
//					}catch (InterruptedException e) {
//					}
//					i82.append('a');
//				}
//			};
//			h8addHp[i].start();
//		}
//		try {
//			for (int i = 0; i < 100000; i++) {
//				h8addHp[i].join();
//			}
//		}catch (InterruptedException e) {
//		}
//		//StringBuffer同步访问冲突
//		System.out.println(i82.length() + "消耗时间" + (System.currentTimeMillis() - j8) + "ms");
//		List<Integer> k81 = new ArrayList<>();
//		//由后面可知，并不会重新生成新的表的存储空间，两者还是指向同一个表
//		List<Integer> k82 = Collections.synchronizedList(k81);
//		for (int i = 0; i < 100000; i++) {
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
////					//线程安全化后不可再对之前的对象进行操作，否则一样不安全，因为两者底层还是同一个表
////					k81.add(1);
//					k82.add(1);
//				}
//			};
//			h8addHp[i].start();
//		}
//		try {
//			for (int i = 0; i < 100000; i++) {
//				h8addHp[i].join();
//			}
//		} catch (InterruptedException e) {
//		}
//		//由下可知两者底层还是同一个表
//		System.out.println(k81.size());
//		System.out.println(k82.size());
//		// 死锁演示
//		AtomicInteger l81 = new AtomicInteger();
//		AtomicInteger l82 = new AtomicInteger();
//		new Thread() {
//			@Override
//			public void run() {
//				System.out.println("线程1对第一个数进行操作");
//				synchronized (l81) {
//					System.out.println("操作成功");
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//					}
//					System.out.println("线程1对第二个数进行操作");
//					//open用于判断是否可以访问
//					AtomicBoolean open = new AtomicBoolean(false);
//					//这个线程输出了操作是否成功
//					new Thread() {
//						@Override
//						public void run() {
//							try {
//								Thread.sleep(5000);
//							} catch (InterruptedException e) {
//							}
//							if (open.get()) {
//								System.out.println("操作成功");
//							}else{
//								System.out.println("线程1无法操作成功");
//							}
//							
//						};
//					}.start();
//					synchronized (l82) {
//						//表示可以访问
//						open.set(true);
//					}
//				}
//			}
//		}.start();
//		new Thread() {
//			@Override
//			public void run() {
//				System.out.println("线程2对第二个数进行操作");
//				synchronized (l82) {
//					System.out.println("操作成功");
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//					}
//					System.out.println("线程2对第一个数进行操作");
//					//open用于判断是否可以访问
//					AtomicBoolean open = new AtomicBoolean(false);
//					new Thread() {
//						@Override
//						public void run() {
//							try {
//								Thread.sleep(5000);
//							} catch (InterruptedException e) {
//							}
//							if (open.get()) {
//								System.out.println("操作成功");
//							}else{
//								System.out.println("线程2无法操作成功");
//							}
//							
//						};
//					}.start();
//					synchronized (l81) {
//						open.set(true);
//					}
//				}
//			};
//		}.start();
//		// 线程间的交互
//		// 加血，减血两个线程处理同一个英雄。减血的线程发现血量=1，就停止减血，直到加血的线程为英雄加了血，才可以继续减血。
//		// 使用wait和notify
//		Hero n8 = new ADHero("gailun");
//		n8.setHp(100);
//		//加血线程
//		Thread m81 = new Thread() {
//			@Override
//			public void run() {
//				super.run();
//				while(true) {
//					try {
//						Thread.sleep(110);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					synchronized (n8) {
//						System.out.print("目前血量为" + n8.getHp() + ",尝试恢复10点...");
//						n8.recover(10);
//						System.out.println("恢复成功");
//						//唤醒原先对该对象的访问时wait的线程
//						n8.notify();
//					}
//				}
//			}
//		};
//		m81.start();
//		//减血线程，设计比加血快
//		Thread m82 = new Thread() {
//			@Override
//			public void run() {
//				super.run();
//				while(true) {
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					//wait必须在synchronized里面
//					synchronized (n8) {
//						if (n8.getHp() > 0) {
//							System.out.print("目前血量为" + n8.getHp() + ",尝试减少1点...");
//							n8.reduce();
//							System.out.println("扣血成功");
//						}else {
//							System.out.println("英雄已死");、
//							//英雄没血了，让访问该对象的动作先暂停占用该对象等待唤醒
//							try {
//								n8.wait();
//							} catch (InterruptedException e) {
//							}
//						}
//					}
//				}
//			}
//		};
//		m82.start();
//		// 生产者消费者问题
//		// 如何實現生產少時加快生產，生產多少減慢生產？？？？
//		MyBlockingStack<String> o8 = new MyBlockingStack<>(new Stack<String>());
//		//7條生產綫
//		for (int i = 0; i < 7; i++) {
//			new Producer(o8).start();
//		}
//		//3條消費綫
//		for (int i = 0; i < 3; i++) {
//			new Consumer(o8).start();
//		}
//		//线程池设计思路：由消费者问题联系的綫程池
//		//o8相当于任务队列
//		ConsumerPool p8 = new ConsumerPool(o8);
//		for (int i = 0; i < 10; i++) {
//			p8.execute(new Consumer(o8));
//		}
//		for (int i = 0; i < 1000; i++) {
//			o8.push(new Scanner(System.in).nextLine());
//		}
//		//TODO:自定义线程池与测试
//		MyThreadPool myThreadPool = new MyThreadPool(10);
//		try {
//			Thread.sleep(100);
//			System.out.println("等待线程池中的线程全部启动");
//		} catch (InterruptedException e) {
//		}
//		for (int i = 0; i < 100; i++) {
//			//设计添加速度越来越快
//			try {
//				Thread.sleep(1000 - i * 10);
//			} catch (InterruptedException e) {
//			}
//			myThreadPool.execute(new Thread() {
//				@Override
//				public void run() {
//					super.run();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//					}
//					System.out.println("执行" + getName());
//				}
//			});
//		}
//		//TODO:测试使用线程来查找的性能
//		//见专题七的查找性能
//		// TODO:使用Lock对象实现同步效果
//		Lock r8 = new ReentrantLock();
//		new Thread() {
//			@Override
//			public void run() {
//				if (r8.tryLock())
//					try {
//						System.out.println(Thread.currentThread().getName() + "得到锁，等待2秒");
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//					} finally {
//						//解锁tryLock
//						r8.unlock();
//						System.out.println("释放锁");
//					}
//			}
//		}.start();
//		new Thread() {
//			@Override
//			public void run() {
//				try {
//					r8.lock();
//					System.out.println(Thread.currentThread().getName() + "得到锁，等待3秒");
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//				} finally {
//					System.out.println("释放锁");
//					r8.unlock();
//				}
//			}
//		}.start();
//		// lockInterruptibly例子
//		new Thread() {
//			@Override
//			public void run() {
//				r8.lock();
//				System.out.println(Thread.currentThread().getName() + "正在占用锁");
//				//延时使得等待锁的线程等待更久
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//				} finally {
//					r8.unlock();
//				}
//			};
//		}.start();
//		;
//		Thread s8 = new Thread() {
//			@Override
//			public void run(){
//				//这里由于开头延时也要同样的异常处理，所有lockInterruptibly不用和平时那样在方法外声明抛出异常
//				try {
//					Thread.sleep(100);
//					//改成r8.lock()则在等待过程中无法中断，同理synchronized也无法中断
//					r8.lockInterruptibly();
//					try {
//						System.out.println(Thread.currentThread().getName() + "还在工作");
//					} finally {
//						r8.unlock();
//					}
//				} catch (InterruptedException e) {
//					System.out.println(Thread.currentThread().getName() + "在等待过程中断");
//				}
//			}
//		};
//		s8.start();
//		System.out.println(s8.getName() + "已启动");
//		//延时确保需要中断的线程在等待锁的时候中断
//		try {
//			Thread.sleep(200);
//		}catch (InterruptedException e) {
//		}
//		//此时中断会在等待锁的时候中断
//		s8.interrupt();
//		// TODO:Lock线程交互
//		Stack<String> t8 = new Stack<>();
//		//栈满条件
//		Condition u8empty = r8.newCondition();
//		//栈空条件
//		Condition u8full = r8.newCondition();
//		new Thread() {
//			@Override
//			public void run() {
//				try {
//					pop();
//				} catch (InterruptedException e) {
//				}
//			}
//			
//			void pop() throws InterruptedException{
//				r8.lockInterruptibly();
//				try {
//					while (true) {
//						if (t8.isEmpty()) {
//							System.out.println("已空，暂停删除，启动添加线程");
//							//唤醒栈满时await的线程
//							u8full.signal();
//							//让本线程放弃锁等待唤醒
//							u8empty.await();
//						}
//						Thread.sleep(1000);
//						System.out.println("删除一个元素");
//						t8.pop();
//					}
//				} catch (InterruptedException e) {
//				}finally {
//					r8.unlock();
//				}
//			}
//		}.start();
//		new Thread() {
//			@Override
//			public void run() {
//				try {
//					push();
//				} catch (InterruptedException e) {
//				}
//			}
//			
//			void push() throws InterruptedException{
//				r8.lockInterruptibly();
//				try {
//					while (true) {
//						if (t8.size() >= 20) {
//							System.out.println("已满，暂停添加，启动删除线程");
//							//唤醒栈空时await的线程
//							u8empty.signal();
//							//让本线程放弃锁等待唤醒
//							u8full.await();
//						}
//						Thread.sleep(1000);
//						System.out.println("添加一个元素");
//						t8.push("a");
//					}
//				} catch (InterruptedException e) {
//				}finally {
//					r8.unlock();
//				}
//			}
//		}.start();

//		//TODO:专题九 JDBC MySQL数据库连接
//		try {
////			//不需要手动加载驱动了
////			Class.forName("com.mysql.jdbc.Driver");
////			System.out.println("数据库驱动加载");
//			Connection c = DriverManager
//                .getConnection(
//                        "jdbc:mysql://localhost:3306/world",
//                        "root", "tiger");
//			System.out.println("数据库连接成功");
//			Statement statement = c.createStatement();
//			statement.execute("use test;");
//			//关闭流
//			c.close();
//			statement.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		//向表中插入数据
//		try (
//				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "tiger");
//				Statement statement = c.createStatement();
//				){
//			for (int i = 0; i < 100; i++)
//			statement.execute("insert into hero values(" + (i + 1) + ", \"hero" + i + "\", "
//			+ (int)(Math.random() * 100) + ", "
//					+ (int)(Math.random() * 100) + ", "
//					+ (int)(Math.random() * 10) + ", " 
//					+ (int)(Math.random() * 100) + ", " 
//					+ (int)(Math.random() * 10) 
//					+ ");");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		// TODO：预编译PreparedStatement,判断账号密码是否正确，获取总数，分页查询,PreparedStatement和Statement性能比较，防止SQL注入式攻击
		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "tiger");
				PreparedStatement p = c.prepareStatement("select * from hero where name like ? and hp > ? limit ?, ?;");) {
			//判断账号密码是否正确,类似
			//设置参数，下标从1开始
			p.setString(1, "hero0");
			p.setInt(2, 70);
			p.setInt(3, 0);
			p.setInt(4, 99);
			ResultSet rs = p.executeQuery();
			//查询到限定的结果则正确
			if (rs.next()) {
				//获得该行的列结果，下标也是从1开始
				System.out.println("结果正确" + rs.getString(1));
			}else {
				System.out.println("无结果");
			}
			rs.close();
			//分页查询，获取总数
			p.setString(1, "hero%");
			p.setInt(2, 50);
			//设置分页查询
			p.setInt(3, 4);
			p.setInt(4, 50);
			rs = p.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}
			rs.close();
			System.out.println("分页查询总共查询到" + count);
			//防止SQL注入
			//设SQL注入式攻击的用户提交的信息为"'hero' or 1 = 1"
			Statement s = c.createStatement();
			rs = s.executeQuery("select * from hero where name like " + "'hero0' or 1 =1" + " and hp > 50 limit 0, 99;");
			count = 0;
			while (rs.next()) count++;
			System.out.println("SQL注入式攻击的结果为" + count);
			rs.close();
			//PreparedStatement防止SQL注入式攻击
			p.setString(1, "'hero0' or 1 =1");
			p.setInt(2, 50);
			p.setInt(3, 0);
			p.setInt(4, 99);
			rs = p.executeQuery();
			if (rs.next()) System.out.println("SQL注入式攻击成功");
			else System.out.println("阻止SQL注入式攻击");
			rs.close();
			//性能比较
			long start = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				rs = s.executeQuery("select * from hero where name like \"hero%\" and hp > 0 limit 0, 99;");
			}
			System.out.println("每次执行sql语句消耗时间" + (System.currentTimeMillis() - start));
			rs.close();
			s.close();
			start = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				p.setString(1, "hero%");
				p.setInt(2, 0);
				p.setInt(3, 0);
				p.setInt(4, 99);
				rs = p.executeQuery();
			}
			System.out.println("每次传入参数消耗时间" + (System.currentTimeMillis() - start));
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		// TODO:自增ID的设置和获取
//		// 自增的效果和自增字段的获取
//		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "tiger");
//				PreparedStatement p = c.prepareStatement("insert into hero values(null, ?, ?, ?, ?, ?, ?);",
//						//该参数确保会返回自增字段
//						Statement.RETURN_GENERATED_KEYS);) {
//			// 第一个值ID可以已经设为自增
//			p.setString(1, "盖伦");
//			p.setInt(2, 99);
//			p.setInt(3, 20);
//			p.setInt(4, 3);
//			p.setInt(5, 88);
//			p.setInt(6, 5);
//			p.execute();
//			//获取自增ID
//			ResultSet rs = p.getGeneratedKeys();
//			while (rs.next()) {
//				System.out.println(rs.getInt(1));
//			}
//			rs.close();
//			//删除元素复位自增
//			p.executeUpdate("delete from hero where name = '盖伦';");
//			p.executeUpdate("ALTER TABLE HERO AUTO_INCREMENT = 100;");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		//TODO:查看数据库元数据
//		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "tiger");) {
//			// 查看数据库层面的数据
//			DatabaseMetaData dbmd = c.getMetaData();
//			// 获取数据库服务器产品名称
//			System.out.println("数据库产品名称:\t" + dbmd.getDatabaseProductName());
//			// 获取数据库服务器产品版本号
//			System.out.println("数据库产品版本:\t" + dbmd.getDatabaseProductVersion());
//			// 获取数据库服务器用作类别和表名之间的分隔符 如test.user
//			System.out.println("数据库和表分隔符:\t" + dbmd.getCatalogSeparator());
//			// 获取驱动版本
//			System.out.println("驱动版本:\t" + dbmd.getDriverVersion());
//			System.out.println("可用的数据库列表：");
//			// 获取数据库名称
//			ResultSet rs = dbmd.getCatalogs();
//			while (rs.next()) {
//				System.out.println("数据库名称:\t" + rs.getString(1));
//			}
//			rs.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		//TODO:事务
//		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "tiger");
//				PreparedStatement p = c.prepareStatement("insert into hero values(null, ?, ?, ?, ?, ?, ?);",
//						//该参数确保会返回自增字段
//						Statement.RETURN_GENERATED_KEYS);) {
//			//必须设置table类型
//			p.execute("ALTER TABLE HERO ENGINE = INNODB;");
////			//关闭自动提交
////			c.setAutoCommit(false);
//			// 第一个值ID可以已经设为自增
//			p.setString(1, "盖伦");
//			p.setInt(2, 99);
//			p.setInt(3, 20);
//			p.setInt(4, 3);
//			p.setInt(5, 88);
//			p.setInt(6, 5);
//			p.execute();
//			//删除元素复位自增
//			//假设from少了m，查看数据库可看到有事务时前面的执行也无法执行，否则前面执行了，后面没有执行
//			p.executeUpdate("delete fro hero where name = '盖伦';", Statement.RETURN_GENERATED_KEYS);
//			p.executeUpdate("ALTER TABLE HERO AUTO_INCREMENT = 100;", Statement.RETURN_GENERATED_KEYS);
//			//一起手动提交
//			c.commit();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		//TODO:ORM(对象和关系数据库的映射) DAO(数据访问对象)
//		List<Hero> a9 = new HeroDAO().list(8, 29); 
//		System.out.println("总共有" + a9.size());
//		// TODO:使用数据库连接池ConnectionPool
//		//设置一个20线程的池。线程数量大于连接数量以产生争夺
//		ExecutorService b9 = Executors.newFixedThreadPool(20);
//		//100个线程，方便join
//		Thread c9[] = new Thread[100];
//		System.out.println("ID\t name\t HP\t armor\t moveSpeed\t aggressivity\t attackSpeed");
//		//自定义连接池实现自动关闭以关闭所有连接，大小为10
//		try (MyConnectionPool myConnectionPool = new MyConnectionPool("jdbc:mysql://localhost/test", "root", "tiger",
//				10);) {
//			Lock lock = new ReentrantLock();
//			CountDownLatch countDownLatch = new CountDownLatch(100);
//			for (int i = 0; i < 100; i++) {
//				int j = i;//为了让线程中可以使用i
//				c9[i] = new Thread() {
//					@Override
//					public void run() {
//						try {
//							//获取连接
//							Connection c = myConnectionPool.getConnection();
//							PreparedStatement p = c.prepareStatement("select * from hero limit ?, 1");
//							p.setInt(1, j);
//							ResultSet rs = p.executeQuery();
//							while (rs.next()) {
//								//lock使每条数据输出保持格式不冲突
//								lock.lock();
//								System.out.print(rs.getInt(1) + "\t ");
//								System.out.print(rs.getString(2) + "\t ");
//								System.out.print(rs.getInt(3) + "\t ");
//								System.out.print(rs.getInt(4) + "\t ");
//								System.out.print(rs.getInt(5) + "\t\t ");
//								System.out.print(rs.getInt(6) + "\t\t ");
//								System.out.print(rs.getInt(7));
//								System.out.println();
//								lock.unlock();
//							}
//							//一定要手动关闭
//							rs.close();
//							p.close();
//							//收回连接
//							myConnectionPool.returnConnection(c);
//							countDownLatch.countDown();
//						} catch (SQLException | InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//				};
//				b9.execute(c9[i]);
//			}
//			//必须等所有线程完成，因为连接池的关闭功能必须是最后执行
////			//在线程池执行时使用join依然会有同步问题
////			for (int i = 0; i < 100; i++) {
////				c9[i].join();
////			}
//			//使用CountDownLatch实现等待其他线程全部完成
//			countDownLatch.await();
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		}
//		// TODO：比较传统方式和连接池的性能
//		// 传统方式
//		Thread d9[] = new Thread[100];
//		// 所有hp的总和，用于验证结果是否正确
//		AtomicInteger sumHP = new AtomicInteger(0);
//		// 用于等待线程全部结束
//		CountDownLatch e9 = new CountDownLatch(100);
//		// 创建线程
//		for (int i = 0; i < 100; i++) {
//			int j = i;
//			d9[i] = new Thread() {
//				@Override
//				public void run() {
//					try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "tiger");
//							Statement s = c.createStatement();) {
//						ResultSet rs = s.executeQuery("select HP from hero where ID = " + j);
//						while (rs.next())
//							sumHP.addAndGet(rs.getInt(1));
//						rs.close();
//					} catch (SQLException e) {
//						e.printStackTrace();
//					}
//					e9.countDown();
//				}
//			};
//		}
//		// 在启动线程前计时
//		long start9 = System.currentTimeMillis();
//		// 启动线程
//		for (int i = 0; i < 100; i++) {
//			d9[i].start();
//		}
//		// 等待所有线程完成
//		try {
//			e9.await();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("传统方式结果为" + sumHP);
//		System.out.println("传统方式所耗时" + (System.currentTimeMillis() - start9));
//		// 使用连接池HikariCP
//		HikariConfig f9 = new HikariConfig();
//		f9.setJdbcUrl("jdbc:mysql://localhost/test");
//		f9.setUsername("root");
//		f9.setPassword("tiger");
//		f9.addDataSourceProperty("connectionTimeout", "1000"); // 连接超时：1秒
//		f9.addDataSourceProperty("idleTimeout", "60000"); // 空闲超时：60秒
//		f9.addDataSourceProperty("maximumPoolSize", 10);
//		DataSource ds = new HikariDataSource(f9);
//		// 重新赋值结果
//		sumHP.set(0);
//		// 线程计数器
//		CountDownLatch g9 = new CountDownLatch(100);
//		for (int i = 0; i < 100; i++) {
//			int j = i;
//			d9[i] = new Thread() {
//				@Override
//				public void run() {
//					try  (
//							Connection c = ds.getConnection();
//							Statement s = c.createStatement();){
//						ResultSet rs = s.executeQuery("select HP from hero where ID = " + j);
//						while (rs.next())
//							sumHP.addAndGet(rs.getInt(1));
//						// 手动关闭
//						rs.close();
//					} catch (SQLException e) {
//						e.printStackTrace();
//					}
//					g9.countDown();
//				}
//			};
//		}
//		// 在启动线程前计时
//		start9 = System.currentTimeMillis();
//		// 启动线程
//		for (int i = 0; i < 100; i++) {
//			d9[i].start();
//		}
//		// 等待所有线程完成
//		try {
//			g9.await();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("连接池结果为" + sumHP);
//		System.out.println("连接池所耗时" + (System.currentTimeMillis() - start9));

	}

	private static void openAFile(File f) throws IOException {
		try {
			InputStream inputStream = new FileInputStream(f);

		} catch (IOException e) {
			// TODO: handle exception
			throw e;
		}

	}

	private static void myHashcode(String s) {
		int n = s.length();
		int hc = 0;
		for (int i = 0; i < n; i++) {
			hc = +hc * 31 + s.charAt(i);
		}
		System.out.println(hc);
	}

	// 泛型方法：泛型T受限，如果只是<T>则无法单独sort，参数使用了受限通配符
	private static <T extends Hero> void a6(ArrayList<? extends T> a, ArrayList<? extends T> b) {
		// 变量a,b具有ArrayList<Hero>的所有属性和方法
		Collections.shuffle(a);
		Collections.sort(b);
	}

	// 类型参数可以进行多重边界限定，通配符？不行
	private static <T extends Number & Comparable<T>> void b6(T t) {
		// t同时具备Comparable和Number的属性
		System.out.println(t.getClass());
	}

	private static int b7(Hero o1, Hero o2) {
		if (o1.getHp() > o2.getHp())
			return 1;
		if (o2.getHp() > o1.getHp())
			return -1;
		else {
			return 0;
		}
	}

	private static int b71(Object o1, Hero o2) {
		return 0;
	}

	private int c7(Hero o1, Hero o2) {
		if (o1.getHp() > o2.getHp())
			return 1;
		if (o2.getHp() > o1.getHp())
			return -1;
		else {
			return 0;
		}
	}

	private static <T> T d7(Supplier<T> s) {
		return s.get();
	}
}
