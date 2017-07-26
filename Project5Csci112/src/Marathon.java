/*
Name: Tyler Heavener
Current Date: 7/25/2017
Sources Consulted: 
By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the “M” book.
*/
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Marathon {

	private static ArrayList<Contestant> cont = new ArrayList<Contestant>();

	public void addContestant(String name, String ID) {
		cont.add(new Contestant(name, ID));
	}

	public void printData() {
		for (int i = 0; i < cont.size(); i++) {
			System.out.println(cont.get(i).toString());
		}
	}

	public void addMoney(String ID, double mraised) {
		for (int i = 0; i < cont.size(); i++) {
			if (cont.get(i).getID().equals(ID)) {
				cont.get(i).setMraised((mraised * 5) + cont.get(i).getMraised());
			}
		}
	}

	public void reward() {
		speedySpikes();
		tryHard();
		goodCause();
		participation();
	}
	public void speedySpikes() {
		System.out.println("Speedy Spike awards go to!");
		System.out.println("---------------------------");
		for (int i = 0; i < cont.size(); i++) {
			if(cont.get(i).getMraised() == cont.get(0).getMraised()) {
				System.out.println(cont.get(i).getName());
			}
		}
		System.out.println();
	}
	public void participation() {
		System.out.println("Participation awards go to!");
		System.out.println("---------------------------");
		for (int i = 0; i < cont.size(); i++) {
			if (cont.get(i).getMraised() <= 25) {
				System.out.println(cont.get(i).getName());
			}
		}
		System.out.println();
	}
	public void goodCause() {
		System.out.println("Good Cause awards go to!");
		System.out.println("---------------------------");
		for (int i = 0; i < cont.size(); i++) {
			if (cont.get(i).getMraised() <= 500 && cont.get(i).getMraised() > 25) {
				System.out.println(cont.get(i).getName());
			}
		}
		System.out.println();
	}
	public void tryHard() {
		System.out.println("Try Hard awards go to!");
		System.out.println("---------------------------");
		for (int i = 0; i < cont.size(); i++) {
			if (cont.get(i).getMraised() <= 1000 && cont.get(i).getMraised() > 500) {
				System.out.println(cont.get(i).getName());
			}
		}
		System.out.println();
	}
	

	public String printTotal() {
		double sum = 0;
		for (int i = 0; i < cont.size(); i++) {
			sum += cont.get(i).getMraised();
		}
		return "Total is " + sum;
	}

	public void quickSort(int min, int max) {
		int pivot;
		if (min < max) {
			pivot = partition(min, max);
			quickSort(min, (pivot - 1));
			quickSort((pivot + 1), max);
		}
	}

	public int partition(int min, int max) {

		double pivot = cont.get(min).getMraised(); 
		int left = min;
		int right = max;
		while (left < right) {
			while (cont.get(left).getMraised() >= pivot && left < right) {
				left++;
			}
			while (cont.get(right).getMraised() < pivot) {
				right--;
			}
			if (left < right) {
				swap(left, right);
			}
		}
		swap(min, right);

		return right;
	}

	public void swap(int left, int right) {
		Contestant temp = cont.get(left);
		cont.set(left, cont.get(right));
		cont.set(right, temp);
	}

	public void sort() {
		quickSort(0, cont.size()-1);
		
	}
	public void createFile() 
            throws IOException {
        FileWriter writer = new FileWriter("Write.txt", true);
        PrintWriter print = new PrintWriter("Write.txt");
        for (int i=0; i < cont.size(); i++) {
           print.println(cont.get(i).toString());
           print.println();
        }
        print.println(printTotal());
        print.close();
        }
	
}
//caanot call quick from driver