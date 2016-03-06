/**
 * DoorTester - A class to test the Door class.
 */
public class DoorTester {
	/**
	 * Tests the methods of the Door class
	 *
	 */
	public static void main(String[] args) {
		
		// Test the constructor with front door and back door
		Door frontDoor = new Door("Front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected: open");
		Door backDoor = new Door("Back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: closed");
		
		// Use the mutator to change the state variable
		backDoor.setState("open");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: open");
		
		// Add code to test the setName mutator here
		backDoor.setName("Rear");
		System.out.println("The back door is " + backDoor.getName());
		System.out.println("Expected: Rear");
		
		// Return back door name to 'back'
		backDoor.setName("back");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: Back");
		
		// Create a side door as closed and set it to open with setState
		Door sideDoor = new Door("Side", "closed");
		System.out.println("The side door is " + sideDoor.getState());
		System.out.println("Expected: open");
		sideDoor.setState("open");
		
		// Set it closed with closed()
		sideDoor.close();
		System.out.println("The side door is " + sideDoor.getState());
		System.out.println("Expected: closed");
	}
}