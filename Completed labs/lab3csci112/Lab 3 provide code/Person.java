
public class Person {

	private String name;
	private int id;
	private int age;

	public Person() {
		name = "";
		id = 0;
		age = 0;
	}

	public Person(String name, int Id, int Age) {
		this.name = name;
		id = Id;
		age = Age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int Id) {
		id = Id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int Age) {
		age = Age;
	}

	public String toString() {

		String str = "Name of person: " + name + "\n Their ID number: " + id + "\n Person's age: " + age + "\n";
		return str;
	}
}
