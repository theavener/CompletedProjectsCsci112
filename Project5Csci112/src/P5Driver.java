/*
Name: Tyler Heavener
Current Date: 7/25/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P5Driver {

	public static void main(String[] args) throws IOException {
		Scanner scan = null;
		Marathon mar = new Marathon();

		try {
			scan = new Scanner(new File("contestants.txt"));
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				if (tokens.length == 2) {
					mar.addContestant(tokens[0], tokens[1]);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("The File Was Not Found");
		}

		finally {
			scan.close();
		}
		try {
			scan = new Scanner(new File("donations.txt"));
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				if (tokens.length == 2) {
					Double d = new Double(tokens[1]);
					mar.addMoney(tokens[0], d);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("The File Was Not Found");
		}

		finally {
			scan.close();
		}

		mar.printData();
		System.out.println();
		System.out.println("#################   Data is now sorted   ######################");
		System.out.println();
		mar.sort();
		System.out.println();
		mar.printData();
		System.out.println();
		mar.printTotal();
		System.out.println();
		mar.reward();
		mar.createFile();
		
		
	}

}
