package session5;

public class accessperson {
public static void main(String[] args) {
	//original person object
	Person originalPerson = new Person("Abhijith",24);
	//Copied Person object
	Person copiedPerson = new Person(originalPerson);//object dependency
	System.out.println("original Person:");
	originalPerson.displayInfo();
	System.out.println("Copied person:");
	copiedPerson.displayInfo();
}
	
	
	
	
	
	
}
