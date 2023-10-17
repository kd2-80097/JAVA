package Circle;

public class CircleNegativeDiaException extends RuntimeException {
	
	public CircleNegativeDiaException() 
	{
	}
	public CircleNegativeDiaException(String message) 
	{
		super(message);
	}

	@Override
	public String toString() {
		return "NegativeDiameterException : " + getMessage() ;
	}

}
