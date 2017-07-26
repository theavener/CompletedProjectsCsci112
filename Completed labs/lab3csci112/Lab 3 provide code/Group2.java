import java.util.ArrayList;

public class Group2 {

	private ArrayList<Person> people2 = new ArrayList<Person>();
	private String groupName2;

	public Group2(String name) {
		groupName2 = name;
	}

	public void addPerson(String name, int id, int age) {
		people2.add(new Person(name, id, age));
	}

	public void PrintGroup2() {
		System.out.println("Group 1's name is: " + groupName2);
		// TO DO iterate through the arraylist and use the toString method to
		// output the data held within the arraylist
		for (int i = 0; i < people2.size(); i++) {
			System.out.println(people2.get(i).toString());
		}

	}

	// TO DO create an selection sort method that sorts the global arraylist
	public void SelectionG2() {
		Person temp = new Person();
		for (int i = 0; i < people2.size() - 1; i++) {
			int currentMin = people2.get(i).getAge();
			int currentIndex = i;
			for (int innerLoop = i + 1; innerLoop < people2.size(); innerLoop++) {
				if (currentMin > people2.get(innerLoop).getAge()) {
					currentMin = people2.get(innerLoop).getAge();
					currentIndex = innerLoop;
					}
				}
			if (currentIndex != i) {
				temp = people2.get(currentIndex);
				people2.set(currentIndex, people2.get(i));
				people2.set(i, temp);
			}

		}
	}
}
