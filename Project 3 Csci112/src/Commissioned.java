/*
Name: Tyler Heavener
Current Date: 7/15/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
public class Commissioned extends Military {

	int payGrade;
	int rank;
	int yJoined;
	int yService;
	SoldierInfo sold = new SoldierInfo();

	public Commissioned() {
		payGrade = 0;
		rank = 0;
		yJoined = 0;
		yService = 0;
	}

	public Commissioned(String name, int ID, String city, String state, String b, int rank, int yJoined) {
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
		int v, y, f;

		v = rank * 450;
		if (yService > 2) {
			y = ((CYEAR - yJoined) - 1) * 300;
			f = bPay + y + v + 1400;
		} else {
			f = bPay + v + 1400;
		}
		return f;
	}

	public String printData(String s) {
		return "Commissioned Officer's name: " + sold.getName() + "\nTheir ID: " + sold.getID() + "\nHometown: " + sold.getCity()
				+ "\nHome State: " + sold.getState() + "\nBranch: " + branch + "\nRank: O" + rank
				+ "\nYear they joined: " + yJoined;
	}
}
