/*
Name: Tyler Heavener
Current Date: 7/11/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
import java.util.ArrayList;

public class Company {
	private String cName;
	private int counter = 0;
	private Bakery[] bak = new Bakery[4];
	private ArrayList<Bakery> bak2 = new ArrayList<Bakery>();
	
	
	public Company(){
		cName = "";
		}
	public Company(String cName){
		this.cName = cName;
	}
	public void setcName(String cName){
		this.cName = cName;
	}
	public String getcName(){
		return cName;
	}
	public String getBname(int i) {
		return bak[i].getbName();
	}
	public void addMerchandise(String name) {
		bak[counter] = new Bakery(name);
		counter++;
	}
	public void printBakery() {
		for (int i = 0; i < counter; i++) {
			System.out.println(bak[i].getbName());
		}
	}
	public void addBakery(String cName) {
		bak2.add(new Bakery(cName));
	}

	public void sizeBakery() {
		int size = bak2.size();
		System.out.println(size);
	}
	public void printBakery1() {
			System.out.println(bak2.get(0).toString());
	}
	public void printBakery2() {
		System.out.println(bak2.get(1).toString());
	}
	public void printBakery3() {
		System.out.println(bak2.get(2).toString());
	}
	public void printBakery4() {
		System.out.println(bak2.get(3).toString());
	}

}