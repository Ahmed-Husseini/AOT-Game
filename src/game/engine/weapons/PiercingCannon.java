package game.engine.weapons;

public class PiercingCannon extends Weapon{
	
	public static final int WEAPON_CODE = 1;
	
	public PiercingCannon(int baseDamage){
		super(baseDamage);
	}

	public static int getWeaponCode() {
		return WEAPON_CODE;
	}
	
	public int getDamage() {
		return super.getBaseDamage();
	}
	
}
