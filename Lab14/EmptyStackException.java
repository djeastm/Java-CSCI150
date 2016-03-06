/**
 * EmptyStackException
 *
 * @author David Eastman
 * @version 1.0
 *
 */
public class EmptyStackException extends Exception {

    
    /**
     *  Default constructor
     */
	public EmptyStackException(){
		super("EmptyStackException Caught!!!");
	}
	
    /**
     *  Overloaded constructor
     */
	public EmptyStackException(String message){
		super(message);
	}
}
