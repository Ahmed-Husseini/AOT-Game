package game.engine.exceptions;

abstract public class GameActionException extends Exception {
	//Class representing a generic exception that can occur during game play. These exceptions arise from any invalid action that is performed. This class is a subclass of java’s Exception class. No objects of type GameActionException can be instantiated.
	public GameActionException() {
		//Initializes an instance of a GameActionException by calling the constructor of the super class.
		super();
	}
	
	public GameActionException(String message) {
		//Initializes an instance of a GameActionException by calling the constructor of the super class with a customized message.
		super(message);
	}
	
}
