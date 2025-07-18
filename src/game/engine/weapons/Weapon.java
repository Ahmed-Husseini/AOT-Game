package game.engine.weapons;

abstract public class Weapon {
	//A class representing the Weapons available in the game. A weapon should be able to perform an attack. No objects of type Weapon can be instantiated.

	final private int baseDamage;
	//An integer representing the amount of damage a weapon can inflict. This attribute will not be changed once initialized. This attribute is READ ONLY through a relevant interface's method.
	
	
	public Weapon(int baseDamage){
		this.baseDamage = baseDamage;
	}


	public  int getBaseDamage() {
		return this.baseDamage;
	}
}
