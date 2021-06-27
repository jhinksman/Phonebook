package phonebook;

public class Person extends Address{
	private String firstName;
	private String midName;
	private String lastName;
	private long phone;
	
	//default constructor
	public Person() {
		super();
	}

	//parameterized constructor
	//since we're extending the address class, we can pass those parameters in this constructor
	//but we have to pass them to the super as well
	public Person(String firstName, String midName, String lastName, String streetAddress, String city, String state, String zipCode, long phone) {
		super(city, state, zipCode, streetAddress);
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	//generate getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMidName() {
		return midName;
	}
	
	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	//John Doe, 114 Market St, St Louis, MO, 63403, 6366435698 
	@Override
	public String toString() {
		//don't print midName if user doesn't have one
		return "Person: " + firstName + " " + midName+ " "+ lastName + ", " + getStreetAddress() + ", " + getCity() + ", " + getState()
				+ ", " + getZipcode() + ", " + phone;
	}
	
	
	
}
