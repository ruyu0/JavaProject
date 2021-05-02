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
//		//������ֵĬ��ֵ
//		int a[] = new int[10];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

//		//����ö��
//		//Season season = Season.valueOf("Sprin");//������ֵ��Χ
//		Season season = Season.valueOf("Spring");
//		System.out.println(season);
//		//����ö��
//		for (Season season2 : Season.values()) {
//			System.out.println(season2);
//		}

//		//�ġ�����ת��
//		//����ת����
//		Hero b4 = new ADHero("����");
//		//����ת����
////		ADHero d4 = (ADHero)a4;//�޷�ת��
//		ADHero e4 = (ADHero)b4;
//		System.out.println(b4 = e4);
//		//ʵ����ת�ӿ�
//		AD f4 = new ADHero("ez");
//		//�ӿ�תʵ����
////		ADAPHero g4 = (ADAPHero)f4;//�޷�ת��
//		ADHero h4 = (ADHero)f4;
//		System.out.println(h4 == f4);

//		//�ߡ���̬
//		Hero a7 = new ADHero("����");
//		Item b7 = new LifePotion();
//		Item c7 = new MagicPotion();
//		a7.useItem(b7);
//		a7.useItem(c7);

//		//ʮ�����ڲ���
//		//�Ǿ�̬�ڲ��ࡢ��Ա�ڲ���
//		Hero a12 = new ADHero("����");
//		//��Ա�ڲ�������ж�Ӧ�ⲿ��ʵ�����ܴ����ͳ�ʼ��
//		Hero.BattleScore b12 = a12.new BattleScore();
//		//��Ա�ڲ�����Է����ⲿ������г�Ա
//		b12.legendary();
//		//���ڲ�����ⲿ�����ͬ����Աʱ
//		b12.showHeroName();
//		//�ⲿ������ڲ����Ա
//		a12.getKill();
//		
//		//��̬�ڲ���
//		EnemyCrystal c12 = new EnemyCrystal();
//		//��̬�ڲ�����Է����ⲿ���˽�о�̬��Ա��
//		c12.checkIfVictory();
//		
//		//������
//        Hero h12 = new Hero("ez"){
//            //����ʵ��attack����
//        	@Override
//            public void attack() {
//                System.out.println("�µĽ����ֶ�");
//            }
//        };
//        h12.attack();
//        //ͨ����ӡh�����Կ���h�����������test.Test$1��ôһ��ϵͳ�Զ����������
//        System.out.println(h12);

//		//TODO:ר��һ
//		//��������ת��װ��
//		int b1 = 10;
//		Integer a1 = new Integer(b1);
//		//��װ��ת��������
//		int c1 = a1.intValue();
//		//�Զ�װ��
//		a1 = b1;
//		//�Զ�����
//		c1 = a1;
//		//��ȡint��ֵ
//		c1 = Integer.MIN_VALUE;
//		//��ʽ�����(���п������ֱ��)
//		System.out.printf("%s killed %s, \r��� %d���\n", "����", "��Ī", 100); 
//		System.out.format("%s killed %s, %n��� %d���\n", "����", "��Ī", 100); 
//		//�ܳ��ȡ�����롢��0��ǧ��λ�ָ�����С����λ�������ػ����
//		System.out.printf("%,-8d", 45632);//ǧ��λ�ָ������ܳ���8�������
//		System.out.printf("%.5f%n", 456.32);//С����λ��5
//		System.out.printf("%010d%n", 452);//��0
//		//��ͬ���ҵ�ǧλ�ָ���
//        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
//        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
//        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
//        //����ת���ַ���'\\'��������ַ�'\'
//        System.out.println("ʹ�ÿո��޷��ﵽ�����Ч��");
//        System.out.println("abc def");
//        System.out.println("ab def");
//        System.out.println("a def");
//          
//        System.out.println("ʹ��\\t�Ʊ�����Դﵽ�����Ч��");
//        System.out.println("abc\tdef");
//        System.out.println("ab\tdef");
//        System.out.println("a\tdef");
//         
//        System.out.println("һ��\\t�Ʊ��������8");
//        System.out.println("12345678def");
//          
//        System.out.println("���з� \\n");
//        System.out.println("abc\ndef");
// 
//        System.out.println("������ \\'");
//        System.out.println("abc\'def");
//        System.out.println("˫���� \\\"");
//        System.out.println("abc\"def");
//        System.out.println("��б�ܱ��� \\");
//        System.out.println("abc\\def");
//		
//        //�Ƚ�String��StringBuffer����
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
//		System.out.printf("String + 10000 �� ����ʱ��Ϊ %d���� %n", (end - begin));
//		begin = System.currentTimeMillis();
//		for (int i = 0; i < 10000000; i++) {
//			f1.append(e1);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("StringBuffer append 10000000 �� ����ʱ��Ϊ %d���� %n", (end - begin));
//		//MyStringBuffer append����
//		MyStringBuffer myStringBuffer = new MyStringBuffer(e1);
//		begin = System.currentTimeMillis();
//		for (int i = 0; i < 10000000; i++) {
//			myStringBuffer.append(e1);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("MyStringBuffer append 10000000�� ����ʱ��Ϊ %d���� %n", (end - begin));
//		//MyStringBuffer delete����
//		begin = System.currentTimeMillis();
//		int length = myStringBuffer.length();
//		for (int i = 0; i < 10000000; i++) {
//			length -= 10;
//			myStringBuffer.delete(length, length + 10);
////			//��delete��length�����
////			myStringBuffer.delete(length);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("MyStringBuffer delete 10000000 �� ����ʱ��Ϊ %d���� %n", (end - begin));
//		System.out.println(myStringBuffer);
//		//MyStringBuffer reverse
//		begin = System.currentTimeMillis();
//		StringBuffer stringBuffer = new StringBuffer(e1);
//		for (int i = 0; i < 10000000; i++) {
//			myStringBuffer.reverse();
////			//�Ƚ�StringBuffer
////			stringBuffer.reverse();
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("MyStringBuffer reverse 10000000 ������ʱ��Ϊ %d ���� %n", (end - begin));

