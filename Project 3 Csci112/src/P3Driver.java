/*
Name: Tyler Heavener
Current Date: 7/15/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
import java.lang.reflect.Array;
import java.util.Arrays;

public class P3Driver {

	public static void main(String[] args) {

		Enlisted en = new Enlisted();

		Military[] mil = new Military[7];


		mil[0] = new Enlisted("Rick", 141, "Walnut", "Ms", "Navy", 1, 2015);
		mil[1] = new Enlisted("James", 227, "Tupelo", "Ms", "Army", 3, 2010);
		mil[2] = new Enlisted("Bob", 353, "Oxford", "Ms", "Marines", 6, 1989);
		mil[3] = new Warrant("Frank", 490, "Jackson", "Ms", "Air Force", 1, 2012);
		mil[4] = new Commissioned("Brian", 754, "Corinth", "Ms", "Navy", 1, 2011);
		mil[5] = new Commissioned("Tony", 421, "Forrest", "Ms", "Navy", 3, 2005);
		mil[6] = new Commissioned("Richard", 919, "Como", "Ms", "Army", 5, 1994);

		for (int i = 0; i < 7; i++) {
			System.out.println("\n"+ mil[i].printData(null));
			System.out.println("Monthly pay for " + mil[i].getName()+ " is $"  +mil[i].calculateMonthlyPay());
		}
		
		
//		System.out.println("\nMonthly pay for " + mil[0].getName()+ " is $"  +mil[0].calculateMonthlyPay());
//		System.out.println("Monthly pay for " + mil[1].getName()+ " is $"  +mil[1].calculateMonthlyPay());
//		System.out.println("Monthly pay for " + mil[2].getName()+ " is $"  +mil[2].calculateMonthlyPay());
//		System.out.println("Monthly pay for " + mil[3].getName()+ " is $"  +mil[3].calculateMonthlyPay());
//		System.out.println("Monthly pay for " + mil[4].getName()+ " is $"  +mil[4].calculateMonthlyPay());
//		System.out.println("Monthly pay for " + mil[5].getName()+ " is $"  +mil[5].calculateMonthlyPay());
//		System.out.println("Monthly pay for " + mil[6].getName()+ " is $"  +mil[6].calculateMonthlyPay());
		
		
		

	}

}
