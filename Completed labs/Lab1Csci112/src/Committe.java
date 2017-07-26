
public class Committe {
	private String cName;
	private int counter = 0;
	private Person[] per = new Person[40];

	public Committe(){
		cName = "";
	}
	public Committe(String cName){
		this.cName = cName;
	}
	public String getname(int index){
		return per[index].getname();
	}
	public void addPersons(String name, int age, String homeTown){
		per[counter] = new Person(name, age, homeTown);
		counter++;
	}
}
