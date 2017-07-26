import java.util.ArrayList;
import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		Random rand = new Random();

		int[][] doubArray = new int[12][8];
		// Insert random umbers
		for (int row = 0; row < doubArray.length; row++) {
			for (int col = 0; col < doubArray[row].length; col++) {
				doubArray[row][col] = rand.nextInt(18) + 1;
			}
		}
		System.out.println("This is for the 2d array");
		// Prints out the grid
		for (int row = 0; row < doubArray.length; row++) {
			for (int col = 0; col < doubArray[row].length; col++)
				System.out.print(doubArray[row][col] + " ");
			System.out.println();
		}
		// sum of 2darray
		int sum = 0;

		for (int row = 0; row < doubArray.length; row++) {
			for (int col = 0; col < doubArray[row].length; col++)
				sum += doubArray[row][col];
		}
		System.out.println(sum);

		// ArrayList
		System.out.println("This is for the ArrayList");

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
			list.add(rand.nextInt(10));
		}
		// display size of array
		System.out.println("The size of the array is " + list.size());
		// display numbers in list
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		list.remove(2);
		list.remove(5);
		list.remove(8);
		list.add(3, 4);
		System.out.println("The size of the array is " + list.size());

	}
}