//		//TODO:ר��� ���ں�����
//		//����ת�ַ��� y������, M�����·ݣ�d����H����24Сʱ�Ƶ�ʱ��h����12Сʱ�Ƶ�ʱ��m����֣�s�����룬S�������
//		SimpleDateFormat a2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		Date b2 = new Date();
//		System.out.println(a2.format(b2));//������ĸ����������ʽ�ı仯�����ʹ�ó��õĸ���
//		//�ַ���ת����
//		try {
//			b2 = a2.parse("2012-10-32 17:59:22.352");//���11��1�գ�����
//			System.out.println(b2);
//		} catch (Exception e) {
//			System.out.println("Error");
//		}
//		//Calendar��Date�Ļ���ת��
//		Calendar c2 = Calendar.getInstance();
//		b2 = c2.getTime();
//		System.out.println(b2);
//		c2.setTime(b2);
//		//������
//		c2.add(Calendar.DAY_OF_WEEK, 2);
//		System.out.println(c2.getTime());
//		c2.set(Calendar.YEAR, 2015);
//		System.out.println(c2.getTime());

//		//TODO:ר���� �쳣����
////		//���쳣�ֿ�catch
////		try {
////			InputStream a3 = new FileInputStream(new File("abc"));
////		} catch (IOException e) {
////		}catch (ClassCastException e) {
////		}
//		//���쳣һ��catch
//		try {
//			InputStream a3 = new FileInputStream(new File("abc"));
//		} catch (IOException | ClassCastException e) {
//		}
//		//throw �� throws
//		try {
//			openAFile(new File("abc"));
//		}catch (IOException e) {
//			System.out.println("Error");
//		}
//		//�Զ����쳣��
//		Hero b3 = new ADHero("����");
//		Hero c3 = new APHero("��Ī");
//		try {
//		b3.attack(c3);
//		}catch (EnemyHeroIsDeadException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

//		//TODO:ר����
//		File a4 = new File("Directory1");
//		File b4 = new File("Directory/b4.txt");
//		//����a4,��mkdirs�������ļ�������mkdir
//		b4.getParentFile().mkdirs();
//		try {
//			b4.createNewFile();
////			//��jvm����ɾ���ļ�
////			b4.deleteOnExit();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		//����޸�ʱ��
//		System.out.println(new Date(b4.lastModified()));
//		b4.setLastModified(400);
//		//������
//		b4.renameTo(new File("Directory/b4rename.txt"));
//		//�ֽ����Ķ�ȡ��д��
//		//ʹ��try()�ķ�ʽ�ر���
//		//�����ļ�c4.txt��utf-8����
//		try (
//				InputStream c4 = new FileInputStream(new File("c4.txt"));
//				OutputStream e4 = new FileOutputStream("c4.txt", true);//true����kong����д�뿪ͷ�ͽ�β
//				){
//			//��ͬ��ʽд��
//			e4.write("д��һ������\n".getBytes(Charset.forName("utf-8")));
//			e4.write("д��һ������\n".getBytes());
//			byte[] d4 = new byte[(int)new File("c4.txt").length()];
//			c4.read(d4);//д��������д���ļ��еģ����Կ������̶�ȡ��
//			//��ͬ��ʽ�����ȡ���ֽ�����
//			System.out.println(new String(d4));
//			System.out.println(new String(d4, Charset.forName("utf-8")));
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//		//�ַ����Ķ�ȡ��д��
//		//��try�йر�
//		try {
//			Writer g4 = new FileWriter("f4.txt", true);
//			Reader f4 = new FileReader("f4.txt");
//			g4.write("д��һ������\n".toCharArray());
//			//д���������ʱû��д���ļ��У�Ҫ�ر�д����,����ʹ��flush
//			g4.close();
//			char[] h4 = new char[(int)new File("f4.txt").length() / 2];
//			f4.read(h4);
//			System.out.println(h4);
//			f4.close();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//		//�ַ�����ȷ��д����
//		//ʹ��OutputStreamWriter,OutputStreamWriter
//		//��finally�йر�
//		//�����ļ�i4.txt��utf-8����
//		InputStreamReader i4 = null;
//		OutputStreamWriter j4 = null;
//		try {
//			j4 = new OutputStreamWriter(new FileOutputStream("i4.txt", true), Charset.forName("utf-8"));
//			j4.write("д��һ������\n");
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
////			//�Ƚ�ʹ��Ĭ�ϱ���gbk
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
//		//��������д
//		try(
//
//				//ʹ��PrintWriterд��
//				PrintWriter m4 = new PrintWriter(new File("l4.txt"));
////				BufferedWriter m4 = new BufferedWriter(new FileWriter("l4.txt"));
//				BufferedReader l4 = new BufferedReader(new FileReader("l4.txt"));
////				//ʹ��utf-8����ȡ������
////				BufferedReader l4 = new BufferedReader(
////						new InputStreamReader(
////								new FileInputStream("l4.txt"), 
////								Charset.forName("utf-8")));
//				){
//			m4.write("д��һ������\n");
//			m4.flush();
//			char[] n4 = new char[(int)new File("l4.txt").length() / 2];
//			l4.read(n4);
//			
//			System.out.println(n4);
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//		//������
//		try(
//				ObjectOutputStream o4 = new ObjectOutputStream(new FileOutputStream("o4.data"));
//				ObjectInputStream p4 = new ObjectInputStream(new FileInputStream("o4.data"));
//				){
//			Hero[] q4 = new Hero[] {
//					new ADHero("ez"),
//					new APHero("��Ī"),
//					new ADHero("����"),
//					null//���null���ж�����ȡ��!!!!
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

//		//TODO:ר����
//		//�����ArrayList�Ļ���
//		ArrayList<Hero> a5 = new ArrayList<>();
//		a5.add(new ADHero("ez"));
//		a5.add(new APHero("��Ī"));
//		//ArrayListת����
//		Hero[] b5 = a5.toArray(new Hero[] {});
//		//����תArrayList
//		//����һ
//		a5 = new ArrayList<Hero>(Arrays.asList(b5));
//		//������
//		Collections.addAll(a5, b5);
//		//������
//		a5.addAll(Arrays.asList(b5));
//		//�����ģ�ʹ��Spring��ܽ�����ת��ΪList?????
//		//Spring����е�CollectionUtils�ṩ�˼���������������ת��ΪArraylist��
//		//���磺CollectionUtils.arrayToList()����Ȼ�����ص�List�ǲ����޸ĵģ�����add()��remove()Ԫ�ء�
//		for (Hero e : b5) {
//			System.out.println(e);
//		}
//		for (Hero eHero : a5) {
//			System.out.println(eHero);
//		}
//		//Iterator��������
//		System.out.println("iterator��������");
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
//		//�������
//		e5.postOrderTraverse();
//		//�������
//		e5.levelOrderTraverse();

