/**
 * Door.java - represents a door object
 */

/**
 * @author David Eastman
 * @version 1.0
 * @date 9/3/2015
 * @email djeastman@g.coastal.edu
 */
public class Door {

	// Properties
	private String name;
	private String state;

	// Constructors
	public Door(String newName, String newState) {
		name = newName;
		state = newState;
	}
	
	// Accessors
	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}


	// Mutators
	public void setName(String newName) {
		name = newName;
	}

	
	public void setState(String newState) {
		state = newState;
	}

	
	// Methods
	public void open() {
		setState("open");
	}

	public void close() {
		setState("closed");
	}

}
