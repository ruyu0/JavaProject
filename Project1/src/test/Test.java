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
		
		
		//ר��һ
		//��������ת��װ��
		int b1 = 10;
		Integer a1 = new Integer(b1);
		//��װ��ת��������
		int c1 = a1.intValue();
		//�Զ�װ��
		a1 = b1;
		//�Զ�����
		c1 = a1;
		//��ȡint��ֵ
		c1 = Integer.MIN_VALUE;
		//��ʽ�����(���п������ֱ��)
		System.out.printf("%s killed %s, \r��� %d���\n", "����", "��Ī", 100); 
		System.out.format("%s killed %s, %n��� %d���\n", "����", "��Ī", 100); 
		//�ܳ��ȡ�����롢��0��ǧ��λ�ָ�����С����λ�������ػ����
		System.out.printf("%,-8d", 45632);//ǧ��λ�ָ������ܳ���8�������
		System.out.printf("%.5f%n", 456.32);//С����λ��5
		System.out.printf("%010d%n", 452);//��0
		//��ͬ���ҵ�ǧλ�ָ���
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
        //����ת���ַ���'\\'��������ַ�'\'
        System.out.println("ʹ�ÿո��޷��ﵽ�����Ч��");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");
          
        System.out.println("ʹ��\\t�Ʊ�����Դﵽ�����Ч��");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");
         
        System.out.println("һ��\\t�Ʊ��������8");
        System.out.println("12345678def");
          
        System.out.println("���з� \\n");
        System.out.println("abc\ndef");
 
        System.out.println("������ \\'");
        System.out.println("abc\'def");
        System.out.println("˫���� \\\"");
        System.out.println("abc\"def");
        System.out.println("��б�ܱ��� \\");
        System.out.println("abc\\def");
		
        //�Ƚ�String��StringBuffer����
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
		System.out.printf("String + 10000 �� ����ʱ��Ϊ %d���� %n", (end - begin));
		begin = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			f1.append(e1);
			i++;
		}
		end = System.currentTimeMillis();
		System.out.printf("StringBuffer append 1000000 �� ����ʱ��Ϊ %d���� %n", (end - begin));
	}
}
