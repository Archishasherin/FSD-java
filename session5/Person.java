package session5;

public class Person {
	
	private String name;
	private int age;
	//regular constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	//copy constructor
	public Person(Person other ) {
		this.name = other.name;
		this.age = other.age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//method to display person details
	 public void displayInfo() {
	    	System.out.println("name:"+name+",Age:"+age);
	    }
}
