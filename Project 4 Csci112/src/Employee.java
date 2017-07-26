
/*
Name: Tyler Heavener
Current Date: 7/20/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
public class Employee {
	private String name;
	private String position;
	private String year;

	public Employee() {
		name = "";
		position = "";
		year = "";
	}

	public Employee(String name, String position, String year) {
		this.name = name;
		this.position = position;
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String getYear() {
		return year;
	}

	public String toString() {
		return "\nEmployee: " + name + "\nTheir Position: " + position + "\nYear joined: " + year;
	}

}
