/*
Name: Tyler Heavener
Current Date: 7/20/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/ 
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P4Driver {

	public static void main(String[] args) {
		int choice = 0;
		String change = "";
		Scanner keyboard = new Scanner(System.in);
		Scanner scan = null;
		ArrayList<Office> os = new ArrayList<Office>();
		Office of = new Office();// might have to remove this

		try {
			scan = new Scanner(new File("StandardElectric.txt"));
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				if (tokens.length == 2) {
					os.add(new Office(tokens[0], tokens[1]));
				} else {
					os.get(os.size() - 1).addEmployee(tokens[0], tokens[1], tokens[2]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("The File Was Not Found");
		}

		finally {
			scan.close();
		}
		for (int i = 0; i < os.size(); i++) {
			os.get(i).printData();
			System.out.println("");
		}
		System.out.println("****************************************");
		System.out.println("Coolest Company you wish you worked for!");
		System.out.println("****************************************");
		do {
			System.out.println(
					"You can pick any of the below choices or enter -1 to exit\r\n" + "1.  Print all of the Data\r\n"
							+ "2.  Change an Office location.\r\n" + "3.  Change an Office opening date\r\n"
							+ "4.  Change an Employees name\r\n" + "5.  Change an Employees position\r\n"
							+ "6.  Change an Employees start year at an Office\r\n" + "7.  Exit");
			System.out.println("Enter your choice: ");
			choice = keyboard.nextInt();
			// keyboard.nextInt(); //clearing the buffer

			if (choice > 0 && choice <= 7) { // Makes you input 1-7 or it tells you that it is invalid
				switch (choice) { // This part of the code is for each option in the menu
				case 1:
					for (int i = 0; i < os.size(); i++) {
						os.get(i).printData();
						System.out.println("");
					}
					System.out.println("All the data has been printed.\n");
					break;
				case 2:
					System.out.println("Which office location would you like to change?");
					change = keyboard.next();
					for (int i = 0; i < os.size(); i++) { // get index of what youre looking for
						if (os.get(i).getoName().equalsIgnoreCase(change)) {

							System.out.println("What would you like to change it to?");
							change = keyboard.next();
							os.get(i).setoName(change);

							break;
						} else {
							System.out.println("Nothing Matches");
							break;
						}
					}

					break;
				case 3:
					System.out.println("Which office opening date would you like to change?");

					change = keyboard.next();
					for (int i = 0; i < os.size(); i++) { // get index of what youre looking for
						if (os.get(i).getDate().equalsIgnoreCase(change)) {

							System.out.println("What would you like to change it to?");
							change = keyboard.next();
							os.get(i).setDate(change);

							break;
						} else {
							System.out.println("Nothing Matches");
							break;
						}
					}

					break;
				case 4:
					System.out.println("Which employee name would you like to change?");
					keyboard.nextLine();
					change = keyboard.nextLine();

					System.out.println("what would you like to change it to?");
					String change2 = keyboard.nextLine();
					Office.searchEmployee(change, change2);

					break;
				case 5:
					System.out.println("Which employee position would you like to change?");
					keyboard.nextLine();
					change = keyboard.nextLine();
					System.out.println("what would you like to change it to?");
					String change3 = keyboard.nextLine();
					Office.changePosition(change, change3);

					break;
				case 6:
					System.out.println("Which employee start year would you like to change?");
					keyboard.nextLine();
					change = keyboard.nextLine();
					System.out.println("what would you like to change it to?");
					String change4 = keyboard.nextLine();
					Office.changeYear(change, change4);

					break;
				case 7:
					System.out.println("Exit");
					System.out.println("----\n");
					System.out.println("You selected to exit this system.\nThank You!");
					break;
				default:
				}
			} else {
				System.out.println(choice + " is an INVALID CHOICE!");
			}

		} while (choice != 7);
	}

}
