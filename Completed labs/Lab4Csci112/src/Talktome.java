import java.util.Scanner;

public class Talktome {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me a sentence without any puncuation!");
		String sent = keyboard.nextLine();
		
		sent.toLowerCase();
		String replace1 = sent.replaceAll("t", "d");
		String replace2 = replace1.replaceAll("T", "d");
		System.out.println(replace2);
		System.out.println(" ");
		
		String replaceE = sent.replaceAll("e", "i");
		String replaceE2 = replaceE.replaceAll("E", "i");
		System.out.println(replaceE2);
		System.out.println(" ");
		
		String[] token = sent.split(" ");
		for(String s: token) {
			System.out.println(s);
		}
		System.out.println(" ");
		System.out.println("Magic lettering code! ");
		for(int i = 0; i < token.length; i++ ) {
			System.out.println(token[i].charAt(0));
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("You");
		sb.append(" can");
		sb.append(" a");
		sb.append(" lot");
		sb.append(" just");
		sb.append(" by");
		sb.append(" watching");
		
		System.out.println(sb);
		
		sb.insert(7, " observe");
		
		System.out.println(sb);
		
		sb.delete(0,4);
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		
	}

}
