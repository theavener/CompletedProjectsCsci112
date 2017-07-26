/*
Name: Tyler Heavener
Current Date: 7/15/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
public class Warrant extends Military {

	int payGrade;
	int rank;
	int yJoined;
	int yService;
	SoldierInfo sold = new SoldierInfo();

	public Warrant() {
		payGrade = 0;
		rank = 0;
		yJoined = 0;
		yService = 0;
	}

	public Warrant(String name, int ID, String city, String state, String b, int rank, int yJoined) {
		super(b);
		sold.setName(name);
		sold.setID(ID);
		sold.setCity(city);
		sold.setState(state);
		yService = CYEAR - yJoined;
		this.rank = rank;
		this.yJoined = yJoined;
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

	// public void setpayGrade(int payGrade) {
	// this.payGrade = payGrade;
	// }

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setyJoined(int yJoined) {
		this.yJoined = yJoined;
	}

	public void setyService(int yService) {
		this.yService = yService;
	}

	// public int getpayGrade() {
	// return payGrade;
	// }

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
		int y;

		if (yService > 2) {
			y = ((CYEAR - yJoined) - 1) * 250;
			payGrade = bPay + y + 1368;
		} else {
			payGrade = bPay + 1368;
		}
		return payGrade;
	}

	public String printData(String s) {
		return "Warrant Officer's name: " + sold.getName() + "\nTheir ID: " + sold.getID() + "\nHometown: " + sold.getCity()
				+ "\nHome State: " + sold.getState() + "\nBranch: " + branch + "\nRank: W" + rank
				+ "\nYear they joined: " + yJoined;
	}

}
