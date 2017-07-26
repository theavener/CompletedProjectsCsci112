/*
Name: Tyler Heavener
Current Date: 7/25/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/
public class Contestant {
	private String name;
	private String ID;
	private double mraised;

	public Contestant() {
		name = "";
		ID = "";
		mraised = 0.0;
	}

	public Contestant(String name, String ID) {
		this.name = name;
		this.ID = ID;
		this.mraised = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getMraised() {
		return mraised;
	}

	public void setMraised(double mraised) {
		this.mraised = mraised;
	}

	public String toString() {
		return "\nContestant: " + name + "\nTheir ID: " + ID + "\nMoney Raised: " + mraised;
	}
}
