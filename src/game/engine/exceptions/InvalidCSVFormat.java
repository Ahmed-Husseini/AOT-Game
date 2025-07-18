package game.engine.exceptions;
import java.io.IOException;

public class InvalidCSVFormat extends IOException { 
	
	private static final String MSG = "Invalid input detected while reading csv file, input = \n";
	//A string representing the message of the exception that should be initialized to ”Invalid input detected while reading csv file, input = \n”.
	private String inputLine;
	//A variable representing the csv file name. This attribute is both READ and WRITE.
	
	public InvalidCSVFormat(String inputLine) {
		//Initializes an instance of a InvalidCSVFormat by calling 	the constructor of the super class with a message including MSG as well as the inputLine and setting the inputLine with the given parameter.
		super(MSG);
		this.inputLine = inputLine;
	}

	public InvalidCSVFormat(String message, String inputLine) {
		//Initializes an instance of a InvalidCSVFormat by calling the constructor of the super class with a customized message and setting the inputLine with the given parameter.
		super(message);
		this.inputLine = inputLine;
	}
	
	public String getInputLine() {
		return inputLine;
	}
	
	public void setInputLine(String x) {
		this.inputLine = x;
	}
}
