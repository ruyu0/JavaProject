package character;

public abstract class Hero {
	String name; //姓名
    
    float hp; //血量
       
    float armor; //护甲
       
    int moveSpeed; //移动速度
   
    
    //带一个参数的构造方法
    public Hero(String heroname){ 
        name = heroname;
    }
     
    //带两个参数的构造方法
    public Hero(String heroname,float herohp){ 
        name = heroname;
        hp = herohp;
    }
    
    public abstract void attack();
    
    public void useItem(Item i) {
    	System.out.println(name + "使用了一个道具");
    	i.effect();
    }
}

