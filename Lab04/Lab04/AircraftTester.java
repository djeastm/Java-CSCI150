/**
 * AircraftTester - Tests Aircraft.java
 */

/**
 * @author David Eastman
 * @version 1.0
 * @date 9/8/2015
 * @email djeastman@g.coastal.edu
 *
 */
public class AircraftTester {

	public static void main(String[] args) {

		final int INITIAL_TANK_LOAD = 100; // initial amount of fuel

		// Greeting
		System.out.println("Greetings to the Aircraft Tester!");

		// Create Instance with 100 gallons of fuel
		Aircraft aircraft = new Aircraft(INITIAL_TANK_LOAD);		

		System.out.println("An object of the Aircraft class has been created.");

		// Get starting amount of fuel
		int initialFuel = aircraft.getFuel();

		System.out.println("Initial value of fuel: " + initialFuel + " gallons");

		// Find out if aircraft can travel 2000 miles
		System.out
				.println("The answer to whether the plane can fly an extra 2000 miles is: "
						+ aircraft.travel(2000));

		// Find out how much fuel is now left in the aircraft
		System.out.println("After flying next 2000 miles fuel: "
				+ aircraft.getFuel() + " gallons");

		// Find out if the aircraft can travel 4000 miles
		System.out.println("The answer to whether the plane can fly an extra 4000 miles is: " + aircraft.travel(4000));
	
		// Set fuel to 100;
		aircraft.setFuel(100);
		System.out.println("Setting the value of fuel back to 100.");
		
		// Find out if aircraft can travel 4000 miles after refueling
				System.out
						.println("The answer to whether the plane can fly an extra 4000 miles is: "
								+ aircraft.travel(4000));
		
		
		
	}
}
