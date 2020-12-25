package character;

public abstract class Hero {
	protected String name; //����
    
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
}