//		// TODO:�Ƚ�ʹ��HashMap���ҵķ������ܣ��ҳ�����������λ��
//		// ׼��һ��ArrayList���д��3000000(�������)Integer�����������������,��ʽ��[4λ�����]
//		ArrayList<Integer> i5 = new ArrayList<>();
//		for (int i = 0; i < 3000000; i++) {
//			// eclipse��������ƣ�û�취ֻ����6622���������ͨ��cmd����
//			i5.add((int) (Math.random() * 6622));
//		}
//		//��ֵ��ͬ���������ڵ�ArrayList��λ�ô���һ��List�У����List��Ϊһ��value���������ֵ��Ϊһ��key������HashMap��
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
//		//����ArrayList�Ĳ���
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
//		//����HashMap�Ĳ���
//		m5 = System.currentTimeMillis();
//		List<Integer> o5 = j5.get(new Integer(k5));
////		for (int i = 0; i < o5.size(); i++) {
////			System.out.print(o5.get(i) + " ");
////		}
//		System.out.println(o5.size());
//		n5 = System.currentTimeMillis();
//		System.out.println("used " + (n5 - m5) + "ms");

//		//HashSet˳��ȷ������ͬjvm�汾˳��ͬ
//		Set<Integer> p5 = new HashSet<>();
//		//��10 �� 1����
//		for (int i = 10; i > 0; i--) {
//			p5.add(i);
//		}
//		//Setû��get�������õ�������
//		//��1 ��10 ���
//		for (int e : p5) {
//			System.out.print(e + " ");
//		}
//		System.out.println();
//		//�ҳ��ظ����ݵ���������
//		long q5 = System.currentTimeMillis();
//		p5 = new HashSet<>();
//		p5.addAll(i5);
//		for (Integer e : p5)
//			System.out.print(e + " ");
//		System.out.println();
//		System.out.println("total " + p5.size());
//		System.out.println("used " + (System.currentTimeMillis() - q5) + "ms");

//		//Collections
//		//�����û������͵�����תlist����ʶ��������list��
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
//		//synchronizedList �ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List��δ��ɣ�

////		�Ƚ�ArrayList��LinkedList�Ĳ������ܣ��ڲ�ͬ����£����ߵ����ܲ�ͬ
//		//δ��ɣ���cmd�����ļ�
//		ArrayList<Integer> s51 = new ArrayList<>();
//		LinkedList<Integer> s52 = new LinkedList<>();
//		long t51 = System.currentTimeMillis();
//		//ѭ����Ӱ���������ԣ���������
//		for (int i = 0; i < 2000000; i++) {
//			s51.add(1);
//		}
//		System.out.println("used " + (System.currentTimeMillis() - t51) + "ms");
//		long t52 = System.currentTimeMillis();
//		//���ܵ�����ѭ��������Ӱ�죿����������
//		for (int i = 0; i < 10000000; i++) {
//			s52.addFirst(1);
//		}
//		System.out.println("used " + (System.currentTimeMillis() - t52) + "ms");

//		//HashMap��get��containKey��ʹ��
//		//Ҫ���ж��Ƿ����key��containKey����get����ΪHashMap����valueΪnull
//		HashMap<Integer, String> u5 = new HashMap<>();
//		u5.put(1, null);
//		if (u5.containsKey(1))
//			System.out.println(u5.get(1));
//		if (u5.containsKey(2))
//			System.out.println(u5.get(2));

//		//��תHashMap
//		HashMap<String,String> map = new HashMap<>();
//        HashMap<String,String> temp = new HashMap<>();
//        map.put("adc", "����Ӣ��");
//        map.put("apc", "ħ��Ӣ��");
//        map.put("t", "̹��");
//        System.out.println("��ʼ�����Map:");
//        System.out.println(map);
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            String value = map.get(key);
//            temp.put(value, key);
//        }
//        //���ԭmap
//        map.clear();
//        //����ʱmap����ԭmap
//        map.putAll(temp);
//        System.out.println("��ת���Map:");
//        System.out.println(map);

//        //�Ƚ�����set
//        //��Math.PI�е����֣����ճ���˳���ӡ��������ͬ���֣�ֻ����һ��
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

//		//�Զ����ַ�����hashcode
//		String w5 = new Scanner(System.in).nextLine();
//		myHashcode(w5);
//		System.out.println(w5.hashCode());

//		// TODO:�Զ���HashMap(myHashMap)���ɴ˺�ArrayList(x5)�Ƚϲ�������
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
//		//�����ʮ���������Բ������ܣ����ҵ�һ���鵽��
//		for (int i = 0; i < 10; i++) {
//			int temp = (int)(Math.random() * 30000);
//			long start = System.currentTimeMillis();
//			System.out.print(x5.indexOf(temp));
//			System.out.println("ʹ��indexOf��ʱ" + (System.currentTimeMillis() - start) + "����");
//			start = System.currentTimeMillis();
//			LinkedList<Integer> list = myHashMap.get(temp);
//			System.out.print(list == null ? null : list.getFirst());
//			System.out.println("ʹ��MyHashMap��ʱ" + (System.currentTimeMillis() - start) + "����");
//		}

//		// ���ֱȽ϶���
//		Hero[] y5 = new Hero[] { new ADHero("timo", 10), new APHero("jialiao", 20), new ADAPHero("xiaopao", 2) };
//		ArrayList<Hero> z5 = new ArrayList<>();
//		z5.addAll(Arrays.asList(y5));
//		//ʹ��comparable
//		System.out.print("δ�������飺");
//		for (Hero h : y5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		//��������
//		Arrays.sort(y5);
//		System.out.print("��������飺");
//		for (Hero h : y5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		z5.add(new ADHero("gailun", 1));
//		System.out.print("δ���򼯺ϣ�");
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		Collections.sort(z5);
//		System.out.print("���򼯺ϣ�");
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		//ʹ�ñȻ����Ƚ�
//		Collections.shuffle(z5);
//		y5[0].setHp(100);
//		Arrays.sort(y5, new HeroComparatorByHp());
//		System.out.print("�������飺");
//		for (Hero h : y5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		System.out.print("δ���򼯺ϣ�");
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		Collections.sort(z5, new HeroComparatorByHp());
//		System.out.print("���򼯺ϣ�");
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();

		// ��ϲ���

//		//TODO:ר����
//		//�Ͻ�ͨ����ͷ��ͷ���
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
//		//���ͷ����ĵ���
//		//֧�ַ��͵�����Ϊ����ʱ������ʹ������ͨ������Խ��ܲ�ͬ������Ĳ���
//		Test.<Hero>a6(z5, c6);
////		//����
////		a6(z5, c6);
//		for (Hero h : z5) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();
//		for (Hero h : c6) {
//			System.out.print(h + "" +  h.getHp() + " ");
//		}
//		System.out.println();

