package game.engine.interfaces;

public interface Attackee {
	//Contains the methods available to all objects that gets attacked within the game.
	
	public int getCurrentHealth();
	//A getter method that retrieves the Attackee's current health.
	public void setCurrentHealth(int health);
	//A setter method that changes the Attackee's current health to the input value.
	public int getResourcesValue();
	//A getter method that retrieves the Attackee's resources value.
}
