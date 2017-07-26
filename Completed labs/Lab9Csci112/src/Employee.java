
public class Employee {

	private String name;
	private int age;

	public Employee() {
		name = "";
		age = 0;
	}

	public Employee(String na, int ag) {
		name = na;
		age = ag;
	}

	public void setName(String na) {
		name = na;
	}

	public void setAge(int ag) {
		age = ag;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return ("Employees name: " + name + "\nAge: " + age);
	}

	
}
