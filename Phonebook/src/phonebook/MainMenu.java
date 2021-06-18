package phonebook;


public class MainMenu {

	public static void main(String[] args) {
		//call testCases to initialize array values
		Index.testCases();
		mainMenu();
		

	}

	public static void mainMenu() {
		//create searching functions first, before creating adding/deleting functions
		

		// make an address class, and a person class/
		int option;
		// add, delete, search, searchFirstName, searchLastName, searchFullName,
		// searchPhone, searchCityState, showAll, update
		System.out.print("Please select a corresponding number option: \n" + "\n" + "[1]: Add a new phonebook entry. \n"
				+ "[2]: Delete a phonebook entry. \n" + "[3]: Search phonebook entries. \n"
				+ "[4]: Search phonebook entries by first name.\n" + "[5]: Search phonebook entries by last name.\n"
				+ "[6]: Search phonebook entries by full name.\n" + "[7]: Search phonbeook entries by phone number.\n"
				+ "[8]: Search phonebook entries by city or state. \n" + "[9]: Show all phonebook entries. \n"
				+ "[10]: Update a given phonebook entry. \n" + "\n Your entry: ");
		option = Index.in.nextInt();

		switch (option) {
		// add, delete, search, searchFirstName, searchLastName, searchFullName,
		// searchPhone, searchCityState, showAll, update
		case 1:
			addEntry();
			break;
		case 2:
			deleteEntry();
			break;
		case 3:
			search();
			break;
		case 4:
			searchByFirstName();
			break;
		case 5:
			searchByLastName();
			break;
		case 6:
			searchByFullName();
			break;
		case 7:
			searchByPhone();
			break;
		case 8:
			searchByCityState();
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
		// For each loop calls the "getFirstName" method from the Person class and
		// compares the returned
		// value to user input. Matching person objects are printed to the console.
		
		for (Person entry : Index.phoneBookArray) {
			System.out.println(entry.getFirstName());
			if (entry.getFirstName().equalsIgnoreCase(userIn)) {
				System.out.println(entry);
			}
		}

		System.out.println("***End of Search Results***");
		continueMethod();
	}

	public static void searchByLastName() {
		System.out.println("The test searchByLastName method has run.");
		continueMethod();
	}

	public static void searchByFullName() {
		System.out.println("The test searchByFullName method has run.");
		continueMethod();
	}

	public static void searchByPhone() {
		System.out.println("The test searchByPhone method has run.");
		continueMethod();
	}

	public static void searchByCityState() {
		System.out.println("The test searchByCityState method has run.");
		continueMethod();
	}

	public static void showAll() {
		System.out.println("The test showAll method has run.");
		continueMethod();
	}

	public static void updateEntry() {
		System.out.println("The test updateEntry method has run.");
	}

	public static void continueMethod() {
		System.out.print("would you like to return to the main menu? (Y/N)");
		String yesOrNo = Index.in.next();
		if (yesOrNo.equalsIgnoreCase("y"))
			mainMenu();
		else
			System.out.println("Goodbye!");
	}
}
