package character;

public class Hero {
	String name; //����
    
    float hp; //Ѫ��
       
    float armor; //����
       
    int moveSpeed; //�ƶ��ٶ�
    
    //��һ�������Ĺ��췽��
    public Hero(String heroname){ 
        name = heroname;
    }
     
    //�����������Ĺ��췽��
    public Hero(String heroname,float herohp){ 
        name = heroname;
        hp = herohp;
    }
    
 
    public static void main(String[] args) {
           Hero h1 =  new Hero("�����");
           Hero h2 =  new Hero("��Ī");
           Hero h3;
           Hero h4;
           h3 = h1;
           h4 = h2;
           System.out.println(h3.hashCode());
           System.out.println(h4.hashCode());
           
           ADHero bh = new ADHero("�ͽ�����");
           
           bh.attack(h1, h2);
    }
}

class ADHero extends Hero
{
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
}

