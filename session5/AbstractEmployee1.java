package session5;

public class AbstractEmployee1 extends AbstractEmployeeEx {
	 
	public void Futuredesignation() {
		System.out.println("full stack student");
	}
	public static void main(String[] args) {
		AbstractEmployee1 ae = new  AbstractEmployee1();
		ae.name();
		ae.designation();
		ae.Futuredesignation();
		
		
	}
  
}
