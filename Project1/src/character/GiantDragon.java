package character;
 
//����ʽ����ģʽ
public class GiantDragon {
 
    //˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
    private GiantDragon(){
         
    }
 
    //׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ��
 
    private static GiantDragon instance = new GiantDragon();
     
    //public static �������ṩ�������߻�ȡ12�ж���Ķ���
    public static GiantDragon getInstance(){
        return instance;
    }
     
}
