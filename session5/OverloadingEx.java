package session5;

public class OverloadingEx {
	int c;
	public void add(int a,int b) {
		c= a+b;
		System.out.println("the value of integer c:"+c);
		
	}
	 public void add(float a,int b) {
		 float c= a+b;
		 System.out.println("the value of float c:"+c);
	 }
	 public void add(float a,double b) {
		 double c = a+b;
		 System.out.println("the value of double c:"+c);
	 }
	 public static void main(String[] args) {
		OverloadingEx ole = new OverloadingEx();
		ole.add(30,20);
		ole.add(32.5f,10);
		ole.add(10.54f, 12.25478);
	}//method same
	 //diff variable
	 //diff argu
	 
	 
}
