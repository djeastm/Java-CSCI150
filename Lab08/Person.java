/*
 * This class is complete
 */

/**
 * 
 * @author clint
 * 
 * A simple class to represent a simplified person.
 */
public class Person {

	/**
	 * Name of the Person
	 */
	private String name;

	/**
	 * Age of the person
	 */
	private int age;

	/**
	 * default constructor
	 */
	public Person() {
		name = "no name yet";
		age = 0;
	}

	public Person(String aName, int aAge) {
		name = aName;
		age = aAge;
	}

	// set and get methods for name and age
	/**
	 * Accessor method for the <i>name</i> of this Person
	 *
	 * @return the name has been returned.
	 */
	public String getName() {

		return name;
	}

	/**
	 * Accessor method for the <i>age</i> of this Person.
	 * @return the age has been returned.
	 */
	public int getAge() {

		return age;

	}

	/**
	 * precondition: parameter <i>name</i> is not null.
	 * 
	 * postcondition: this person object's <i>name</i> has been set to the
	 * value of the param <i>name</i>.
	 */
	public void setName(String aName) {
		name = aName;

	}

	/**
	 * Mutator method for the age of this Person.
	 *
	 * @param <i>age</i> is >= than 0 and <= than 120.
	 * 
	 * postcondition: this person object's <i>age</i> has been set to the value
	 * of the param <i>age</i>, if and only if the param <i>age</i> is >= 0 and <=
	 * 120.
	 */
	public void setAge(int aAge) {
		if(aAge >= 0 && aAge <=120){
			age = aAge;
		}
	}

	/**
	 * postcondition: all of the information about this person will be printed
	 * to the console.
	 */
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
