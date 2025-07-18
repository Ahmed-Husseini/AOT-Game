package game.engine.exceptions;

public class InvalidLaneException extends GameActionException {
	
	private static final String MSG = "Action done on an invalid lane";
	//A string representing the message of the exception that should be initialized to ”Action done on an invalid lane”.
	
	public InvalidLaneException(){
		//Initializes an instance of a InvalidLaneException by calling the constructor of the super class with MSG.
		super(MSG);
	}

	public InvalidLaneException(String message){
		//Initializes an instance of a InvalidLaneException by calling the constructor of the super class with a customized message.
		super(message);
	}
	

}
