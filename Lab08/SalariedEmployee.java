/*
 * 	You need to complete the constructors, setSalary, 
 *     computeBiweeklyPaycheck, and print methods.
 */

/**
 * @author David Eastman
 * @author clint
 * 
 * SalariedEmployee represents an Employee who makes a fixed amount of money
 * every year.
 */
public class SalariedEmployee extends Employee {
	/**
	 * <i>salary</i> represents the amount of money the SalariedEmployee makes
	 * annually.
	 */
	private double salary;

	/**
	 * default constructor
	 */
	public SalariedEmployee() {
		super.setName("No Name yet");
		super.setAge(0);
		super.setJobTitle("No Title yet");
		this.setSalary(1);
	}

	public SalariedEmployee(String aName, int aAge, String aJobTitle, double aSalary) {
		super.setName(aName);
		super.setAge(aAge);
		super.setJobTitle(aJobTitle);
		this.setSalary(aSalary);
	}

	/**
	 * Accessor method for this SalariedEmployee
	 *
	 * @return <i>salary</i> of this Employee.
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Mutator method for the salary of this SalariedEmployee.
	 * 
	 * @param <i>salary</i> is > 0.
	 * 
	 * postcondition: the <i>salary</i> of the SalariedEmployee has been set to
	 * the value of the parameter <i>salary</i> if and only if it is > than 0,
	 * otherwise no action.
	 */
	public void setSalary(double aSalary) {
		if (aSalary > 0) {
			salary = aSalary;
		}
	}

	/**
	 * Method computes the paycheck the employee earns every two weeks.
	 *
	 * @return the amount of money the Employee makes every two weeks is
	 * returned.
	 */
	public double computeBiweeklyPaycheck() {
		return getSalary() / 26;
	}

	/**
	 * postcondition: all of the information about this Salaried Employee will
	 * be printed to the console.
	 */
	public void print() {
		//hint: should you call the print method in
		//  the parent class
		super.print();
		System.out.printf("Salary: $%d\n", (int) this.getSalary());
	}
}
