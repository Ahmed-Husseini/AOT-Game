package game.engine.weapons;

public class SniperCannon extends Weapon{
	
	public static final int WEAPON_CODE = 2;
	
	public SniperCannon(int baseDamage){
		super(baseDamage);
	}

	public static int getWeaponCode() {
		return WEAPON_CODE;
	}
	
	public int getDamage() {
		return super.getBaseDamage();
	}
	
}
