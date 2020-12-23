package character;

public class ADAPHero extends Hero implements AD, AP{
	public ADAPHero(String heroName) {
		super(heroName);
	}
	
	@Override
	public void physicAttack() {
		System.out.println(name + "������������");
	}
	
	@Override
	public void magicAttack() {
		System.out.println(name + "�����˷�������");
	}
	
	public static void main(String[] args) {
		ADAPHero hero = new ADAPHero("����");
		hero.physicAttack();
		hero.magicAttack();
	}

}
