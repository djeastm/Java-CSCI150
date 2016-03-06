/**
 *
 *	You need to complete the constructors, setHourlyPay, 
 *     computeBiweeklyPaycheck, and print methods.
 *
 * A simple class to represent and Employee who gets paid by the hour.
 */

/**
 * @author David Eastman
 * @author clint
 * 
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class HourlyEmployee extends Employee {
	/**
	 * <i>MINIMUMWAGE</i> is the minimum amount that an HourlyEmployee can make
	 * an hour.
	 */
	public static final double MINIMUMWAGE = 4.50;

	/**
	 * <i>hourlyPay</i> is a decimal representation of the amount of money the
	 * Employee makes per hour.
	 */
	private double hourlyPay;

	/**
	 * default constructor
	 */
	public HourlyEmployee() {
		super.setName("No Name yet");
		super.setAge(0);
		super.setJobTitle("No Title yet");
		this.setHourlyPay(4.5);
	}

	public HourlyEmployee(String aName, int aAge, String aJobTitle,
			double aHourlyPay) {
		super.setName(aName);
		super.setAge(aAge);
		super.setJobTitle(aJobTitle);
		this.setHourlyPay(aHourlyPay);
	}

	/**
	 * Accessor method for the hourly pay of this HourlyEmployee
	 *
	 * @return <i>hourlyPay</i> of the HourlyEmployee.
	 */
	public double getHourlyPay() {
		return hourlyPay;
	}

	/**
	 * Mutator method for the hourly pay of this HourlyEmployee
	 *
	 * @param <i>hourlyPay</i> is >= than than the
	 * MINIMUMWAGE.
	 * 
	 * postcondition: the HourlyEmployee's <i>hourlyWage</i> has been set to
	 * the value of the parameter of the parameter <i> hourlyWage</i> if and
	 * only if the parameter is >= to the <i>MINIMUMWAGE</i>.
	 */
	public void setHourlyPay(double aHourlyPay) {
		if (aHourlyPay >= MINIMUMWAGE) {
			hourlyPay = aHourlyPay;
		}
	}

	/**
	 * Method computes the paycheck the employee earns every two weeks.
	 *
	 * @return the amount of money the Employee makes every two weeks is
	 * returned.
	 * 
	 */
	public double computeBiweeklyPaycheck() {
		return getHourlyPay() * 80;
	}

	/**
	 * postcondition: all of the information about this Hourly Employee will be
	 * printed to the console.
	 */
	public void print() {
		//hint: should you call the print method in
		//  the parent class
		super.print();
		System.out.printf("Hourly pay: $%.2f\n", this.getHourlyPay());
	}
}
