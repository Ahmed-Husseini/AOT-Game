package game.engine.exceptions;

public class InsufficientResourcesException extends GameActionException{
	//Class representing an exception that can occur whenever the player tries to buy a weapon without having enough resources. This class is a subclass of GameActionException class.
	
	private static final String MSG = "Not enough resources, resources provided = ";
		//A string representing the message of the exception that should be initialized to ”Not enough resources, resources provided = ”.
	private int resourcesProvided; 
	//An integer representing the current available resources. This attribute is both READ and WRITE.
	
	public InsufficientResourcesException(int resourcesProvided) {
		super(MSG);
		this.resourcesProvided = resourcesProvided;
	}

	public InsufficientResourcesException(String message, int resourcesProvided) {
		super(message);
		this.resourcesProvided = resourcesProvided;
	}
	
	public int getResourcesProvided() {
		return resourcesProvided;
	}
	
	public void setResourcesProvided(int x) {
		this.resourcesProvided = x;
	}
}
