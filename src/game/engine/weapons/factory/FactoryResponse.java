package game.engine.weapons.factory;

import game.engine.weapons.Weapon;

public class FactoryResponse {
	//A class representing the FactoryResponse, which is an object to store the weapon that was bought with the remaining resources.
	//All the class attributes are READ ONLY unless otherwise specified. Also, they will not be changed once initialized.
	private final   Weapon weapon;
	private final  int  remainingResources;
	
	public FactoryResponse(game.engine.weapons.Weapon weapon, int remainingResources){
		this.weapon=weapon;
		this.remainingResources=remainingResources;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public int getRemainingResources() {
		return remainingResources;
	}
	
}
