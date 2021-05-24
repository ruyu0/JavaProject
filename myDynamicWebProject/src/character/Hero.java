package character;

import java.io.Serializable;

public abstract class Hero implements Serializable, Comparable<Hero>{
	//��ʾ����൱ǰ�İ汾��������˱仯����������������ԣ���Ӧ���޸�����汾��
    private static final long serialVersionUID = 1L;
	protected String name; //����
    
    int HP = 100; //Ѫ��
       
    int armor; //����
       
    int moveSpeed; //�ƶ��ٶ�
    
    int aggressivity;
    
    int attackSpeed;
    


  //�����ڲ���JSON���ύ����
  	public Hero() {
  		
  	}
    
    //��һ�������Ĺ��췽��
    public Hero(String heroname){ 
        name = heroname;
    }
     
    //�����������Ĺ��췽��
    public Hero(String heroname,int herohp){ 
        name = heroname;
        HP = herohp;
    }
    
    public Hero(String name, int armor, int aggressivity, int attackSpeed) {
    	this.name = name;
    	this.armor = armor;
    	this.aggressivity = aggressivity;
    	this.attackSpeed = attackSpeed;
	}
    
    public Hero(String name, int hp, int armor, int moveSpeed, int aggressivity, int attackSpeed) {
    	this.name = name;
    	this.armor = armor;
    	this.HP = hp;
    	this.moveSpeed = moveSpeed;
    	this.aggressivity = aggressivity;
    	this.attackSpeed = attackSpeed;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    
    public String getName() {
		return name;
	}
    
    public int getAggressivity() {
		return aggressivity;
	}
    
    public int getAttackSpeed() {
		return attackSpeed;
	}
    
    public int getArmor() {
		return armor;
	}
    
    public int getHP() {
		return HP;
	}
    
    public int getMoveSpeed() {
		return moveSpeed;
	}
    
    public void setHP(int hp) {
		this.HP = hp;
	}
    
    @Override
    public String toString() {
    	return this.name;
    }	
    
    @Override
    public int compareTo(Hero o) {
    	if (o.HP > HP) return -1;
    	if (o.HP < HP) return 1;
    	else return 0;
    }
    
    public abstract void attack();
    
    public class BattleScore{
    	private int kill;
    	private int die;
    	private int assist;
    	//�ó�Ա���ⲿ��ͬ��
    	private String name = "ͬ��";
    	
    	//��Ա�ڲ�����Է����ⲿ������г�Ա
    	public void legendary() {
            if (kill >= 8)
                System.out.println(name + "����");
            else
                System.out.println(name + "��δ����");
        }
    	//��Ա�ڲ������ͬ�����ⲿ���Ա
    	public void showHeroName() {
    		System.out.println(Hero.this.name);
    		System.out.println(name);//Ĭ��������Լ��ı���
    	}
    }
    
    private static void battleWin() {
    	System.out.println("ʤ��");
    }
    
    //��̬�ڲ��࣬�з���ˮ��
    public static class EnemyCrystal{
        int hp=0;
         
        //���ˮ����Ѫ��Ϊ0��������ʤ��
        public void checkIfVictory(){
            if(hp==0){
            	//��̬�ڲ�����Է����ⲿ��ľ�̬��Ա
                Hero.battleWin();
                 
//                //��̬�ڲ��಻��ֱ�ӷ����ⲿ��ĳ�Ա��������
//                System.out.println(name + " win this game");
            }
        }
    }
    
    public void getKill() {
    	System.out.println("��ɱ������" + new BattleScore().kill);
    }
    
    //����ͬ��
//    public void recover() {
    public synchronized void recover() {
    	setHP(getHP() + 1);
    }
    
    public synchronized void recover(int i) {
		setHP(getHP() + i);
	}
    
    public synchronized void reduce() {
    	setHP(getHP() - 1);
	}
   
}

