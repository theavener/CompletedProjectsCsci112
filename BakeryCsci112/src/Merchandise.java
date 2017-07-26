
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

}
