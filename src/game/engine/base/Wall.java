package game.engine.base;
import game.engine.interfaces.Attackee;

public class Wall implements Attackee {
	final private int resources=-1;

	final private int baseHealth;
	//An integer representing the original value of the wall's health. This attribute is READ ONLY and gets initialized once.
    private int currentHealth;
	//An integer representing the current titan's health which originally equals the baseHealth. This attribute is READ and WRITE through a relevant interface's method.

	public Wall(int baseHealth) {
	//Constructor that initializes a Wall object with the given baseHealth. currentHealth also starts with the baseHealth.
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		if (currentHealth>=0) {
			this.currentHealth = currentHealth;}
		else
			this.currentHealth = 0;
	}

	public int getResources() {
		return resources;
	}

	public int getBaseHealth() {
		return baseHealth;
	}
	
	public int getResourcesValue() {
		return resources;
	}
	
}
