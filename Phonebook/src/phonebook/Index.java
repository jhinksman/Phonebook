package phonebook;

import java.util.Scanner;

public class Index {
//make a temp array that is 1 bigger and one smaller
// long for phone number
	
	//global array and scanner to avoid making multiple scanners
	public static Person[] phoneBookArray = new Person[3];
	public static Scanner in = new Scanner (System.in);
	
	
	// use this class to handle CRUD
	// Creation, updating, and deleting
	public static void testCases() {
		//may want to show adding one of these objects to an array?
		//put this in the same order as the project
		Person person1 = new Person("John", "Doe", 6366435698L, "St Louis", "MO", "63403", "114 Market St");
		Person person2 = new Person("John", " Doe", 8475390126L, "St Charles", "MO", "63303", "324 Main St");
		Person person3 = new Person("John", "Doe", 5628592375L, "St Peters", "MO", "63333", "574 Pole Ave");
		//adding the 3 test cases to the phoneBookArray
		phoneBookArray[0] = person1;
		phoneBookArray[1] = person2;
		phoneBookArray[2] = person3;
	}
	

}
