package character;

public class Hero {
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
    
 
    public static void main(String[] args) {
           Hero h1 =  new Hero("大盖伦");
           Hero h2 =  new Hero("提莫");
           Hero h3;
           Hero h4;
           h3 = h1;
           h4 = h2;
           System.out.println(h3.hashCode());
           System.out.println(h4.hashCode());
           
           ADHero bh = new ADHero("赏金猎人");
           
           bh.attack(h1, h2);
    }
}

