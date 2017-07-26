/*
Name: Tyler Heavener
Current Date: 7/15/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
public class SoldierInfo {
	private String name;
	private int ID;
	private String city;
	private String state;

	public SoldierInfo() {
		name = "";
		ID = 0;
		city = "";
		state = "";
	}

	public SoldierInfo(String name, int ID, String city, String state) {
		this.name = name;
		this.ID = ID;
		this.city = city;
		this.state = state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
}
