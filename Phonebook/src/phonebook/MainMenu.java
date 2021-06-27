/*A phonebook program to show understanding of core Java, and Objected Oriented programming
 * 
 * @Author: Jhonathon Hinksman 
 *
 */

package phonebook;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// call testCases to initialize array values
		Index.testCases();
		// start main menu with testcases created
		mainMenu();

	}

	public static void mainMenu() {
		// create searching functions first, before creating adding/deleting functions
		// take user input as a string, initialize int version of user input
		String option = "";
		int intOption = 0;
		// print formatted menu text
		System.out.print("Please select a corresponding number option: \n" + "\n" + "[1]: Add a new phonebook entry. \n"
				+ "[2]: Delete a phonebook entry by phone number. \n" + "[3]: Search by first name. \n"
				+ "[4]: Search phonebook entries by last name.\n" + "[5]: Search phonebook entries by full name.\n"
				+ "[6]: Search phonebook entries by phone number.\n" + "[7]: Search phonbeook entries by city.\n"
				+ "[8]: Search phonebook entries by state. \n" + "[9]: Show all phonebook entries. \n"
				+ "[10]: Update a given phonebook entry. \n" + "\nYour entry: ");
		// method to catch incorrect user input
		Scanner input = new Scanner(System.in);
		try {
			option = input.next();
			// convert user string into int to handle dataType mismatch
			intOption = Integer.parseInt(option);

			switch (intOption) {
			case 1:
				Index.addEntry();
				break;
			case 2:
				Index.deleteByPhone();
				break;
			case 3:
				searchByFirstName();
				break;
			case 4:
				searchByLastName();
				break;
			case 5:
				searchByFullName();
				break;
			case 6:
				searchByPhone();
				break;
			case 7:
				searchByCity();
				break;
			case 8:
				searchByState();
				break;
			case 9:
				showAll();
				break;
			case 10:
				updateEntry();
				break;
			default:
				// add error message for type mismatch
				System.out.print("Invalid entry: ");
				mainMenu();
				break;
			}
		} catch (NumberFormatException e) {
			// return to main menu if user would like.
			System.out.println("Invalid entry: Please input number between 1-10.");
			continueMethod();

		}

	}

	public static void addEntry() {
		System.out.println("The test addEntry method has run.");
		continueMethod();
	}

	public static void deleteEntry() {
		System.out.println("The test deleteEntry has run.");
	}

	public static void search() {
		System.out.println("The test search method has run.");
		continueMethod();
	}

	// searches Person object by first name
	public static void searchByFirstName() {

		System.out.print("Enter the first name: ");
		String userIn = Index.in.next();
		String passOrFail = "Entry could not be located";
		// For each loop calls the "getFirstName" method from the Person class and
		// compares the returned
		// value to user input. Matching person objects are printed to the console.

		for (Person entry : Index.phoneBookArray) {
			if (entry.getFirstName().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
				passOrFail = "Entry located.";
			}
		}
		// notify user search results are over, surrounded by whitespace for
		// readability.
		System.out.println(passOrFail);
		System.out.println("\n***End of Search Results***\n");
		continueMethod();
	}

	public static void searchByLastName() {
		System.out.print("Enter the last name: ");
		String userIn = Index.in.next();
		String passOrFail = "Entry could not be located";
		// For each loop calls the "getLastName" method from the Person class and
		// compares the returned
		// value to user input. Matching person objects are printed to the console.

		for (Person entry : Index.phoneBookArray) {
			if (entry.getLastName().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
				passOrFail = "Entry located.";
			}
		}
		System.out.println(passOrFail);
		System.out.println("\n" + "***End of Search Results***" + "\n");
		continueMethod();
	}

	public static void searchByFullName() {
		System.out.print("Enter the first and last name: ");
		Scanner input = new Scanner (System.in);
		String userIn = input.nextLine();
		
		String passOrFail = "Entry could not be located";
		// For each loop calls the "getLastName" method from the Person class and
		// compares the returned
		// value to user input. Matching person objects are printed to the console.
		
		String[] fullName = userIn.split(" ");

		String firstName = fullName[0];
		// last name will be at the end of the name String.
		String lastName = fullName[fullName.length - 1];
		
		for (Person entry : Index.phoneBookArray) {
			// if getFirstName, getMidName, and LastName all equal, return that entry.
			if (entry.getFirstName().equalsIgnoreCase(firstName) && entry.getLastName().equalsIgnoreCase(lastName)) {
				System.out.println(entry);
				passOrFail = "Entry located.";
			} 
		}
		continueMethod();
	}

	public static void searchByPhone() {
		System.out.print("Enter the phone number: ");
		String userIn = Index.in.next();
		String passOrFail = "Entry could not be located";
		// For each loop calls the "getPhone" method from the Person class and compares
		// the returned
		// value to user input. Matching person objects are printed to the console.
		long userPhone = Long.parseLong(userIn);
		for (Person entry : Index.phoneBookArray) {
			if (entry.getPhone() == userPhone) {
				System.out.println(entry);
				passOrFail = "Entry displayed above.";
			}
		}
		System.out.println("\n" + passOrFail);
		continueMethod();
	}

	public static void searchByCity() {

		System.out.print("Enter the city name: ");
		Scanner input = new Scanner (System.in);
		String userIn = input.nextLine();
		String passOrFail = "Entry could not be located";
		// For each loop calls the "getLastName" method from the Person class and
		// compares the returned
		// value to user input. Matching person objects are printed to the console.

		for (Person entry : Index.phoneBookArray) {
			if (entry.getCity().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
				passOrFail = "Entry located.";
			}
		}
		System.out.println(passOrFail);
		
		continueMethod();
	}
	
	public static void searchByState() {

		System.out.print("Enter the state name abbreviation (ex: OH = oh): ");
		Scanner input = new Scanner (System.in);
		String userIn = input.nextLine();
		String passOrFail = "Entry could not be located";
		// For each loop calls the "getLastName" method from the Person class and
		// compares the returned
		// value to user input. Matching person objects are printed to the console.

		for (Person entry : Index.phoneBookArray) {
			if (entry.getState().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
				passOrFail = "\nEntry located.";
			}
		}
		System.out.println(passOrFail);
		
		continueMethod();
	}

	// a method that shows all entries in the array in ascending order.
	public static void showAll() {
		// bubblesort the array before showing entries.
		// for each loops prints every entry in the array
		Index.bubbleSort();
		System.out.println("See updated phone book below."+"\n--------------------");
		for (Person entry : Index.phoneBookArray) {
			System.out.println(entry);
		}

		// System.out.println("\n" + "***End of Search Results***" + "\n");
		continueMethod();
	}

	// change an attribute of an object in the array of objects, based on the phone
	// number
	public static void updateEntry() {
		// search for the entry user would like to update by using most unique
		// identifier: phone number
		System.out.print("Enter the phone number of the entry you'd like to update: ");
		String userIn = Index.in.next();
		String passOrFail = "Entry could not be located";
		// For each loop calls the "getPhone" method from the Person class and compares
		// the returned
		// finds the correct entry, indentify this as "entry"
		// user setters to update whatever value the user would like for this entry.
		long userPhone = Long.parseLong(userIn);
		for (Person entry : Index.phoneBookArray) {
			if (entry.getPhone() == userPhone) {
				// verify user wants to update this specific entry.
				System.out.println(entry);

				// begin switch statement
				String option = "";
				int intOption = 0;
				// list of updating options
				System.out.print("What would you like to update?: \n" + "\n" + "[1]: First name. \n"
						+ "[2]: Middle name. \n" + "[3]: Last name. \n" + "[4]: Street address.\n" + "[5]: City.\n"
						+ "[6]: State.\n" + "[7]: Zipcode.\n" + "[8]: Phone number. \n" + "\nYour Entry: ");

				try {
					option = Index.in.next();
					// convert user string into int to handle dataType mismatch
					intOption = Integer.parseInt(option);

					switch (intOption) {
					case 1:
						System.out.print("Enter new first name: ");
						String firstName = Index.in.next();
						entry.setFirstName(firstName);
						System.out.println("\nYour new entry: \n\n" + entry);
						passOrFail = "\nNew entry displayed above";
						break;
					case 2:
						System.out.print("Enter new middle name: ");
						String midName = Index.in.next();
						entry.setFirstName(midName);
						System.out.println("\nYour new entry: \n\n" + entry);
						passOrFail = "\nNew entry displayed above";
						break;
					case 3:
						System.out.print("Enter new last name: ");
						String lastName = Index.in.next();
						entry.setFirstName(lastName);
						System.out.println("\nYour new entry: \n\n" + entry);
						passOrFail = "\nNew entry displayed above";
						break;
					case 4:
						System.out.print("Enter new street address: ");
						String street = Index.in.next();
						entry.setFirstName(street);
						System.out.println("\nYour new entry: \n\n" + entry);
						passOrFail = "\nNew entry displayed above";
						break;
					case 5:
						System.out.print("Enter new city: ");
						String city = Index.in.next();
						entry.setFirstName(city);
						System.out.println("\nYour new entry: \n\n" + entry);
						passOrFail = "\nNew entry displayed above";
						break;
					case 6:
						System.out.print("Enter new state in the following format (OH): ");
						String state = Index.in.next();
						entry.setFirstName(state);
						System.out.println("\nYour new entry: \n\n" + entry);
						passOrFail = "\nNew entry displayed above";
						break;
					case 7:
						System.out.print("Enter new zipcode: ");
						String zip = Index.in.next();
						entry.setFirstName(zip);
						System.out.println("\nYour new entry: \n\n" + entry);
						passOrFail = "\nNew entry displayed above";
						break;
					case 8:
						System.out.print("Enter new phone number: ");
						long phone = Index.in.nextLong();
						entry.setPhone(phone);
						System.out.println("\nYour new entry: \n\n" + entry);
						passOrFail = "\nNew entry displayed above";
						break;
					default:
						// add error message for type mismatch
						System.out.print("Invalid entry: ");
						mainMenu();
						break;
					}
				} catch (NumberFormatException e) {
					// return to main menu if user would like.
					System.out.println("Invalid entry: Please input number between 1-8.");
					continueMethod();

				}
				// this break ensures that i don't print passOrFail for any array objects that I
				// don't want
				break;
			}
		}
		System.out.println(passOrFail);
		continueMethod();

	}

	public static void continueMethod() {

		System.out.print("******************************\n" + "would you like to return to the main menu? (Y/N)");
		String yesOrNo = Index.in.next();
		if (yesOrNo.equalsIgnoreCase("y"))
			mainMenu();
		else
			System.out.println("Goodbye!");
	}
}
