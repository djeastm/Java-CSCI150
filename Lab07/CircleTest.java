/**
 * CircleTest - tests Circle.java
 */

/**
 * @author David Eastman
 * @version 1.0
 * @date 10/8/2015
 * @email djeastman@g.coastal.edu
 *
 */
import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// display a message to the user that the program is about to gather
		// information and create several circle objects

		System.out
				.println("The program is about to gather information and create several circle objects.");
		System.out.println();

		for (int i = 0; i < 4; i++) {
			buildCircle(keyboard);
		}

		// display how many Circle Objects were created

		System.out.println("Number of circle objects created: "
				+ Circle.getTotalCircles());
	}

	public static void buildCircle(Scanner keyboard) {
		double x, y;
		Point p;
		double radius;
		Circle c;
		
		// get coordinates for another point from the user

		System.out
				.println("Please enter x and y coordinates for the circle with a space between them.");
		x = keyboard.nextDouble();
		y = keyboard.nextDouble();
		keyboard.nextLine();

		// create and initialize a point

		p = new Point(x, y);

		// get the radius from the user

		System.out.println("Please enter a radius for the circle.");
		radius = keyboard.nextDouble();

		// create and initialize a Circle

		c = new Circle(p, radius);

		// Display the information about the Circle
		// the central point coordinates, area, and circumference.

		System.out.println();

		System.out
				.printf("Circle %d \nCenter (x, y): (%.1f, %.1f) \nArea: %.2f \nCircumference: %.2f\n",
						Circle.getTotalCircles(), c.getPoint().getX(), c
								.getPoint().getY(), c.getArea(), c
								.getCircumference());

		System.out.println();
	}

}
