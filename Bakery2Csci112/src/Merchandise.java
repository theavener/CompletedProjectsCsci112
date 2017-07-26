/*
Name: Tyler Heavener
Current Date: 7/11/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
public class Merchandise {
	private String name;
	private double price;
	private String description;

	public Merchandise() {
		name = "";
		price = 0;
		description = "";
	}

	public Merchandise(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public String getname() {
		return name;
	}

	public double getprice() {
		return price;
	}

	public String getdescription() {
		return description;
	}
	public String toString() {
	return ("Item: " + name + "\nDescriptin: " + description + "\nPrice: "+ price);
	}

}

