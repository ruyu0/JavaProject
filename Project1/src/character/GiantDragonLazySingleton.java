package character;

//����ʽ����ģʽ
public class GiantDragonLazySingleton {
	// TODO Auto-generated constructor stub
	// ˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private GiantDragonLazySingleton() {
	}

	// ׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
	private static GiantDragonLazySingleton instance;

	// public static ����������ʵ������
	public static GiantDragonLazySingleton getInstance() {
		// ��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
		if (null == instance) {
			instance = new GiantDragonLazySingleton();
		}
		// ���� instanceָ��Ķ���
		return instance;
	}
}
