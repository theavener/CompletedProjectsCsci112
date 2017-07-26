/*
Name: Tyler Heavener
Current Date: 7/11/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
import java.text.DecimalFormat;

public class Bakery {
	private int counter = 0;
	private Merchandise[] merc = new Merchandise[20];
	private String bName;
	DecimalFormat decForm = new DecimalFormat("#0.00");

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
			System.out.println(merc[i].toString());
		}
	}

	public void printOvercost() {
		for (int i = 0; i < counter; i++) {
			if (merc[i].getprice() > 25) {
				System.out.println(merc[i].toString());
			}

		}
	}

	public void SelectionG1() {
		Merchandise temp = new Merchandise();
		for (int i = 0; i < counter - 1; i++) {
			double currentMin = merc[i].getprice();
			int currentIndex = i;
			for (int innerLoop = i + 1; innerLoop < counter; innerLoop++) {
				if (currentMin > merc[innerLoop].getprice()) {
					currentMin = merc[innerLoop].getprice();
					currentIndex = innerLoop;
				}
			}
			if (currentIndex != i) {
				temp = merc[currentIndex];
				merc[currentIndex] = merc[i];
				merc[i] = temp;
			}

		}

	}

	public String toString() {
		return (bName);
	}

	public void printMerc1() {
		System.out.println(merc[0].toString());
		System.out.println(merc[1].toString());
		System.out.println(merc[2].toString());
		System.out.println(merc[3].toString());
		System.out.println(merc[4].toString());
		double sum = merc[0].getprice() + merc[1].getprice() + merc[2].getprice() + merc[3].getprice() + merc[4].getprice();
		double avg = sum / 5;
		System.out.println("Average cost for this store is: " + decForm.format(avg));
		System.out.println(" ");
	}

	public void printMerc2() {
		System.out.println(merc[5].toString());
		System.out.println(merc[6].toString());
		System.out.println(merc[7].toString());
		System.out.println(merc[8].toString());
		System.out.println(merc[9].toString());
		double sum = merc[5].getprice() + merc[6].getprice() + merc[7].getprice() + merc[8].getprice() + merc[9].getprice();
		double avg = sum / 5;
		System.out.println("Average cost for this store is: " + decForm.format(avg));
		System.out.println(" ");
	}

	public void printMerc3() {
		System.out.println(merc[10].toString());
		System.out.println(merc[11].toString());
		System.out.println(merc[12].toString());
		System.out.println(merc[13].toString());
		System.out.println(merc[14].toString());
		double sum = merc[10].getprice() + merc[11].getprice() + merc[12].getprice() + merc[13].getprice() + merc[14].getprice();
		double avg = sum / 5;
		System.out.println("Average cost for this store is: " + decForm.format(avg));
		System.out.println(" ");
	}

	public void printMerc4() {
		System.out.println(merc[15].toString());
		System.out.println(merc[16].toString());
		System.out.println(merc[17].toString());
		System.out.println(merc[18].toString());
		System.out.println(merc[19].toString());
		double sum = merc[15].getprice() + merc[16].getprice() + merc[17].getprice() + merc[18].getprice() + merc[19].getprice();
		double avg = sum / 5;
		System.out.println("Average cost for this store is: " + decForm.format(avg));
		System.out.println(" ");
	}
	
}
