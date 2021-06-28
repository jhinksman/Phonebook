package phonebook;

import java.util.Scanner;

public class Index {

	// global array and scanner
	public static Person[] phoneBookArray = new Person[3];
	public static Scanner in = new Scanner(System.in);

	public static void testCases() {
		
		Person person1 = new Person("John", "", "Doe", "114 Market St", "St Louis", "MO", "63403", 6366435698L);
		Person person2 = new Person("John", "E", "Doe", "324 Main St", "St Charles", "MO", "63303", 8475390126L);
		Person person3 = new Person("John", "Michael West", "Doe", "574 Pole Ave", "St Peters", "MO", "63333",
				5628592375L);
		// adding the 3 test cases to the phoneBookArray
		phoneBookArray[0] = person1;
		phoneBookArray[1] = person2;
		phoneBookArray[2] = person3;
	}

	public static void deleteByPhone() {

		System.out.print("Enter the phone number of entry you would like to delete\n"
				+ "Please exclude punctuation (ex. : 0123456789): ");
		String userIn = in.next();

		// create an array 1 index smaller than the current array in order to delete and
		// entry
		int smallerArrSize = Index.phoneBookArray.length - 1;
		Person[] temp = new Person[smallerArrSize];

		long userPhone = Long.parseLong(userIn);
		// while loops that makes the array 1 size smaller, add everything to the new
		// array
		// except for the deleted entry
		int i = 0;
		int j = 0;
		while (i < smallerArrSize) {
			while (j < smallerArrSize) {
				// if this isn't the entry we're deleting, add it to the temp array
				// increment inner and outer while loops
				if (phoneBookArray[i].getPhone() != userPhone) {
					temp[j] = phoneBookArray[i];
					j++;
					i++;
				}
				// else we're looking at the entry we want to delete,
				// skip that entry by incrementing i.
				else {
					i++;
				}
			}
		}

		phoneBookArray = temp;
		for (Person entry : phoneBookArray) {
			System.out.println(entry);
		}
		MainMenu.continueMethod();
	}

	public static void addEntry() {

		System.out.print(
				"\nEnter the complete entry you would like added separated by commas. Please ensure you follow the format below."
						+ "\nFORMAT: Name, Street address, City(no periods, ex: St Louis), State, Zipcode, phone number\n"
						+ "\nYour entry: ");

		// take user input for a full phonebook entry
		// declare a new scanner to avoid out of bounds errors
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();

		// Split the full string at each comma,
		// which will indicate a new object attribute
		String[] fullEntry = string.split(", ");

		String name = fullEntry[0];
		String street = fullEntry[1];
		String city = fullEntry[2];
		String state = fullEntry[3];
		String zipCode = fullEntry[4];
		long phoneNumber = Long.parseLong(fullEntry[5]);

		// split the name into first, middle(if needed), and last name
		String[] fullName = name.split(" ");

		String firstName = fullName[0];
		// last name will be at the end of the name String.
		String lastName = fullName[fullName.length - 1];

		// for loop that determines if user has input a middle name
		String midName = "";
		for (int i = 1; i < fullName.length - 1; i++) {
			// middle entry is the middle name
			// but if it doesn't = what's middle entry, the user doesn't have a middle name
			midName += fullName[i];
			if (i != fullName.length - 2) {
				midName += " ";
			}
		}

		int largerArrSize = Index.phoneBookArray.length + 1;
		int i = 0;
		int j = 1;
		// initialize new, larger array
		Person[] temp = new Person[largerArrSize];
		while (i < temp.length - 1) {
			temp[i] = phoneBookArray[i];
			i++;
		}

		// set phoneBookArray to new larger sized array
		phoneBookArray = temp;

		// create person object
		Person nextPerson = new Person(firstName, midName, lastName, street, city, state, zipCode, phoneNumber);

		// add persson object to phoneBook array
		phoneBookArray[i] = nextPerson;

		// print all values to see your new entry in the array
		MainMenu.showAll();
	}

	// bubble sort to sort the showAll method alphabetically
	public static void bubbleSort() {
		int n = Index.phoneBookArray.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (phoneBookArray[j].getFirstName().compareTo(phoneBookArray[j + 1].getFirstName()) > 1) {
					Person temp = Index.phoneBookArray[j];
					Index.phoneBookArray[j] = Index.phoneBookArray[j + 1];
					Index.phoneBookArray[j + 1] = temp;
				}
			}
		}
	}
}
