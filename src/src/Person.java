package src;

public class Person {
	static int current_year = 2017;
	private String name;
	private int birth_date;
	private int age;
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;
		this.birth_date = bdate;
	}
	
	public void reset_birthday(int year){
		birth_date = year;
	}
	
	public void display_name(){
		System.out.println("This is " + name);
		//Prints name of Person
	}
	
	public void display_birthday(){
		//Prints year of birth for Person
		System.out.printf("I was born in %d. ",birth_date);
	}
	
	public void display_age(){
		//Calculates age
		age = current_year - birth_date;
		System.out.printf("I am %d years old ",age);
	}
	
	public void medicare_eligible() {
		//Checks for medicare eligibility.
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}
	
	public void personal_info(Person n) {
		//One method combining all methods to print personal info 
		n.display_name();
		n.display_birthday();
		n.display_age();
		n.medicare_eligible();	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.personal_info(John);
		
	}

}