//		//���ر߽��޶�
//		Test.<Integer>b6(new Integer(10));
//		b6(new Integer(20));

//		//Class<T>��Class<?>������
//		try {
//			//�Ա����ߵķ�������
//			Date d6 = Date.class.newInstance();
//			d6 = (Date)Class.forName("java.util.Date").newInstance();
//			System.out.println(d6);
//		}catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
//			e.printStackTrace();
//		}

//		// TODO:ר����
//		for (Hero h : z5) {
//			System.out.print(h + "" + h.getHp() + " ");
//		}
//		System.out.println();
//		//�����෽ʽ
//		//ע�ⷺ�͵�ʹ��Comparator<Object>Ҳ����
//		Comparator<? super Hero> a7 = new Comparator<Hero>() {
//			@Override
//			public int compare(Hero o1, Hero o2) {
//				return 0;
//			}
//		};
//		Collections.sort(z5, a7);
//		// Lambda��ʽ���Ա������෽ʽ��������ͬ�ģ�ֻ��һ������ʱ���Բ������ţ�ֻ��1�������Բ���{}
//		Collections.sort(z5, (o1, o2) -> {
//			if (o1.getHp() > o2.getHp())
//				return 1;
//			if (o2.getHp() > o1.getHp())
//				return -1;
//			else {
//				return 0;
//			}
//		});
//		//���þ�̬������������Ӧ
//		//lambda���
////		Collections.sort(z5, (o1, o2) -> b7(o1, o2));
//		//��ʽ
//		Collections.sort(z5, Test::b7);
//		//�ԱȲ���ΪObject��Hero��Ҳ���Ա�������
//		Collections.sort(z5, Test::b71);
//		//���ö��󷽷�
//		//lambda���
////		Collections.sort(z5, (o1, o2) -> new Test().c7(o1, o2));
//		//���ö��󷽷��ķ�ʽ
//		Collections.sort(z5, new Test()::c7);
//		//����Lambda�Ĳ����еĶ��󷽷�
//		//ע��compareTo�Ĳ���ֻ��һ����ֻ��Ҫ��������ʣ�����
//		//lambda���
////		Collections.sort(z5, (o1, o2) -> o1.compareTo(o2));
//		//����Lambda�Ĳ����еĶ���ķ�ʽ
//		Collections.sort(z5, Hero::compareTo);
//		for (Hero h : z5) {
//			System.out.print(h + "" + h.getHp() + " ");
//		}
//		System.out.println();
//		//���ù�����
//		//lambda���
//		System.out.println(d7(() -> new Integer(1)));
//		//���ù�������ʽ
//		//��������һ�£����Դ�ʱ���õ�ʱĬ�Ϲ�����
//		System.out.println(d7(Date::new));
//		//�ۺϲ���
//		//���Ͽ��
//		z5.stream()
//		.filter(h -> h.getHp() >= 10)
//		.forEach(h -> System.out.print(h + "" + h.getHp() + " "));
//		System.out.println();
//		//����
////		Arrays.stream(y5)
//		Stream.of(y5)
//		.filter(h -> h.getHp() >= 10)
//		.forEach(h -> System.out.print(h + "" + h.getHp() + " "));
//		System.out.println();
//		// TODO:�Ƚϴ��������������ľۺϲ����ͼ��ϵĲ�������
//		for (int i = 0; i < 10; i++) {
//			int test = (int) (Math.random() * 30000);
//			long start = System.currentTimeMillis();
//			Long number = x5.stream().filter(h -> h == test).count();
//			System.out.println("ʹ��stream���Թ���" + number + "������ʱ" + (System.currentTimeMillis() - start) + "����");
//			start = System.currentTimeMillis();
//			number = x5.parallelStream().filter(h -> h == test).count();
//			System.out.println("ʹ��parallelStream���Թ���" + number + "������ʱ" + (System.currentTimeMillis() - start) + "����");
//			start = System.currentTimeMillis();
//			List<Integer> list = myHashMap.get(test);
//			number = list == null ? 0 : (long) list.size();
//			System.out.println("ʹ��MyHashMap���Թ���" + number + "������ʱ" + (System.currentTimeMillis() - start) + "����");
//			start = System.currentTimeMillis();
//			number = 0l;
//			for (int e : x5) {
//				if (e == test)
//					number++;
//			}
//			System.out.println("ʹ�õ����������Թ���" + number + "������ʱ" + (System.currentTimeMillis() - start) + "����");
//			// ʹ���߳̽��в��ң��ٶ�������parallelStream
//			start = System.currentTimeMillis();
//			// ���ڼ�����Ŀ
//			AtomicInteger numberThread = new AtomicInteger(0);
//			// �����ж��߳̽���
//			AtomicInteger countThread = new AtomicInteger(10);
//			// ����߳�Ϊ���������̶߳�������,ȫ���ڵȴ����������б�ʱ�ٿ�ʼ����
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
//				// m��Ϊ�����߳̽��з����ⲿ��������Ϊjһֱ�ڸ�ֵ���������޷���jʶ���final�����ܷ���j��
//				int m = j;
//				new Thread() {
//					@Override
//					public void run() {
//						int l = m;
//////						�鿴�߳��Ƿ�����
////						System.out.println("�����߳�" + m);
//						// ��Ϊ��һ��һ�εĽ�ȡ�������Բ����о���״̬
//						for (int k = 0; k < 300000; k++) {
//							if (x5.get(l * 300000 + k) == test) {
//								numberThread.incrementAndGet();
//							}
//						}
//						// ÿ���߳̽��������1
//						countThread.decrementAndGet();
//					};
//				}.start();
//			}
//			// �ж������߳��Ƿ����
//			// ��join�������ʱ��
//			while (countThread.get() > 0)
//				;
//
//			start = startLong.get();
//			System.out.println(
//					"ʹ�ö��߳������Ҳ��Թ���" + numberThread.get() + "������ʱ" + (System.currentTimeMillis() - start) + "����");
//			// ʹ���̳߳ؽ��в���
//			//���������̼߳�����10�ͽ����Ŀ0
//			countThread.set(10);
//			numberThread.set(0);
//			//�½��̳߳�
//			ThreadPoolExecutor q8 = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS,
//					new LinkedBlockingDeque<Runnable>());
//			start = System.currentTimeMillis();
//			for (int j = 0; j < 10; j++) {
//				int m = j;
//				q8.execute(new Thread() {
//					@Override
//					public void run() {
//						int l = m;
//////						�鿴�߳��Ƿ�����
////						System.out.println("�����߳�" + m);
//						// ��Ϊ��һ��һ�εĽ�ȡ�������Բ����о���״̬
//						for (int k = 0; k < 300000; k++) {
//							if (x5.get(l * 300000 + k) == test) {
//								numberThread.incrementAndGet();
//							}
//						}
//						// ÿ���߳̽��������1
//						countThread.decrementAndGet();
//					};
//				});
//			}
//			while (countThread.get() > 0)
//				;
//			System.out.println(
//					"ʹ���̳߳������Ҳ��Թ���" + numberThread.get() + "������ʱ" + (System.currentTimeMillis() - start) + "����");
//			System.out.println();
//
//		}

