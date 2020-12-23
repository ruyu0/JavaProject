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

	public void attack() {
    	System.out.println(name + "������һ�ι���");
    }
    
    public void attack(Hero h1) {
    	System.out.println(name + "������" + h1.name);
    }
    
    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
    }
    
    public static void main(String[] args) {
		ADHero adHero = new ADHero("��");
		adHero.physicAttack();
	}
}
