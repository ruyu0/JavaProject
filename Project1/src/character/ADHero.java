package character;

public class ADHero extends Hero implements AD{
	@Override
	public void physicAttack() {
		System.out.println(name + "进行了物理攻击");
	}

	public ADHero(String name, int armor, int aggressivity, int attackSpeed) {
		// TODO Auto-generated constructor stub
		super(name, armor, aggressivity, attackSpeed);
	}
	
	public ADHero(String heroname) {
		super(heroname);
		// TODO Auto-generated constructor stub
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
