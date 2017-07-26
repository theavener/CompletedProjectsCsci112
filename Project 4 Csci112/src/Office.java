/*
Name: Tyler Heavener
Current Date: 7/20/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
import java.util.ArrayList;

public class Office {
	private String oName;
	private String date;
	private static ArrayList<Employee> emp = new ArrayList<Employee>();
	Employee em = new Employee();

	public Office() {
		oName = "";
		date = "";
	}

	public Office(String oName, String date) {
		this.oName = oName;
		this.date = date;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getoName() {
		return oName;
	}

	public String getDate() {
		return date;
	}

	public void addEmployee(String name, String Position, String year) {
		emp.add(new Employee(name, Position, year));
	}

	public ArrayList<Employee> geteName() {
		return this.geteName();
	}

	public ArrayList<Employee> getePosition() {
		return this.getePosition();
	}

	public ArrayList<Employee> geteYear() {
		return this.geteYear();
	}

	public static void searchEmployee(String name, String nname) { /// one to test
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getName().equalsIgnoreCase(name)) {
				emp.get(i).setName(nname);
			}

		}
	}

	public static void changePosition(String name, String nname) { /// one to test
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getPosition().equalsIgnoreCase(name)) {
				emp.get(i).setPosition(nname);
			}

		}
	}

	public static void changeYear(String name, String nname) { /// one to test
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getYear().equalsIgnoreCase(name)) {
				emp.get(i).setYear(nname);
			}

		}
	}

	public void printData() {
		System.out.println("Office Location: " + oName + "\nDate Created: " + date);
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i).toString());
		}
	}
}