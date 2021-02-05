package character;

import java.io.Serializable;

import myException.EnemyHeroIsDeadException;

public abstract class Hero implements Serializable{
	//表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号
    private static final long serialVersionUID = 1L;
	protected String name; //姓名
    
    int hp = 0; //血量
       
    float armor; //护甲
       
    int moveSpeed; //移动速度
    
   
    
    //带一个参数的构造方法
    public Hero(String heroname){ 
        name = heroname;
    }
     
    //带两个参数的构造方法
    public Hero(String heroname,int herohp){ 
        name = heroname;
        hp = herohp;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.name;
    }	
    
    public abstract void attack();
    
    public void attack(Hero hero) throws EnemyHeroIsDeadException{
    	if (hero.hp == 0)
    		throw new EnemyHeroIsDeadException(hero.name + "已经死亡无法攻击");
    	System.out.println(name + "攻击了" + hero.name);
    }
    
    public void useItem(Item i) {
    	System.out.println(name + "使用了一个道具");
    	i.effect();
    }
    
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
}

