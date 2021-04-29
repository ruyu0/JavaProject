package character;

import java.io.Serializable;

import myException.EnemyHeroIsDeadException;

public abstract class Hero implements Serializable, Comparable<Hero>{
	//��ʾ����൱ǰ�İ汾��������˱仯����������������ԣ���Ӧ���޸�����汾��
    private static final long serialVersionUID = 1L;
	protected String name; //����
    
    int hp = 100; //Ѫ��
       
    int armor; //����
       
    int moveSpeed; //�ƶ��ٶ�
    
    int aggressivity;
    
    int attackSpeed;
    


    
    //��һ�������Ĺ��췽��
    public Hero(String heroname){ 
        name = heroname;
    }
     
    //�����������Ĺ��췽��
    public Hero(String heroname,int herohp){ 
        name = heroname;
        hp = herohp;
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
    	this.aggressivity = aggressivity;
    	this.attackSpeed = attackSpeed;
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
    
    public int getHp() {
		return hp;
	}
    
    public void setHp(int hp) {
		this.hp = hp;
	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.name;
    }	
    
    @Override
    public int compareTo(Hero o) {
    	// TODO Auto-generated method stub
    	if (o.hp > hp) return -1;
    	if (o.hp < hp) return 1;
    	else return 0;
    }
    
    public abstract void attack();
    
    public void attack(Hero hero) throws EnemyHeroIsDeadException{
    	if (hero.hp == 0)
    		throw new EnemyHeroIsDeadException(hero.name + "�Ѿ������޷�����");
    	System.out.println(name + "������" + hero.name);
    }
    
    public void useItem(Item i) {
    	System.out.println(name + "ʹ����һ������");
    	i.effect();
    }
    
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
    	setHp(getHp() + 1);
    }
    
    public synchronized void recover(int i) {
		setHp(getHp() + i);
	}
    
    public synchronized void reduce() {
    	setHp(getHp() - 1);
	}
   
}

