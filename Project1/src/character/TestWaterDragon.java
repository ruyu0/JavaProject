package character;

public class TestWaterDragon {
	public static void main(String[] args) {
		WaterDragon aDragon = WaterDragon.getInstance();
		WaterDragon bDragon = WaterDragon.getInstance();
		
		System.out.println(aDragon == bDragon);
	}
}
