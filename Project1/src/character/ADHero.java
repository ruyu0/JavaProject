package character;

public class ADHero extends Hero implements AD{
	@Override
	public void physicAttack() {
		System.out.println(name + "进行了物理攻击");
	}
	
	public ADHero(String name, int hp, int armor, int moveSpeed, int aggressivity, int attackSpeed) {
    	super(name, hp, armor, moveSpeed, aggressivity, attackSpeed);
	}

	public ADHero(String name, int armor, int aggressivity, int attackSpeed) {
		super(name, armor, aggressivity, attackSpeed);
	}
	
	public ADHero(String heroname) {
		super(heroname);
	}

	public ADHero(String heroname,int herohp){ 
        super(heroname, herohp);
    }
	
	@Override
	public void attack() {
		physicAttack();
    	System.out.println(name + "进行了一次攻击");
    }
	
    
}
