package character;

public class ADAPHero extends Hero implements AD, AP{
	public ADAPHero(String heroName) {
		super(heroName);
	}
	
	@Override
	public void physicAttack() {
		System.out.println(name + "进行了物理攻击");
	}
	
	@Override
	public void magicAttack() {
		System.out.println(name + "进行了法术攻击");
	}
	
	public static void main(String[] args) {
		ADAPHero hero = new ADAPHero("凯南");
		hero.physicAttack();
		hero.magicAttack();
	}

}
