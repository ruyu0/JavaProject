package character;

import java.io.Serializable;

public abstract class Hero implements Serializable, Comparable<Hero>{
	//表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号
    private static final long serialVersionUID = 1L;
	protected String name; //姓名
    
    int HP = 100; //血量
       
    int armor; //护甲
       
    int moveSpeed; //移动速度
    
    int aggressivity;
    
    int attackSpeed;
    


  //仅用于测试JSON的提交数据
  	public Hero() {
  		
  	}
    
    //带一个参数的构造方法
    public Hero(String heroname){ 
        name = heroname;
    }
     
    //带两个参数的构造方法
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
    	//该成员和外部类同名
    	private String name = "同名";
    	
    	//成员内部类可以访问外部类的所有成员
    	public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    	//成员内部类访问同名的外部类成员
    	public void showHeroName() {
    		System.out.println(Hero.this.name);
    		System.out.println(name);//默认情况是自己的变量
    	}
    }
    
    private static void battleWin() {
    	System.out.println("胜利");
    }
    
    //静态内部类，敌方的水晶
    public static class EnemyCrystal{
        int hp=0;
         
        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
            	//静态内部类可以访问外部类的静态成员
                Hero.battleWin();
                 
//                //静态内部类不能直接访问外部类的成员对象属性
//                System.out.println(name + " win this game");
            }
        }
    }
    
    public void getKill() {
    	System.out.println("击杀人数：" + new BattleScore().kill);
    }
    
    //测试同步
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

