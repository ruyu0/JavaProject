package character;

class ADHero extends Hero implements AD{
	@Override
	public void physicAttack() {
		System.out.println(name + "进行了物理攻击");
	}
	
	public ADHero(String heroname) {
		super(heroname);
		// TODO Auto-generated constructor stub
	}

	public void attack() {
    	System.out.println(name + "进行了一次攻击");
    }
    
    public void attack(Hero h1) {
    	System.out.println(name + "攻击了" + h1.name);
    }
    
    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }
    
    public static void main(String[] args) {
		ADHero adHero = new ADHero("孙");
		adHero.physicAttack();
	}
}
