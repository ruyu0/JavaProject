package character;

public class APHero extends Hero implements AP{
	public APHero(String heroname) {
		// TODO Auto-generated constructor stub
		super(heroname);
	}
	@Override
	public void magicAttack() {
		System.out.println(name + "进行了法术攻击");
	}
	
	public static void main(String[] args) {
		ADHero adHero = new ADHero("姬");
		adHero.physicAttack();
	}
}
