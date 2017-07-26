
public class Bakery {
	private int counter = 0;
	private Merchandise[] merc = new Merchandise[10];
	private String bName;

	public Bakery() {
		bName = "";
	}

	public Bakery(String bName) {
		this.bName = bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbName() {
		return bName;
	}

	public String getMname(int i) {
		return merc[i].getname();
	}

	public double getMprice(int i) {
		return merc[i].getprice();
	}

	public String getMdescription(int i) {
		return merc[i].getdescription();
	}

	public void addMerchandise(String name, double price, String description) {
		merc[counter] = new Merchandise(name, price, description);
		counter++;
	}

	public void printMerchandise() {
		for (int i = 0; i < counter; i++) {
			System.out.println(merc[i].getname());
			System.out.println(merc[i].getdescription());
			System.out.println("$" + merc[i].getprice());
			System.out.println("");
		}
	}
}
