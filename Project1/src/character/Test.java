package character;

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
		
		//�ߡ���̬
		Hero a7 = new ADHero("����");
		Item b7 = new LifePotion();
		Item c7 = new MagicPotion();
		a7.useItem(b7);
		a7.useItem(c7);
		
	}
}
