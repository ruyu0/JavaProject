package character;

//懒汉式单例模式
public class GiantDragonLazySingleton {
	// TODO Auto-generated constructor stub
	// 私有化构造方法使得该类无法在外部通过new 进行实例化
	private GiantDragonLazySingleton() {
	}

	// 准备一个类属性，用于指向一个实例化对象，但是暂时指向null
	private static GiantDragonLazySingleton instance;

	// public static 方法，返回实例对象
	public static GiantDragonLazySingleton getInstance() {
		// 第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
		if (null == instance) {
			instance = new GiantDragonLazySingleton();
		}
		// 返回 instance指向的对象
		return instance;
	}
}
