package FileIO;

public class Employee 
{
	private Integer id;
	private String firstName;
	private String lastName;
	private String location;

	@Override
	public String toString() {
		return id + " " + firstName
				+ " " + lastName + " " + location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
