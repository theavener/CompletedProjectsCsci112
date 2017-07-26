/*
Name: Tyler Heavener
Current Date: 7/11/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
import java.text.DecimalFormat;

public class P2Driver {

	public static void main(String[] args) {
		Company com = new Company("Rick James' dough house");
		Bakery bak = new Bakery();
		Company bak2 = new Company();

		bak2.addBakery("Tupelo");
		bak2.addBakery("Walnut");
		bak2.addBakery("Oxford");
		bak2.addBakery("Corinth");

		String[] name = { "Croissant", "Conversation", "Berliner", "Conejito", "Banitsa", "Croissant", "Conversation",
				"Berliner", "Conejito", "Banitsa", "Croissant", "Conversation", "Berliner", "Conejito", "Banitsa",
				"Croissant", "Conversation", "Berliner", "Conejito", "Banitsa" };
		double[] price = { 2.99, 5.99, 4.99, 4.99, 8.99, 6.99, 5.99, 3.22, 7.55, 8.19, 7.99, 16.99, 8.98, 14.50, 19.19,
				25.99, 16.56, 8.98, 22.59, 24.99 };
		String[] description = { "A buttery flaky bread named for its distinctive crescent shape.",
				"A patisserie developed in the late 18th century that is made with puff pastry, filled with a frangipane cream, and topped with royal icing.",
				"A Berliner Pfannkuchen is a traditional North German pastry similar to a doughnut with no central hole made from sweet yeast dough fried in fat or oil, with a marmalade or jam filling and usually icing, powdered sugar or conventional sugar on top.",
				"Similar to berliner but baked in the oven, not fried.",
				"Prepared by layering a mixture of whisked eggs and pieces of cheese between filo pastry, which is then baked in an oven price",
				"A buttery flaky bread named for its distinctive crescent shape.",
				"A patisserie developed in the late 18th century that is made with puff pastry, filled with a frangipane cream, and topped with royal icing.",
				"A Berliner Pfannkuchen is a traditional North German pastry similar to a doughnut with no central hole made from sweet yeast dough fried in fat or oil, with a marmalade or jam filling and usually icing, powdered sugar or conventional sugar on top.",
				"Similar to berliner but baked in the oven, not fried.",
				"Prepared by layering a mixture of whisked eggs and pieces of cheese between filo pastry, which is then baked in an oven price",
				"A buttery flaky bread named for its distinctive crescent shape.",
				"A patisserie developed in the late 18th century that is made with puff pastry, filled with a frangipane cream, and topped with royal icing.",
				"A Berliner Pfannkuchen is a traditional North German pastry similar to a doughnut with no central hole made from sweet yeast dough fried in fat or oil, with a marmalade or jam filling and usually icing, powdered sugar or conventional sugar on top.",
				"Similar to berliner but baked in the oven, not fried.",
				"Prepared by layering a mixture of whisked eggs and pieces of cheese between filo pastry, which is then baked in an oven price",
				"A buttery flaky bread named for its distinctive crescent shape.",
				"A patisserie developed in the late 18th century that is made with puff pastry, filled with a frangipane cream, and topped with royal icing.",
				"A Berliner Pfannkuchen is a traditional North German pastry similar to a doughnut with no central hole made from sweet yeast dough fried in fat or oil, with a marmalade or jam filling and usually icing, powdered sugar or conventional sugar on top.",
				"Similar to berliner but baked in the oven, not fried.",
				"Prepared by layering a mixture of whisked eggs and pieces of cheese between filo pastry, which is then baked in an oven price" };

		for (int i = 0; i < 20; i++) {
			bak.addMerchandise(name[i], price[i], description[i]);
		}
		System.out.println("Welcome to the wonderful chain of " + com.getcName());
		
		bak2.printBakery1();
		bak.printMerc1();

		bak2.printBakery2();
		bak.printMerc2();

		bak2.printBakery3();
		bak.printMerc3();

		bak2.printBakery4();
		bak.printMerc4();


		System.out.println("############## Delicious goodness sorted by price ########");
		System.out.println(" ");

		bak.SelectionG1();

		System.out.println(" ");
		System.out.println("Out of all the items this is the one that is over $25!");
		bak.printOvercost();
		
		bak2.printBakery();
		bak2.sizeBakery();

		bak2.printBakery1();
		bak.printMerc1();

		bak2.printBakery2();
		bak.printMerc2();

		bak2.printBakery3();
		bak.printMerc3();

		bak2.printBakery4();
		bak.printMerc4();
		System.out.println(" ");
		System.out.println("Out of all the items this is the one that is over $25! It is at the Corinth location");
		bak.printOvercost();

	}

}
