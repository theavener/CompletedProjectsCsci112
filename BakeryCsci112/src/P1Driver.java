/*
Name: Tyler Heavener
Current Date: 7/6/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
import java.text.DecimalFormat;

public class P1Driver {

	public static void main(String[] args) {

		double total = 0;
		double avg;
		Bakery bak = new Bakery("Rick James' dough house");
		System.out.println("Welcome to " + bak.getbName() + " come get some delicous warm pastries!\n");

		String[] name = { "Croissant", "Conversation", "Berliner", "Conejito", "Banitsa" };
		double[] price = { 2.99, 5.99, 4.99, 4.99, 8.99 };
		String[] description = { "A buttery flaky bread named for its distinctive crescent shape.",
				"A patisserie developed in the late 18th century that is made with puff pastry, filled with a frangipane cream, and topped with royal icing.",
				"A Berliner Pfannkuchen is a traditional North German pastry similar to a doughnut with no central hole made from sweet yeast dough fried in fat or oil, with a marmalade or jam filling and usually icing, powdered sugar or conventional sugar on top.",
				"Similar to berliner but baked in the oven, not fried.",
				"Prepared by layering a mixture of whisked eggs and pieces of cheese between filo pastry, which is then baked in an oven price" };

		for (int i = 0; i < 5; i++) {
			bak.addMerchandise(name[i], price[i], description[i]);
			total += price[i];
		}
		avg = total / price.length;

		DecimalFormat decForm = new DecimalFormat("#0.##");

		bak.printMerchandise();
		System.out.println("The average price of our " + price.length + " items is: $" + decForm.format(avg));
		System.out.println("Thank you for shopping with us today! We hope you had a wonderful time!");

	}

}
