package game.engine.titans;

abstract public class Titan implements Comparable<Titan> {
	/*A titan class can do the following functionalities:
	1. move
	2. attack
	3. gets attacked
	4. gets compared based on it's distance from the base/wall
	No objects of type Titan can be instantiated.*/
	
	 final private int baseHealth;
	//An integer representing the original titan's health when spawned. This attribute will never be changed once initialized.
	 private int currentHealth;
	//An integer representing the current titan's health which by default is equal to baseHealth. This attribute is READ and WRITE through a relevant interface's method.
	 final private int baseDamage;
	//An integer representing the amount of damage that a titan would cause when attacking a wall. This attribute will never be changed once initialized. This attribute is READ ONLY through a relevant interface's method.
	 final private int heightInMeters;
	//An integer representing the titan's height. This attribute will never be changed once initialized.
	 private int distanceFromBase;
	//An integer representing the distance of a titan from the base (i.e wall). This attribute is READ and WRITE through a relevant interface's method.
	 private int speed;
	//An integer representing the speed of a titan (i.e the distance a titan moves each turn). This attribute is READ and WRITE through a relevant interface's method.
	 final private int resourcesValue;
	//An integer representing the amount of resources that are gained by defeating the titan. This attribute will never be changed once initialized. This attribute is READ ONLY through a relevant interface's method.
	 final private int dangerLevel;
	//An integer representing the danger level of a titan. The smaller the value, the less dangerous that titan is. This attribute will never be changed once initialized.
	 
	 
	 

	public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed, int resourcesValue, int dangerLevel) {
		//Constructor that initializes a Titan object with the given parameters as the attributes and initially sets the currentHealth with the baseHealth
		this.baseHealth = baseHealth;
		this.currentHealth = baseHealth;
		this.baseDamage = baseDamage;
		this.heightInMeters = heightInMeters;
		this.distanceFromBase = distanceFromBase;
		this.speed = speed;
		this.resourcesValue = resourcesValue;
		this.dangerLevel = dangerLevel;	
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

	public int getBaseDamage() {
		return baseDamage;
	}

	public int getHeightInMeters() {
		return heightInMeters;
	}

	public int getDistanceFromBase() {
		return distanceFromBase;
	}

	public void setDistanceFromBase(int distanceFromBase) {
		if (distanceFromBase>=0) {
			this.distanceFromBase = distanceFromBase;}
		else
			this.distanceFromBase = 0;	
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed>=0) {
		this.speed = speed;}
		else
		setSpeed(0);	
	}

	public int getResourcesValue() {
		return resourcesValue;
	}

	public int getDangerLevel() {
		return dangerLevel;
	}

	public int getBaseHealth() {
		return baseHealth;
	}

	public int compareTo(Titan o) {
		return this.distanceFromBase - o.distanceFromBase;
	}
	
	
}