//		//TODO��ר��� ���߳�
//		//Ӣ�۵Ĳ��й���
//		Hero a81 = new ADHero("����", 7, 4, 10);
//		Hero a82 = new ADHero("�������", 1, 10, 3);
//		Hero a83 = new APHero("��Ī", 3, 3, 11);
//		Thread b812 = new Thread(new Attack(a81, a82));
//		Thread b821 = new Thread(new Attack(a82, a81));
//		Thread b832 = new Thread(new Attack(a83, a82));
//		b812.start();
//		b821.start();
//		b832.start();
//		//ʹ�������ഴ�����߳�
//		new Thread() {
//			@Override
//			public void run() {
//				System.out.println("��Thread�����ഴ�����߳�");
//			};
//		}.start();
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("��Runnable�����ഴ�����߳�");
//			}
//		}).start();;
//		//Lambda
//		new Thread(() -> System.out.println("Lambda�������߳�"))
//		.start();
		// ʹ�ö��̲߳��ҵ����ܲ���
		// ��������һר�����һ�����ܲ�����
		//
//		//join ������start����join
//		Thread c8 = new Thread() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++)
//					System.out.println(i);
//			}
//		};
//		c8.start();
//		//�Ƚ�����join�����
//		try {
//			c8.join();
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(9999);
//		//�߳����ȼ�
//		//�趨�������ٶ�Ϊ��Ӣ���໥�������������Կ�����Դ����
//		Hero d81 = new ADHero("����", 7, 10, 0);
//		d81.setHp(1000);
//		Hero d82 = new ADHero("С��", 7, 10, 0);
//		d82.setHp(1000);
//		Thread e812 = new Thread(new Attack(d81, d82));
//		Thread e821 = new Thread(new Attack(d82, d81));
//		//����Դʮ�ֳ���ʱ�޷�����Ч��
//		e812.setPriority(Thread.MAX_PRIORITY);
//		e821.setPriority(Thread.MIN_PRIORITY);
//		Thread f8 = new Thread() {
//			@Override
//			public void run() {
//				while (true)
//					System.out.println("This is a deamon thread");
//			}
//		};
//		//�����������߳�ǰ����Ϊ�ػ��̲߳�����
//		//�����û������������Զ�ֹͣ��
//		f8.setDaemon(true);
//		f8.start();
//		System.out.println("�����ػ��߳��ǲ������");
//		// ͬ������ͽ���취
//		// g8Ϊ����߳���Ҫ����ͬʱ������
//		Hero g8 = new ADHero("gailun");
//		g8.setHp(10000);// ��ʼѪ��Ϊ10000
//		// ���˺ͻ�Ѫ��10000���߳�
//		Thread[] h8attack = new Thread[100000];
//		Thread[] h8addHp = new Thread[100000];
//		for (int i = 0; i < 10000; i++) {
//			// j����i��ʹ��������Է���
//			int j = i;
//			h8attack[i] = new Thread() {
//				@Override
//				public void run() {
////					// ��Q�k��
////					//synchronized�������߳��������ʹ�̶߳�ռ
////					synchronized (g8) {
//						g8.setHp(g8.getHp() - 1);
//						System.out.println("�����ܵ�Ӣ��" + j + "�Ĺ�����ĿǰѪ��Ϊ" + g8.getHp());
////					}
//				};
//			};
//			// ���������߳�
//			h8attack[i].start();
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
////					// ��Q�k��
////					synchronized (g8) {
//						g8.setHp(g8.getHp() + 1);
//						System.out.println("�����ܵ�Ӣ��" + j + "�����ƣ�ĿǰѪ��Ϊ" + g8.getHp());
////					}
//				};
//			};
//			// ������Ѫ�߳�
//			h8addHp[i].start();
//		}
//		// �ȴ������߳����
//		try {
//			for (int i = 0; i < 10000; i++) {
//				h8attack[i].join();
//				h8addHp[i].join();
//			}
//		} catch (InterruptedException e) {
//		}
//		// ���
//		System.out.println("�����׵�Ѫ��Ϊ" + g8.getHp());
//		//ʵ������ǰ��synchronized����Ӧ��ͬ��������this
//		for (int i = 0; i < 10000; i++) {
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//					}
//					//��ʵ������������Ϊsynchronized
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
//		//������Ա�������ͬ��
//		System.out.println("�ָ�10000��1��Ѫ��Ѫ��Ϊ" + g8.getHp());
//		//�̰߳�ȫ��
//		//�Ա�StringBuilder���̲߳�����StringBuffer���̲߳��������ܱȽ�
//		//�������������ܲ�𣬶��������ݲ����õġ�
//		String i8 = "";
//		for (int i = 0; i < 100000; i++) {
//			i8 = i8 + 'a';
//		}
//		StringBuilder i81 = new StringBuilder(i8);
//		StringBuffer i82 = new StringBuffer(i8);
//		//��StringBuilder��ʵ�����м��ٲ���
//		long j8 = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
//					//��ʱ���ڲ�������ͬʱ��ʵ���ķ��ʻ�������ܲ���
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
//		//���Լ��Σ��ᷢ�ֲ���ͬ���޸ĳ�ͻ��������
//		System.out.println(i81.length() + "����ʱ��" + (System.currentTimeMillis() - j8) + "ms");
//		//��StringBufferʵ���ļ��ٲ���
//		j8 = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
//					//��ʱ���ڲ�������ͬʱ��ʵ���ķ��ʻ�������ܲ���
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
//		//StringBufferͬ�����ʳ�ͻ
//		System.out.println(i82.length() + "����ʱ��" + (System.currentTimeMillis() - j8) + "ms");
//		List<Integer> k81 = new ArrayList<>();
//		//�ɺ����֪�����������������µı�Ĵ洢�ռ䣬���߻���ָ��ͬһ����
//		List<Integer> k82 = Collections.synchronizedList(k81);
//		for (int i = 0; i < 100000; i++) {
//			h8addHp[i] = new Thread() {
//				@Override
//				public void run() {
////					//�̰߳�ȫ���󲻿��ٶ�֮ǰ�Ķ�����в���������һ������ȫ����Ϊ���ߵײ㻹��ͬһ����
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
//		//���¿�֪���ߵײ㻹��ͬһ����
//		System.out.println(k81.size());
//		System.out.println(k82.size());
//		// ������ʾ
//		AtomicInteger l81 = new AtomicInteger();
//		AtomicInteger l82 = new AtomicInteger();
//		new Thread() {
//			@Override
//			public void run() {
//				System.out.println("�߳�1�Ե�һ�������в���");
//				synchronized (l81) {
//					System.out.println("�����ɹ�");
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//					}
//					System.out.println("�߳�1�Եڶ��������в���");
//					//open�����ж��Ƿ���Է���
//					AtomicBoolean open = new AtomicBoolean(false);
//					//����߳�����˲����Ƿ�ɹ�
//					new Thread() {
//						@Override
//						public void run() {
//							try {
//								Thread.sleep(5000);
//							} catch (InterruptedException e) {
//							}
//							if (open.get()) {
//								System.out.println("�����ɹ�");
//							}else{
//								System.out.println("�߳�1�޷������ɹ�");
//							}
//							
//						};
//					}.start();
//					synchronized (l82) {
//						//��ʾ���Է���
//						open.set(true);
//					}
//				}
//			}
//		}.start();
//		new Thread() {
//			@Override
//			public void run() {
//				System.out.println("�߳�2�Եڶ��������в���");
//				synchronized (l82) {
//					System.out.println("�����ɹ�");
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//					}
//					System.out.println("�߳�2�Ե�һ�������в���");
//					//open�����ж��Ƿ���Է���
//					AtomicBoolean open = new AtomicBoolean(false);
//					new Thread() {
//						@Override
//						public void run() {
//							try {
//								Thread.sleep(5000);
//							} catch (InterruptedException e) {
//							}
//							if (open.get()) {
//								System.out.println("�����ɹ�");
//							}else{
//								System.out.println("�߳�2�޷������ɹ�");
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
//		// �̼߳�Ľ���
//		// ��Ѫ����Ѫ�����̴߳���ͬһ��Ӣ�ۡ���Ѫ���̷߳���Ѫ��=1����ֹͣ��Ѫ��ֱ����Ѫ���߳�ΪӢ�ۼ���Ѫ���ſ��Լ�����Ѫ��
//		// ʹ��wait��notify
//		Hero n8 = new ADHero("gailun");
//		n8.setHp(100);
//		//��Ѫ�߳�
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
//						System.out.print("ĿǰѪ��Ϊ" + n8.getHp() + ",���Իָ�10��...");
//						n8.recover(10);
//						System.out.println("�ָ��ɹ�");
//						//����ԭ�ȶԸö���ķ���ʱwait���߳�
//						n8.notify();
//					}
//				}
//			}
//		};
//		m81.start();
//		//��Ѫ�̣߳���Ʊȼ�Ѫ��
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
//					//wait������synchronized����
//					synchronized (n8) {
//						if (n8.getHp() > 0) {
//							System.out.print("ĿǰѪ��Ϊ" + n8.getHp() + ",���Լ���1��...");
//							n8.reduce();
//							System.out.println("��Ѫ�ɹ�");
//						}else {
//							System.out.println("Ӣ������");��
//							//Ӣ��ûѪ�ˣ��÷��ʸö���Ķ�������ͣռ�øö���ȴ�����
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
//		// ����������������
//		// ��Ό��F���a�ٕr�ӿ����a�����a���ٜp�����a��������
//		MyBlockingStack<String> o8 = new MyBlockingStack<>(new Stack<String>());
//		//7�l���a�Q
//		for (int i = 0; i < 7; i++) {
//			new Producer(o8).start();
//		}
//		//3�l���M�Q
//		for (int i = 0; i < 3; i++) {
//			new Consumer(o8).start();
//		}
//		//�̳߳����˼·����������������ϵ�ľQ�̳�
//		//o8�൱���������
//		ConsumerPool p8 = new ConsumerPool(o8);
//		for (int i = 0; i < 10; i++) {
//			p8.execute(new Consumer(o8));
//		}
//		for (int i = 0; i < 1000; i++) {
//			o8.push(new Scanner(System.in).nextLine());
//		}
//		//TODO:�Զ����̳߳������
//		MyThreadPool myThreadPool = new MyThreadPool(10);
//		try {
//			Thread.sleep(100);
//			System.out.println("�ȴ��̳߳��е��߳�ȫ������");
//		} catch (InterruptedException e) {
//		}
//		for (int i = 0; i < 100; i++) {
//			//�������ٶ�Խ��Խ��
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
//					System.out.println("ִ��" + getName());
//				}
//			});
//		}
//		//TODO:����ʹ���߳������ҵ�����
//		//��ר���ߵĲ�������
//		// TODO:ʹ��Lock����ʵ��ͬ��Ч��
//		Lock r8 = new ReentrantLock();
//		new Thread() {
//			@Override
//			public void run() {
//				if (r8.tryLock())
//					try {
//						System.out.println(Thread.currentThread().getName() + "�õ������ȴ�2��");
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//					} finally {
//						//����tryLock
//						r8.unlock();
//						System.out.println("�ͷ���");
//					}
//			}
//		}.start();
//		new Thread() {
//			@Override
//			public void run() {
//				try {
//					r8.lock();
//					System.out.println(Thread.currentThread().getName() + "�õ������ȴ�3��");
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//				} finally {
//					System.out.println("�ͷ���");
//					r8.unlock();
//				}
//			}
//		}.start();
//		// lockInterruptibly����
//		new Thread() {
//			@Override
//			public void run() {
//				r8.lock();
//				System.out.println(Thread.currentThread().getName() + "����ռ����");
//				//��ʱʹ�õȴ������̵߳ȴ�����
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
//				//�������ڿ�ͷ��ʱҲҪͬ�����쳣��������lockInterruptibly���ú�ƽʱ�����ڷ����������׳��쳣
//				try {
//					Thread.sleep(100);
//					//�ĳ�r8.lock()���ڵȴ��������޷��жϣ�ͬ��synchronizedҲ�޷��ж�
//					r8.lockInterruptibly();
//					try {
//						System.out.println(Thread.currentThread().getName() + "���ڹ���");
//					} finally {
//						r8.unlock();
//					}
//				} catch (InterruptedException e) {
//					System.out.println(Thread.currentThread().getName() + "�ڵȴ������ж�");
//				}
//			}
//		};
//		s8.start();
//		System.out.println(s8.getName() + "������");
//		//��ʱȷ����Ҫ�жϵ��߳��ڵȴ�����ʱ���ж�
//		try {
//			Thread.sleep(200);
//		}catch (InterruptedException e) {
//		}
//		//��ʱ�жϻ��ڵȴ�����ʱ���ж�
//		s8.interrupt();
//		// TODO:Lock�߳̽���
//		Stack<String> t8 = new Stack<>();
//		//ջ������
//		Condition u8empty = r8.newCondition();
//		//ջ������
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
//							System.out.println("�ѿգ���ͣɾ������������߳�");
//							//����ջ��ʱawait���߳�
//							u8full.signal();
//							//�ñ��̷߳������ȴ�����
//							u8empty.await();
//						}
//						Thread.sleep(1000);
//						System.out.println("ɾ��һ��Ԫ��");
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
//							System.out.println("��������ͣ��ӣ�����ɾ���߳�");
//							//����ջ��ʱawait���߳�
//							u8empty.signal();
//							//�ñ��̷߳������ȴ�����
//							u8full.await();
//						}
//						Thread.sleep(1000);
//						System.out.println("���һ��Ԫ��");
//						t8.push("a");
//					}
//				} catch (InterruptedException e) {
//				}finally {
//					r8.unlock();
//				}
//			}
//		}.start();

