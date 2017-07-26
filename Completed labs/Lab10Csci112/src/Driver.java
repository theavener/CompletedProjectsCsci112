import java.util.ArrayList;


public class Driver {

	public static void main(String[] args) {
		Node<Integer> number = new Node<Integer>();
		number.setGener(5);
		Node<String> word = new Node<String>("bob");
		Node<Double> twonum = new Node<Double>(3.34);
		Node<Object> oj = new Node<Object>("Steve");
		
		ArrayList<Node<Object>> nodelist = new ArrayList<Node<Object>>();
		nodelist.add(new Node<Object>(8));
		nodelist.add(new Node<Object>("Dan"));
		
		System.out.println(number.toString());
		System.out.println(word.toString());
		System.out.println(twonum.toString());
		System.out.println(oj.toString());
		System.out.println(nodelist.toString());
	}

}
