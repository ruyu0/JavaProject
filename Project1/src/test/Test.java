package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
//		//��ʽ�����(���п������ֱ���)
//		System.out.printf("%s killed %s, \r��� %d���\n", "����", "��Ī", 100); 
//		System.out.format("%s killed %s, %n��� %d���\n", "����", "��Ī", 100); 
//		//�ܳ��ȡ�����롢��0��ǧ��λ�ָ�����С����λ�������ػ�����
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
//        System.out.println("ʹ��\\t�Ʊ������Դﵽ�����Ч��");
//        System.out.println("abc\tdef");
//        System.out.println("ab\tdef");
//        System.out.println("a\tdef");
//         
//        System.out.println("һ��\\t�Ʊ���������8");
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
//		//����ת�ַ��� y������, M�����·ݣ�d������H����24Сʱ�Ƶ�ʱ��h����12Сʱ�Ƶ�ʱ��m�����֣�s�����룬S��������
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