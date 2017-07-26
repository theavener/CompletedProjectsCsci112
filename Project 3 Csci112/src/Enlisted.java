/*
Name: Tyler Heavener
Current Date: 7/15/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
public class Enlisted extends Military {

	int payGrade;
	int rank;
	int yJoined;
	int yService;

	SoldierInfo sold = new SoldierInfo();

	public Enlisted() {
		payGrade = 0;
		rank = 0;
		yJoined = 0;
		yService = 0;
	}

	public Enlisted(String name, int ID, String city, String state, String b, int rank, int yJoined) {
		super(b);
		sold.setName(name);
		sold.setID(ID);
		sold.setCity(city);
		sold.setState(state);
		this.rank = rank;
		this.yJoined = yJoined;
		yService = CYEAR - yJoined;
	}
	
	public String getName() {
		return sold.getName();
	}
	public int getID() {
		return sold.getID();
	}

	public String getCity() {
		return sold.getCity();
	}

	public String getState() {
		return sold.getCity();
	}
	
	public void setpayGrade(int payGrade) {
		this.payGrade = payGrade;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setyJoined(int yJoined) {
		this.yJoined = yJoined;
	}

	public void setyService(int yService) {
		this.yService = yService;
	}

	public int getpayGrade() {
		return payGrade;
	}

	public int getRank() {
		return rank;
	}

	public int getyJoined() {
		return yJoined;
	}

	public int yService() {
		return yService;
	}

	public int calculateMonthlyPay() {
		int v,y2,y, f;

		v = rank * 150;
		y = yService;

		if (rank >= 5 && y > 2) {
			y2 = (y - 2) * 200;
			f = bPay + v + y2;
		} else {
			f = bPay + v;
		}
		return f;
	}

	public String printData(String s) {
		return "Enlisted soldiers name: " + sold.getName() + "\nTheir ID: " + sold.getID() + "\nHometown: " + sold.getCity()
				+ "\nHome State: " + sold.getState() + "\nBranch: " + branch + "\nRank: E" + rank
				+ "\nYear they joined: " + yJoined;
	}
}
