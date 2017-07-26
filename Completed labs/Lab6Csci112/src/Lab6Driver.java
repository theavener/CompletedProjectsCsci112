import java.util.Scanner;

public class Lab6Driver {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Give me some kind of fruit");
		
		
		String answer = keyboard.nextLine();
		
		Fruit fr = new Fruit(answer);
		
		
		
		fr.eatFruit();

	}

}
