package character;

class ADHero extends Hero implements AD{
	@Override
	public void physicAttack() {
		System.out.println(name + "������������");
	}

	
	public ADHero(String heroname) {
		super(heroname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		physicAttack();
    	System.out.println(name + "������һ�ι���");
    }
    
}
