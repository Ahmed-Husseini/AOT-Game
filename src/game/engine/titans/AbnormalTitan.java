package game.engine.titans;

public class AbnormalTitan extends Titan{
	public static final int TITAN_CODE = 2;
	
	public AbnormalTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
		super(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
	}
	
	public int compareTo(Titan o) {
		return super.compareTo(o);
	}
	
	public static int getTitanCode() {
		return TITAN_CODE;
	}
	
}
