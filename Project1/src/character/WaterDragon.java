package character;

public class WaterDragon {
	private WaterDragon() {
		
	}
	
	private static WaterDragon instance;
	
	public static WaterDragon getInstance() {
		if (instance == null)
			instance = new WaterDragon();
		return instance;
	}
}
