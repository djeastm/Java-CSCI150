/*
 *  You need to finish the constructors and the print method for
 *		this class.
 *
 * Employee represents a simplified version of a Person who works
 * for some company.
 */

/**
 * Employee represents a simplified version of a Person who works for some
 * company.
 * 
 * @author David Eastman
 * @author clint
 * 
 */
public abstract class Employee extends Person {
	/**
	 * <i>jobTitle</i> represents the job title of the Employee
	 */
	private String jobTitle;

	/**
	 * default constructor
	 */
	public Employee() {		
		super.setName("No Name Yet");
		super.setAge(0);
		this.setJobTitle("No Title Yet");
	}

	public Employee(String aName, int aAge, String aJobTitle) {
		super.setName(aName);
		super.setAge(aAge);
		this.setJobTitle(aJobTitle);
	}

	/**
	 * Accessor for the jobTitle of this Employee
	 * @return returns the job title of this Employee
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param <i>jobTitle</i> is not null and is a valid
	 * job title for a Employee.
	 * 
	 * postcondition: the Employee's job title has been set to the parameter
	 * <i>jobTitle</i>.
	 */
	public void setJobTitle(String aJobTitle) {
		jobTitle = aJobTitle;
	}

	/**
	 * Method computes the paycheck the employee earns every two weeks.  
	 *
	 * @return the amount of money the Employee makes every two weeks is
	 * returned.
	 */
	public abstract double computeBiweeklyPaycheck();

	/**
	 * postcondition: all of the information about this Employee will be printed
	 * to the console.
	 */
	public void print() {
		//hint: you should call the parent print method
		//  so that you don't have to do the same work
		super.print();
		System.out.println("Job title: " + this.getJobTitle());
	}
}
