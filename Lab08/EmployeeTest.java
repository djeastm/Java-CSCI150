/*
 * You need to finish the main (just if and else), readEmployeeData, printEmployeeData
 *    and printAll methods
 *
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */

/**
 * @author David Eastman
 * @author clint
 *
 * A simple test file to test the Person->Employee inheritance hierarchy.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {
	/**
	 * Represents the default number of Employee objects to be represented.
	 */
	public static final int DEFAULTSIZE = 6;

	/**
	 * precondition: the parameter array of Employees, <i>e</> has been
	 * intialized. The parameter <i>numberOfEmployees</i> represents the number
	 * of employees that will be created and added to the array of Employees.
	 * Note: this does not mean that any Employee objects were created just the
	 * spaces in the array.
	 * 
	 * postcondition: The user is prompted to enter information in for
	 * <i>numberOfEmployees</i> that can be either hourly employees or salaried
	 * employees, which are then created and placed into sequential slots in our
	 * Employee array.
	 */

	public static void readEmployeeData(ArrayList<Employee> eList,
			int numberOfEmployees, Scanner keyboard) {
		// start a loop so you can make numberOfEmployees
		for (int i = 0; i < numberOfEmployees; i++) {
			// inside loop, prompt the user for whether they want to add an
			// HourlyEmployee or a salaried employee

			System.out.print("Enter type of employee (hourly/salaried): ");
			String strType = keyboard.nextLine();
			strType = strType.toLowerCase();
			
			String name = "";
			int age = -1;
			double pay = 0.0;
			String title = "";
			
			switch (strType) {
			case "hourly":
				System.out.println("Enter data for the hourly employee");

				System.out.print("Name: ");
				name = keyboard.nextLine();

				System.out.print("Age: ");
				age = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("Hourly pay: ");
				pay = keyboard.nextDouble();
				keyboard.nextLine();
				
				System.out.print("Job Title: ");
				title = keyboard.nextLine();
				
				eList.add(new HourlyEmployee(name, age, title, pay));
				break;
			case "salaried":

				System.out.println("Enter data for the hourly employee");

				System.out.print("Name: ");
				name = keyboard.nextLine();

				System.out.print("Age: ");
				age = keyboard.nextInt();
				keyboard.nextLine();

				System.out.print("Salary: ");
				pay = keyboard.nextDouble();
				keyboard.nextLine();
				
				System.out.print("Job Title: ");
				title = keyboard.nextLine();
				
				eList.add(new SalariedEmployee(name, age, title, pay));
				break;
			default:
				break;
			}
		}
	}

	/**
	 * @param <i>name</i> is not null( easy to check and you should)
	 * @param the <i>eList</i> is not null.
	 * 
	 *           postcondition: if the <i>name</i> is present as an Employee
	 *           object, then that Employee's information will be printed to the
	 *           console. If the <i>name</i> is not present, then \"Name not
	 *           found\" will be printed to the console.
	 */
	public static void printEmployeeData(String name, ArrayList<Employee> eList) {
		// add your implementation here
		
		boolean found = false;
		
		if (!name.equals("")) {
			for (int i = 0; i < eList.size(); i++) {
				if (eList.get(i).getName().equals(name)) {
					eList.get(i).print();
					found = true;
				} 
			}
		} 
		
		if (!found) {
			System.out.println("Name not found.");
		}
	}

	/**
	 * @param <i>employeeList</i> is not null.
	 * 
	 *        postcondition: all of the Employee's information will be printed
	 *        to the console.
	 */
	public static void printAll(ArrayList<Employee> employeeList) {
		// add your implementation here
		for (int i = 0; i < employeeList.size(); i++) {
			employeeList.get(i).print();
		}

	}

	/**
	 * @param <i>employeeList</i> is not null.
	 * 
	 *        postcondition: the highest paid employee will be printed to the console
	 */
	public static void printHighestPaidEmployee(ArrayList<Employee> employeeList) {
		// add your implementation here
		double maxPay = 0;
		int maxIndex = -1;
		
		for (int i = 0; i < employeeList.size(); i++) {
			double pay = employeeList.get(i).computeBiweeklyPaycheck();
			if (pay > maxPay) {
				maxPay = pay;
				maxIndex = i;
			} 
		}
		
		employeeList.get(maxIndex).print();

	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// prompt the user for the number of employees to be created
		System.out
				.print("Welcome, how many Employees will you be creating today: ");
		// get the number of employees from the user
		int numberOfEmployees = keyboard.nextInt();
		keyboard.nextLine();// clears the '\n' char

		// then create the ArrayList
		ArrayList<Employee> employee = new ArrayList<Employee>();

		EmployeeTest.readEmployeeData(employee, numberOfEmployees, keyboard);

		while (true) {
			System.out
					.println("Enter an employee's name to search \n"
							+ "\"all\" to print all, \"highest\" to print the employee's info \n"
							+ "with the highest salary, and \"exit\" to exit:");
			String choice = keyboard.nextLine();
			// if choice equals "all" call printAll(), if choice equals "exit"
			// break else call printEmployeeData()
			if (choice.equalsIgnoreCase("all")) {
				// what method should you call here?
				EmployeeTest.printAll(employee); 
			} else if (choice.equalsIgnoreCase("highest")) {
				EmployeeTest.printHighestPaidEmployee(employee);
			} else if (choice.equalsIgnoreCase("exit")) {
				System.out.println("Thank you for using the program.");
				break;
			} else {
				// if the choice is not all or exit, then the user must
				// have entered a name to lookup, so what method should
				// you call here?
				EmployeeTest.printEmployeeData(choice, employee);
			}
		}
	}
}
