
public class Group1 {

	private static int counter = 0;
	private Person[] people = new Person[10];
	private String groupName1;

	public Group1(String name) {
		groupName1 = name;
	}

	public void addPerson(String name, int id, int age) {
		people[counter] = new Person(name, id, age);
		counter++;
	}

	public void PrintGroup1() {
		System.out.println("Group 1's name is: " + groupName1);
		// TO DO iterate through the array and use the toString method to output
		// the data held within the Person array
		for (int i = 0; i < counter; i++) {
			System.out.println(people[i].toString());
		}
	}

	// TO DO create an insertion sort method that sorts the global array
	public void SelectionG1() {
		Person temp = new Person();
		for (int i = 0; i < counter - 1; i++) {
			int currentMin = people[i].getAge();
			int currentIndex = i;
			for (int innerLoop = i + 1; innerLoop < counter; innerLoop++) {
				if (currentMin > people[innerLoop].getAge()) {
					currentMin = people[innerLoop].getAge();
					currentIndex = innerLoop;
					}
			}
			if (currentIndex != i) {
				temp = people[currentIndex];
				people[currentIndex] = people[i];
				people[i] = temp;
			}

		}
		
	}

}
