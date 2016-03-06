/**
 * Aircraft - represents a simple Aircraft
 */

/**
 * @author David Eastman
 * @version 1.0
 * @date 9/8/2015
 * @email djeastman@g.coastal.edu
 *
 */
public class Aircraft {
	
	// Properties
	int fuel; // jet fuel, in gallons

	// Constructors
	/**
	 * Aircraft - default constructor
	 */
	public Aircraft() {
		setFuel(100);
	}

	/**
	 * Aircraft = constructor that sets initial fuel value
	 * 
	 * @param initialFuel The amount of fuel the user wants to start with
	 */
	public Aircraft(int initialFuel) {
		setFuel(initialFuel);
	}

	// Accessors
	public int getFuel() {
		return fuel;
	}

	// Mutators
	public void setFuel(int fuelParam) {
		if (fuelParam > 0)
			fuel = fuelParam;
	}

	/**
	 * travel - Determine if the aircraft can make the distance entered, based
	 * on how much fuel is left
	 * 
	 * @param distance Distance user wants the aircraft to travel
	 * @return Boolean showing whether the aircraft can reach the destination
	 */
	public Boolean travel(int distance) {
		Boolean enoughFuel = false;

		final int FUEL_RATE = 50; 							// miles per gallon the aircraft can travel
		int milesTravelable = getFuel() * FUEL_RATE;		// miles the aircraft can currently travel
		

		if (distance < milesTravelable) {
			enoughFuel = true;
			
			float fuelExpense = distance / (float) FUEL_RATE;	// how much fuel the travel would take
			
			setFuel((int)(getFuel() - fuelExpense));			// set the new fuel level to the integer value
																// that results from deducting the fuel expense
																// from the current amount of fuel
		}

		return enoughFuel;
	}
}
