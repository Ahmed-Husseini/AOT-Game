package game.engine.interfaces;

public interface Mobil {
	//contains the methods available to all objects that have mobility (i.e can move) within the game.
	
	public int getDistance();
	//A getter method that retrieves the Mobil's distance from its target.
	public void setDistance(int distance);
	//A setter method that changes the Mobil's distance from its target to the input value.
	public int getSpeed();
	//A getter method that retrieves the Mobil's movement speed.
	public void setSpeed(int speed);
	//A setter method that changes the Mobil's movement speed to the input value.
}
