package phonebook;

public class Address {
	private String streetAddress;
	private String state;
	private String city;
	private String zipcode;
	
	//default constructor
	public Address() {
		super();
	}
	//parameterized constructor
	public Address(String city, String state, String zipcode, String streetAddress) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	//generate getters and setters
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
}
