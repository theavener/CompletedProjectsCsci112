
public class Person {
	private String name;
	private int age;
	private String homeTown;
	
	public Person(){
		name = "";
		age = 0;
		homeTown = "";
	}
	public Person(String name, int age, String homeTown){
		this.name = name;
		this.age = age;
		this.homeTown = homeTown;
	}
	public void setname(String name){
		this.name= name;
	}
	public void setage(int age){
		this.age = age;
	}
	public void sethomeTown(String homeTown){
		this.homeTown = homeTown;
	}
	public String getname(){
		return name;
	}
	public int getage(){
		return age;
	}
	public String gethomeTown(){
		return homeTown;
	}
}
