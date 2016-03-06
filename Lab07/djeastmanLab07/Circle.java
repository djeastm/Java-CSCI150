/**
 * Circle - represents a simple circle
 */

/**
 * @author David Eastman
 * @version 1.0
 * @date 10/8/2015
 * @email djeastman@g.coastal.edu
 *
 */
public class Circle {

	private Point point;
	private double radius;
	
	private static int totalCircles = 0;
	
	// Constructors
	
	/**
	 * Constructor
	 * 
	 * @param point
	 * @param radius
	 */
	public Circle(Point point, double radius) {
		this.point = point;
		this.radius = radius;
		totalCircles++;
	}

	// Accessors
	
	/**
	 * @return the point
	 */
	public Point getPoint() {
		return point;
	}

	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * @return the total number of circles
	 */
	public static int getTotalCircles() {
		return totalCircles;
	}

	// Mutators
	
	/**
	 * @param point the point to set
	 */
	public void setPoint(Point point) {
		this.point = point;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Utility / Behavioral Methods
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
}
