
public class Fruit extends Food {
	String name;

	public Fruit() {
		name = "";
	}
	public Fruit(String name) {
		this.name = name;
	}

	public String howToEat(boolean eat) {
		if(eat) {
			return "Bite dat thing";
		}
		else
			return "Peel it";
	}

	public String Dessert(boolean cake) {
		if(cake) {
			return "Sweet";
		}
		else
			return "will not satisfy sweet tooth";
	}

	public String juiceIt(boolean drink) {
		if(drink) {
			return "can crush and drink";
		}
		else
			return "do not drink it";
	}

	public String treeOrBush(boolean tree) {
		if(tree) {
			return "from tree";
		}
		else
			return "from bush";
	}

	public void eatFruit() {
		switch (name.charAt(0)) {
		case 'a':
		case 'A':
		case 'p':
		case 'P':
			System.out.println(howToEat(true));
			System.out.println(Dessert(true));
			System.out.println(juiceIt(true));
			System.out.println(treeOrBush(true));
			break;
		case 'b':
		case 'B':
		case 'o':
		case 'O':
			System.out.println(howToEat(false));
			System.out.println(Dessert(true));
			System.out.println(juiceIt(true));
			System.out.println(treeOrBush(true));
			break;
		default:
			System.out.println("Is that is a fruit?");
			break;
		}
	}

}
