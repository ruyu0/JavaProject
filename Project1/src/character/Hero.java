package character;

public abstract class Hero {
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
    
    public abstract void attack();
    
    public void useItem(Item i) {
    	System.out.println(name + "ʹ����һ������");
    	i.effect();
    }
}

