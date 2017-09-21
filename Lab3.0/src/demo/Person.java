package demo;


public class Person {
	static int current_year = 2017;
	private String name;
	private int birthdate;
	private int age;
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;
		this.birthdate = bdate;
	}

	
	public void reset_birthday(int year){
		birthdate = year;
	}
	
	//displays all the information about the person
	public void display_name_birthday_age(){
		System.out.println("This is " + name);
		
		System.out.println("I was born in " + birthdate);
		
		age = current_year - birthdate;
		System.out.println("I am " + age + " years old ");
		
		display_senior_status();
	}

	//displays whether or not the person is classified as a senior
	public void display_senior_status() {
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.display_name_birthday_age();
		
		
	}

}
