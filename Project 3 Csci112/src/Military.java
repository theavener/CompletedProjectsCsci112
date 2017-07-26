/*
Name: Tyler Heavener
Current Date: 7/15/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
public class Military {
	String branch;
	public static final int CYEAR = 2017;
	protected int bPay = 1550;
	SoldierInfo sold = new SoldierInfo();


	public Military() {
		branch = "";
	}

	public Military(String branch) {
		this.branch = branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public int calculateMonthlyPay() {
		return bPay;
	}

	public String printData(String s) {
		return s;
	}
	public String getName() {
		return sold.getName();
	}

}