//		//TODO:ר��� JDBC MySQL���ݿ�����
//		try {
////			//����Ҫ�ֶ�����������
////			Class.forName("com.mysql.jdbc.Driver");
////			System.out.println("���ݿ���������");
//			Connection c = DriverManager
//                .getConnection(
//                        "jdbc:mysql://localhost:3306/world",
//                        "root", "tiger");
//			System.out.println("���ݿ����ӳɹ�");
//			Statement statement = c.createStatement();
//			statement.execute("use test;");
//			//�ر���
//			c.close();
//			statement.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		//����в�������
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
		// TODO��Ԥ����PreparedStatement,�ж��˺������Ƿ���ȷ����ȡ��������ҳ��ѯ,PreparedStatement��Statement���ܱȽϣ���ֹSQLע��ʽ����
		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "tiger");
				PreparedStatement p = c.prepareStatement("select * from hero where name like ? and hp > ? limit ?, ?;");) {
			//�ж��˺������Ƿ���ȷ,����
			//���ò������±��1��ʼ
			p.setString(1, "hero0");
			p.setInt(2, 70);
			p.setInt(3, 0);
			p.setInt(4, 99);
			ResultSet rs = p.executeQuery();
			//��ѯ���޶��Ľ������ȷ
			if (rs.next()) {
				//��ø��е��н�����±�Ҳ�Ǵ�1��ʼ
				System.out.println("�����ȷ" + rs.getString(1));
			}else {
				System.out.println("�޽��");
			}
			rs.close();
			//��ҳ��ѯ����ȡ����
			p.setString(1, "hero%");
			p.setInt(2, 50);
			//���÷�ҳ��ѯ
			p.setInt(3, 4);
			p.setInt(4, 50);
			rs = p.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}
			rs.close();
			System.out.println("��ҳ��ѯ�ܹ���ѯ��" + count);
			//��ֹSQLע��
			//��SQLע��ʽ�������û��ύ����ϢΪ"'hero' or 1 = 1"
			Statement s = c.createStatement();
			rs = s.executeQuery("select * from hero where name like " + "'hero0' or 1 =1" + " and hp > 50 limit 0, 99;");
			count = 0;
			while (rs.next()) count++;
			System.out.println("SQLע��ʽ�����Ľ��Ϊ" + count);
			rs.close();
			//PreparedStatement��ֹSQLע��ʽ����
			p.setString(1, "'hero0' or 1 =1");
			p.setInt(2, 50);
			p.setInt(3, 0);
			p.setInt(4, 99);
			rs = p.executeQuery();
			if (rs.next()) System.out.println("SQLע��ʽ�����ɹ�");
			else System.out.println("��ֹSQLע��ʽ����");
			rs.close();
			//���ܱȽ�
			long start = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				rs = s.executeQuery("select * from hero where name like \"hero%\" and hp > 0 limit 0, 99;");
			}
			System.out.println("ÿ��ִ��sql�������ʱ��" + (System.currentTimeMillis() - start));
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
			System.out.println("ÿ�δ����������ʱ��" + (System.currentTimeMillis() - start));
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		// TODO:����ID�����úͻ�ȡ
//		// ������Ч���������ֶεĻ�ȡ
//		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "tiger");
//				PreparedStatement p = c.prepareStatement("insert into hero values(null, ?, ?, ?, ?, ?, ?);",
//						//�ò���ȷ���᷵�������ֶ�
//						Statement.RETURN_GENERATED_KEYS);) {
//			// ��һ��ֵID�����Ѿ���Ϊ����
//			p.setString(1, "����");
//			p.setInt(2, 99);
//			p.setInt(3, 20);
//			p.setInt(4, 3);
//			p.setInt(5, 88);
//			p.setInt(6, 5);
//			p.execute();
//			//��ȡ����ID
//			ResultSet rs = p.getGeneratedKeys();
//			while (rs.next()) {
//				System.out.println(rs.getInt(1));
//			}
//			rs.close();
//			//ɾ��Ԫ�ظ�λ����
//			p.executeUpdate("delete from hero where name = '����';");
//			p.executeUpdate("ALTER TABLE HERO AUTO_INCREMENT = 100;");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		//TODO:�鿴���ݿ�Ԫ����
//		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "tiger");) {
//			// �鿴���ݿ���������
//			DatabaseMetaData dbmd = c.getMetaData();
//			// ��ȡ���ݿ��������Ʒ����
//			System.out.println("���ݿ��Ʒ����:\t" + dbmd.getDatabaseProductName());
//			// ��ȡ���ݿ��������Ʒ�汾��
//			System.out.println("���ݿ��Ʒ�汾:\t" + dbmd.getDatabaseProductVersion());
//			// ��ȡ���ݿ�������������ͱ���֮��ķָ��� ��test.user
//			System.out.println("���ݿ�ͱ�ָ���:\t" + dbmd.getCatalogSeparator());
//			// ��ȡ�����汾
//			System.out.println("�����汾:\t" + dbmd.getDriverVersion());
//			System.out.println("���õ����ݿ��б�");
//			// ��ȡ���ݿ�����
//			ResultSet rs = dbmd.getCatalogs();
//			while (rs.next()) {
//				System.out.println("���ݿ�����:\t" + rs.getString(1));
//			}
//			rs.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		//TODO:����
//		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "tiger");
//				PreparedStatement p = c.prepareStatement("insert into hero values(null, ?, ?, ?, ?, ?, ?);",
//						//�ò���ȷ���᷵�������ֶ�
//						Statement.RETURN_GENERATED_KEYS);) {
//			//��������table����
//			p.execute("ALTER TABLE HERO ENGINE = INNODB;");
////			//�ر��Զ��ύ
////			c.setAutoCommit(false);
//			// ��һ��ֵID�����Ѿ���Ϊ����
//			p.setString(1, "����");
//			p.setInt(2, 99);
//			p.setInt(3, 20);
//			p.setInt(4, 3);
//			p.setInt(5, 88);
//			p.setInt(6, 5);
//			p.execute();
//			//ɾ��Ԫ�ظ�λ����
//			//����from����m���鿴���ݿ�ɿ���������ʱǰ���ִ��Ҳ�޷�ִ�У�����ǰ��ִ���ˣ�����û��ִ��
//			p.executeUpdate("delete fro hero where name = '����';", Statement.RETURN_GENERATED_KEYS);
//			p.executeUpdate("ALTER TABLE HERO AUTO_INCREMENT = 100;", Statement.RETURN_GENERATED_KEYS);
//			//һ���ֶ��ύ
//			c.commit();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		//TODO:ORM(����͹�ϵ���ݿ��ӳ��) DAO(���ݷ��ʶ���)
//		List<Hero> a9 = new HeroDAO().list(8, 29); 
//		System.out.println("�ܹ���" + a9.size());
//		// TODO:ʹ�����ݿ����ӳ�ConnectionPool
//		//����һ��20�̵߳ĳء��߳������������������Բ�������
//		ExecutorService b9 = Executors.newFixedThreadPool(20);
//		//100���̣߳�����join
//		Thread c9[] = new Thread[100];
//		System.out.println("ID\t name\t HP\t armor\t moveSpeed\t aggressivity\t attackSpeed");
//		//�Զ������ӳ�ʵ���Զ��ر��Թر��������ӣ���СΪ10
//		try (MyConnectionPool myConnectionPool = new MyConnectionPool("jdbc:mysql://localhost/test", "root", "tiger",
//				10);) {
//			Lock lock = new ReentrantLock();
//			CountDownLatch countDownLatch = new CountDownLatch(100);
//			for (int i = 0; i < 100; i++) {
//				int j = i;//Ϊ�����߳��п���ʹ��i
//				c9[i] = new Thread() {
//					@Override
//					public void run() {
//						try {
//							//��ȡ����
//							Connection c = myConnectionPool.getConnection();
//							PreparedStatement p = c.prepareStatement("select * from hero limit ?, 1");
//							p.setInt(1, j);
//							ResultSet rs = p.executeQuery();
//							while (rs.next()) {
//								//lockʹÿ������������ָ�ʽ����ͻ
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
//							//һ��Ҫ�ֶ��ر�
//							rs.close();
//							p.close();
//							//�ջ�����
//							myConnectionPool.returnConnection(c);
//							countDownLatch.countDown();
//						} catch (SQLException | InterruptedException e) {
//							e.printStackTrace();
//						}
//					}
//				};
//				b9.execute(c9[i]);
//			}
//			//����������߳���ɣ���Ϊ���ӳصĹرչ��ܱ��������ִ��
////			//���̳߳�ִ��ʱʹ��join��Ȼ����ͬ������
////			for (int i = 0; i < 100; i++) {
////				c9[i].join();
////			}
//			//ʹ��CountDownLatchʵ�ֵȴ������߳�ȫ�����
//			countDownLatch.await();
//		} catch (SQLException | InterruptedException e) {
//			e.printStackTrace();
//		}
//		// TODO���Ƚϴ�ͳ��ʽ�����ӳص�����
//		// ��ͳ��ʽ
//		Thread d9[] = new Thread[100];
//		// ����hp���ܺͣ�������֤����Ƿ���ȷ
//		AtomicInteger sumHP = new AtomicInteger(0);
//		// ���ڵȴ��߳�ȫ������
//		CountDownLatch e9 = new CountDownLatch(100);
//		// �����߳�
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
//		// �������߳�ǰ��ʱ
//		long start9 = System.currentTimeMillis();
//		// �����߳�
//		for (int i = 0; i < 100; i++) {
//			d9[i].start();
//		}
//		// �ȴ������߳����
//		try {
//			e9.await();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("��ͳ��ʽ���Ϊ" + sumHP);
//		System.out.println("��ͳ��ʽ����ʱ" + (System.currentTimeMillis() - start9));
//		// ʹ�����ӳ�HikariCP
//		HikariConfig f9 = new HikariConfig();
//		f9.setJdbcUrl("jdbc:mysql://localhost/test");
//		f9.setUsername("root");
//		f9.setPassword("tiger");
//		f9.addDataSourceProperty("connectionTimeout", "1000"); // ���ӳ�ʱ��1��
//		f9.addDataSourceProperty("idleTimeout", "60000"); // ���г�ʱ��60��
//		f9.addDataSourceProperty("maximumPoolSize", 10);
//		DataSource ds = new HikariDataSource(f9);
//		// ���¸�ֵ���
//		sumHP.set(0);
//		// �̼߳�����
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
//						// �ֶ��ر�
//						rs.close();
//					} catch (SQLException e) {
//						e.printStackTrace();
//					}
//					g9.countDown();
//				}
//			};
//		}
//		// �������߳�ǰ��ʱ
//		start9 = System.currentTimeMillis();
//		// �����߳�
//		for (int i = 0; i < 100; i++) {
//			d9[i].start();
//		}
//		// �ȴ������߳����
//		try {
//			g9.await();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("���ӳؽ��Ϊ" + sumHP);
//		System.out.println("���ӳ�����ʱ" + (System.currentTimeMillis() - start9));

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

	// ���ͷ���������T���ޣ����ֻ��<T>���޷�����sort������ʹ��������ͨ���
	private static <T extends Hero> void a6(ArrayList<? extends T> a, ArrayList<? extends T> b) {
		// ����a,b����ArrayList<Hero>���������Ժͷ���
		Collections.shuffle(a);
		Collections.sort(b);
	}

	// ���Ͳ������Խ��ж��ر߽��޶���ͨ���������
	private static <T extends Number & Comparable<T>> void b6(T t) {
		// tͬʱ�߱�Comparable��Number������
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
