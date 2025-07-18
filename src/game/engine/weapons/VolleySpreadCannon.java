package game.engine.weapons;

public class VolleySpreadCannon extends Weapon{
	
	public static final int WEAPON_CODE = 3;
	
	final private int minRange;
	//An integer representing the lower bound of the range. This attribute will never be changed once initialized.
	final private int maxRange;
	//An integer representing the upper bound of the range. This attribute will never be changed once initialized.
	
	public VolleySpreadCannon(int baseDamage, int minRange, int maxRange){
		super(baseDamage);
		this.minRange = minRange;
		this.maxRange = maxRange;
	}

	public static int getWeaponCode() {
		return WEAPON_CODE;
	}

	public int getMinRange() {
		return minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}
	
}
