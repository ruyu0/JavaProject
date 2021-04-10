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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
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
import java.util.function.Supplier;
import java.util.stream.Stream;

import character.AD;
import character.ADAPHero;
import character.ADHero;
import character.APHero;
import character.Hero;
import character.Hero.EnemyCrystal;
import comparator.HeroComparatorByHp;
import character.Hero.BattleScore;
import character.Item;
import character.Season;
import myException.EnemyHeroIsDeadException;
import myHashMap.MyHashMap;
import myStringBuffer.MyStringBuffer;
import mytree.BTree;

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

//		//ר��һ
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

//		//ר��� ���ں�����
//		//����ת�ַ��� y������, M�����·ݣ�d����H����24Сʱ�Ƶ�ʱ��h����12Сʱ�Ƶ�ʱ��m����֣�s�����룬S�������
//		SimpleDateFormat a2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		Date b2 = new Date();
//		System.out.println(a2.format(b2));//������ĸ����������ʽ�ı仯�����ʹ�ó��õĸ���
//		//�ַ���ת����
//		try {
//			b2 = a2.parse("2012-10-32 17:59:22.352");//���11��1�գ�����
//			System.out.println(b2);
//		} catch (Exception e) {
//			// TODO: handle exception
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

//		//ר���� �쳣����
////		//���쳣�ֿ�catch
////		try {
////			InputStream a3 = new FileInputStream(new File("abc"));
////		} catch (IOException e) {
////			// TODO: handle exception
////		}catch (ClassCastException e) {
////			// TODO: handle exception
////		}
//		//���쳣һ��catch
//		try {
//			InputStream a3 = new FileInputStream(new File("abc"));
//		} catch (IOException | ClassCastException e) {
//			// TODO: handle exception
//		}
//		//throw �� throws
//		try {
//			openAFile(new File("abc"));
//		}catch (IOException e) {
//			// TODO: handle exception
//			System.out.println("Error");
//		}
//		//�Զ����쳣��
//		Hero b3 = new ADHero("����");
//		Hero c3 = new APHero("��Ī");
//		try {
//		b3.attack(c3);
//		}catch (EnemyHeroIsDeadException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

//		//ר����
//		File a4 = new File("Directory1");
//		File b4 = new File("Directory/b4.txt");
//		//����a4,��mkdirs�������ļ�������mkdir
//		b4.getParentFile().mkdirs();
//		try {
//			b4.createNewFile();
////			//��jvm����ɾ���ļ�
////			b4.deleteOnExit();
//		} catch (IOException e) {
//			// TODO: handle exception
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
//			// TODO: handle exception
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
//			// TODO: handle exception
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
////			//�Ƚ�ʹ��Ĭ�ϱ���gbk
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
//			// TODO: handle exception
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
//			// TODO: handle exception
//			e.printStackTrace();
//		}

//		//ר����
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

		// �Ƚ�ʹ��HashMap���ҵķ������ܣ��ҳ�����������λ��
		// ׼��һ��ArrayList���д��3000000(�������)Integer�����������������,��ʽ��[4λ�����]
		ArrayList<Integer> i5 = new ArrayList<>();
		for (int i = 0; i < 3000000; i++) {
			// eclipse��������ƣ�û�취ֻ����6622���������ͨ��cmd����
			i5.add((int) (Math.random() * 6622));
		}
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

		//�Զ���HashMap���ɴ˺�ArrayList�Ƚϲ�������
		MyHashMap<Integer, LinkedList<Integer>> myHashMap = new MyHashMap<>();
		ArrayList<Integer> x5 = new ArrayList<>();
		for (int i = 0; i < 3000000; i++) {
			int temp = (int)(Math.random() * 30000);
			x5.add(temp);
			LinkedList<Integer> list = myHashMap.get(temp);
			if (list == null) {
				list = new LinkedList<>();
				list.add(i);
				myHashMap.put(temp, list);
			}else {
				list.add(i);
			}
		}
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

		// ���ֱȽ϶���
		Hero[] y5 = new Hero[] { new ADHero("timo", 10), new APHero("jialiao", 20), new ADAPHero("xiaopao", 2) };
		ArrayList<Hero> z5 = new ArrayList<>();
		z5.addAll(Arrays.asList(y5));
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

//		//ר����
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
//			// TODO: handle exception
//			e.printStackTrace();
//		}

		//ר����
		for (Hero h : z5) {
			System.out.print(h + "" + h.getHp() + " ");
		}
		System.out.println();
//		//�����෽ʽ
//		//ע�ⷺ�͵�ʹ��Comparator<Object>Ҳ����
//		Comparator<? super Hero> a7 = new Comparator<Hero>() {
//			@Override
//			public int compare(Hero o1, Hero o2) {
//				// TODO Auto-generated method stub
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
		for (Hero h : z5) {
			System.out.print(h + "" + h.getHp() + " ");
		}
		System.out.println();
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
		//�Ƚϴ��������������ľۺϲ����ͼ��ϵĲ�������
		for (int i = 0; i < 100; i++) {
			int test = (int)(Math.random() * 30000);
			long start = System.currentTimeMillis();
			long number = x5.stream().filter(h -> h == test).count();
			System.out.println("ʹ��stream���Թ���" + number + "������ʱ" + (System.currentTimeMillis() - start) + "����");
			start = System.currentTimeMillis();
			number = x5.parallelStream().filter(h -> h == test).count();
			System.out.println("ʹ��parallelStream���Թ���" + number + "������ʱ" + (System.currentTimeMillis() - start) + "����");
			start = System.currentTimeMillis();
			List<Integer> list = myHashMap.get(test);
			number = list == null ? 0 : list.size();
			System.out.println("ʹ��MyHashMap���Թ���" + number + "������ʱ" + (System.currentTimeMillis() - start) + "����");
			start = System.currentTimeMillis();
			number = 0;
			for (int e : x5) {
				if (e == test) number++;
				
			}
			System.out.println("ʹ�õ����������Թ���" + number + "������ʱ" + (System.currentTimeMillis() - start) + "����");
			System.out.println();
		}
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
